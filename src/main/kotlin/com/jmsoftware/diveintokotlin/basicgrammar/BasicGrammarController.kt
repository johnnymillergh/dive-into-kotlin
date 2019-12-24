package com.jmsoftware.diveintokotlin.basicgrammar

import com.jmsoftware.diveintokotlin.basicgrammar.service.BasicGrammarService
import com.jmsoftware.diveintokotlin.common.log
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.NotBlank

/**
 * BasicGrammarController
 *
 * Change description here.
 * @author Johnny Miller (锺俊), email: johnnysviva@outlook.com
 * @date 10/25/19 9:08 AM
 **/
@RestController
@RequestMapping("/basic-grammar")
@Api(value = "/basic-grammar", tags = ["Basic Grammar Controller"])
class BasicGrammarController(val basicGrammarService: BasicGrammarService) {
    val log = log<BasicGrammarController>()

    @GetMapping("/filter-countries")
    @ApiOperation(value = "Filter countries", notes = "Filter countries")
    fun filterCountries(): List<Country> {
        return basicGrammarService.getFilteredCountries()
    }

    @GetMapping("/iterate-string")
    @ApiOperation(value = "Iterate string", notes = "Iterate string")
    fun iterateString(@NotBlank @RequestParam targetString: String): String {
        return basicGrammarService.iterateString(targetString)
    }
}
