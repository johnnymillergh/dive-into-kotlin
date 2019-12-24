package com.jmsoftware.diveintokotlin.basicgrammar.service

import com.jmsoftware.diveintokotlin.basicgrammar.Country

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
}
