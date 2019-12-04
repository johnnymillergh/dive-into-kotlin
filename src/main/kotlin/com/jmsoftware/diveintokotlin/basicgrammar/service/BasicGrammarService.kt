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
    fun getFilteredCountries(): List<Country>
}
