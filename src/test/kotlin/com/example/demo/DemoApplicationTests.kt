package com.example.demo

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito
import org.mockito.internal.stubbing.answers.ThrowsException
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.web.client.RestTemplate


@ExtendWith(MockitoExtension::class)
class DemoApplicationTests : FunSpec({
    test("not tag") {
        val rt = Mockito.mock(
            RestTemplate::class.java, ThrowsException(Exception("not stubbed"))
        )
        val cat = CatData("1", "image/jpg", listOf("black"))

        Mockito.doReturn(cat).`when`(rt)
            .getForObject("/cat?json=true", CatData::class.java)

        CataasService(rt).randomCat(null) shouldBe cat
    }

    test("tag") {}

    test("404") {}

    test("unexpected null from CATAAS") {}
})
