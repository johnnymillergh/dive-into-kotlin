package com.jmsoftware.diveintokotlin.basicgrammar.service

import com.jmsoftware.diveintokotlin.basicgrammar.pojo.Country

/**
 * BasicGrammarService
 *
 * Change description here.
 * @author Johnny Miller (锺俊), email: johnnysviva@outlook.com
 * @date 12/4/19 9:36 AM
 **/
interface BasicGrammarService {
    /**
     * Get filtered countries
     * @return List<Country>
     */
    fun getFilteredCountries(): List<Country>

    /**
     * Iterate string
     * @param stringNeedsToBeIterated String
     * @return String
     */
    fun iterateString(stringNeedsToBeIterated: String): String

    /**
     * Get continent name by value
     * @param value Int
     * @return String
     */
    fun getContinentNameByValue(value: Int): String

    /**
     * Greet to a person
     * @param value Int
     * @param personName String
     * @return String
     */
    fun greet(value: Int, personName: String): String
}
