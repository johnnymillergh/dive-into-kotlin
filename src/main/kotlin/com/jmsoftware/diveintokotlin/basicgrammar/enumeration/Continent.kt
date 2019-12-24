package com.jmsoftware.diveintokotlin.basicgrammar.enumeration

/**
 * Continent
 *
 * Change description here.
 * @author Johnny Miller (锺俊), email: johnnysviva@outlook.com
 * @date 12/24/19 3:00 PM
 **/
enum class Continent(
        /**
         * The name of continent.
         */
        val continentName: String,
        /**
         * The value.
         */
        val value: Int) {
    /**
     * Asia
     */
    ASIA("Asia", 0),
    /**
     * Africa
     */
    AFRICA("Africa", 1),
    /**
     * North America
     */
    NORTH_AMERICA("North America", 2),
    /**
     * South America
     */
    SOUTH_AMERICA("South America", 3),
    /**
     * Antarctica
     */
    ANTARCTICA("Antarctica", 4),
    /**
     * Europe
     */
    EUROPE("Europe", 5),
    /**
     * Australia
     */
    AUSTRALIA("Australia", 6);

    companion object {
        /**
         * Get the name by value
         * @param value Int
         * @return String
         */
        fun getNameByValue(value: Int): String {
            return when (value) {
                ASIA.value -> ASIA.continentName
                AFRICA.value -> AFRICA.continentName
                NORTH_AMERICA.value -> NORTH_AMERICA.continentName
                SOUTH_AMERICA.value -> SOUTH_AMERICA.continentName
                ANTARCTICA.value -> ANTARCTICA.continentName
                EUROPE.value -> EUROPE.continentName
                AUSTRALIA.value -> AUSTRALIA.continentName
                else -> throw IllegalArgumentException("""Cannot find continent by value: $value""")
            }
        }
    }


}