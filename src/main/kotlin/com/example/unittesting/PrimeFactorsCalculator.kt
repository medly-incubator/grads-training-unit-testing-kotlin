package com.example.unittesting

class PrimeFactorsCalculator {
    fun factorsOf(number: Int) = primeFactorsStartingFrom(number, 2)

    fun primeFactorsStartingFrom(input: Int, divisor: Int ) : List<Int> {
        if(input == 1 )
            return emptyList()
        if(input % divisor == 0)
            return listOf(divisor) + primeFactorsStartingFrom(input / divisor, divisor)
        return primeFactorsStartingFrom(input, divisor + 1)
    }
}