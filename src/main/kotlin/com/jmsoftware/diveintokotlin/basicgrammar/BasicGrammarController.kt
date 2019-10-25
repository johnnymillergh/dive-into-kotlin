package com.jmsoftware.diveintokotlin.basicgrammar

import com.github.javafaker.Faker
import com.jmsoftware.diveintokotlin.common.log
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

/**
 * BasicGrammarController
 *
 * Change description here.
 * @author Johnny Miller (锺俊), email: johnnysviva@outlook.com
 * @date 10/25/19 9:08 AM
 **/
@RestController
@RequestMapping("/basic-grammar")
class BasicGrammarController {
    val log = log<BasicGrammarController>()
    val faker = Faker(Locale("en-US"))

    /**
     * Filter countries.
     * @return List<Country> country list.
     */
    @RequestMapping("/filter-countries")
    fun filterCountries(): List<Country> {
        val countryList = mutableListOf<Country>()
        fillUpCountryList(countryList)
        return filterCountryList(countryList)
    }

    /**
     * Filter country list, keep the population is more than 3,000.
     * @param countryList MutableList<Country>
     * @return List<Country>
     */
    private fun filterCountryList(countryList: MutableList<Country>): List<Country> {
        return countryList.filter { country -> country.population > 3_000 }
    }

    /**
     * Fill up list of country with random data.
     * @param countryList MutableList<[ERROR : Country]> mutable country list.
     */
    private fun fillUpCountryList(countryList: MutableList<Country>) {
        val amount = Random().nextInt(10)
        log.info("Amount of country list: {}", amount)
        for (index in 1..amount) {
            val country = Country(faker.name().firstName(), faker.name().lastName(), amount * Random().nextInt(1000))
            countryList.add(country)
        }
        log.info("Generated country list: {}", countryList)
    }
}
