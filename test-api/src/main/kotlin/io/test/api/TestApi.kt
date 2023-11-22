package io.test.api

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.test.model.Entry
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Api("Publisher")
@RequestMapping("/entries")
interface TestApi {
    @ApiOperation("returns all entries from the event db")
    @GetMapping("")
    fun all(): Set<Entry>
}
