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
        val value: Int) : Greet {
    /**
     * Asia
     */
    ASIA("Asia", 0) {
        override fun greet(personName: String): String {
            return "你好来自亚洲！$personName"
        }
    },
    /**
     * Africa
     */
    AFRICA("Africa", 1) {
        override fun greet(personName: String): String {
            return "Hallo van Afrika! $personName"
        }
    },
    /**
     * North America
     */
    NORTH_AMERICA("North America", 2) {
        override fun greet(personName: String): String {
            return "Hello from North America! $personName"
        }
    },
    /**
     * South America
     */
    SOUTH_AMERICA("South America", 3) {
        override fun greet(personName: String): String {
            return "Hola desde sudamerica! $personName"
        }
    },
    /**
     * Antarctica
     */
    ANTARCTICA("Antarctica", 4) {
        override fun greet(personName: String): String {
            return "Hello from Antarctica! $personName"
        }
    },
    /**
     * Europe
     */
    EUROPE("Europe", 5) {
        override fun greet(personName: String): String {
            return "Hello from Europe! $personName"
        }
    },
    /**
     * Australia
     */
    AUSTRALIA("Australia", 6) {
        override fun greet(personName: String): String {
            return "Hello from Australia! $personName"
        }
    };

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

        /**
         * Get enum by value
         * @param value Int
         * @return Continent?
         */
        fun getByValue(value: Int): Continent? {
            for (continent in values()) {
                if (continent.value == value) {
                    return continent
                }
            }
            return null
        }
    }


}