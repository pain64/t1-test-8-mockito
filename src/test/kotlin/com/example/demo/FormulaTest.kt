package com.example.demo

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FormulaTest: FunSpec ({
    test("v1") {
        Formula.f(1, true, true) shouldBe 4
        Formula.f(1, false, false) shouldBe 1
//        Formula.f(1, true, false) shouldBe 2
//        Formula.f(1, false, true) shouldBe 2
    }
})