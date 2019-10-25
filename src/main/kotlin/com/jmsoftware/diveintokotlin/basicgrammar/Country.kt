package com.jmsoftware.diveintokotlin.basicgrammar

/**
 * Country
 *
 * Change description here.
 * @author Johnny Miller (锺俊), email: johnnysviva@outlook.com
 * @date 10/25/19 9:08 AM
 **/
data class Country(
        /**
         * Name.
         */
        val name: String,
        /**
         * Continent.
         */
        val continent: String,
        /**
         * Population.
         */
        val population: Int
)
