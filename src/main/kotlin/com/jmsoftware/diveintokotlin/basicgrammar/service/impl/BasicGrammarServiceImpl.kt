package com.jmsoftware.diveintokotlin.basicgrammar.service.impl

import com.github.javafaker.Faker
import com.jmsoftware.diveintokotlin.basicgrammar.BasicGrammarController
import com.jmsoftware.diveintokotlin.basicgrammar.enumeration.Continent
import com.jmsoftware.diveintokotlin.basicgrammar.pojo.Country
import com.jmsoftware.diveintokotlin.basicgrammar.service.BasicGrammarService
import com.jmsoftware.diveintokotlin.common.log
import org.springframework.stereotype.Service
import java.util.*

/**
 * BasicGrammarServiceImpl
 *
 * Change description here.
 * @author Johnny Miller (锺俊), email: johnnysviva@outlook.com
 * @date 12/4/19 9:38 AM
 **/
@Service
class BasicGrammarServiceImpl : BasicGrammarService {
    val log = log<BasicGrammarController>()
    val faker = Faker(Locale("en-US"))
    /**
     * Filter country list, keep the population is more than 3,000.
     * @param countryList MutableList<Country>
     * @return List<Country>
     */
    fun filterCountryList(countryList: MutableList<Country>): List<Country> {
        return countryList.filter { country -> country.population > 3_000 }
    }

    /**
     * Fill up list of country with random data.
     * @param countryList MutableList<[ERROR : Country]> mutable country list.
     */
    fun fillUpCountryList(countryList: MutableList<Country>) {
        val amount = Random().nextInt(10)
        log.info("Amount of country list: {}", amount)
        for (index in 1..amount) {
            val country = Country(faker.name().firstName(), faker.name().lastName(), amount * Random().nextInt(1000))
            countryList.add(country)
        }
        log.info("Generated country list: {}", countryList)
    }

    override fun getFilteredCountries(): List<Country> {
        val countryList = mutableListOf<Country>()
        fillUpCountryList(countryList)
        return filterCountryList(countryList)
    }

    override fun iterateString(stringNeedsToBeIterated: String): String {
        val contactingResult: String = """Iterated string:
                                       |$stringNeedsToBeIterated""".trimMargin()
        for (charactor in contactingResult) {
            log.info("charactor in contactingResult: {}", charactor)
        }
        return contactingResult
    }

    override fun getContinentNameByValue(value: Int): String {
        return Continent.getNameByValue(value)
    }

    override fun greet(value: Int, personName: String): String {
        val continent = Continent.getByValue(value)
        return continent?.greet(personName)!!
    }
}
