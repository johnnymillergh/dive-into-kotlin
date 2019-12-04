package com.jmsoftware.diveintokotlin.common

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Instance a logger
 *
 * Inspired by SLF4J loggers in 3 ways
 * @see <a href="https://www.reddit.com/r/Kotlin/comments/8gbiul/slf4j_loggers_in_3_ways/">SLF4J loggers in 3 ways</a>
 * @return SLF4J Logger
 * @author Johnny Miller (锺俊), email: johnnysviva@outlook.com
 * @date 10/25/19 12:29 PM
 */
inline fun <reified T> log(): Logger {
    return LoggerFactory.getLogger(T::class.java)
}
