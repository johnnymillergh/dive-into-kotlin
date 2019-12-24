package com.jmsoftware.diveintokotlin.basicgrammar.enumeration

/**
 * Greet
 *
 * Change description here.
 * @author Johnny Miller (锺俊), email: johnnysviva@outlook.com
 * @date 12/24/19 3:31 PM
 **/
interface Greet {
    /**
     * Greet to a specific person
     * @param personName String
     * @return String
     */
    fun greet(personName: String): String
}