package com.example.unittesting

class PrimeFactorsCalculator {
    fun factorsOf(numberToFactorize: Int): List<Int> {
        return if(numberToFactorize > 1)
            listOf(numberToFactorize)
        else
            emptyList()
    }
}