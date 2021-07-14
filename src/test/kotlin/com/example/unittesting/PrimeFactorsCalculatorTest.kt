package com.example.unittesting

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PrimeFactorsCalculatorTest : StringSpec({
    val primeFactorsCalculator = PrimeFactorsCalculator()
    "prime factors of 1 should be empty list" {
        primeFactorsCalculator.factorsOf(1) shouldBe emptyList()
    }

    "prime factors of 2 should be 2" {
        primeFactorsCalculator.factorsOf(2) shouldBe listOf(2)
    }

    "prime factors of 3 should be 3" {
        primeFactorsCalculator.factorsOf(3) shouldBe listOf(3)
    }

    "prime factors of 4 should be 2,2" {
        primeFactorsCalculator.factorsOf(4) shouldBe listOf(2, 2)
    }

    "prime factors of 6 should be 2,3" {
        primeFactorsCalculator.factorsOf(6) shouldBe listOf(2,3)
    }

    "prime factors of 8 should be 2,2,2" {
        primeFactorsCalculator.factorsOf(8) shouldBe listOf(2,2,2)
    }
})

