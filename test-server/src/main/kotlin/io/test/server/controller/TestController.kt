package io.test.server.controller

import base.boudicca.eventdb.api.publisher.io.test.api.TestApi
import io.test.model.Entry
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController: TestApi {
    override fun all(): Set<Entry> {
        TODO("Not yet implemented")
    }
}