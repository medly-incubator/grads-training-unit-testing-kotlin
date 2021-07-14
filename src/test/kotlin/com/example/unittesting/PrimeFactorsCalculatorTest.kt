package com.example.unittesting

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.startWith

class PrimeFactorsCalculatorTest : StringSpec({
    val primeFactorsCalculator = PrimeFactorsCalculator()
    "prime factors of 1 should be empty list" {
        val emptyList = emptyList<Int>()
        primeFactorsCalculator.factorsOf(1) shouldBe emptyList
    }

    "prime factors of 2 should be 2" {
        val expected = listOf(2)
        primeFactorsCalculator.factorsOf(2) shouldBe expected
    }

    "prime factors of 3 should be 3" {
        val expected = listOf(3)
        primeFactorsCalculator.factorsOf(3) shouldBe expected
    }

})

