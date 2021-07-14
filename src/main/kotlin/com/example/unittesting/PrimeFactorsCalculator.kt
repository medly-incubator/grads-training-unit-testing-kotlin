package com.example.unittesting

class PrimeFactorsCalculator {
    fun factorsOf(number: Int): List<Int> {
        var output: MutableList<Int> = mutableListOf()
        var input = number
        var factor = 2
        while(input > 1) {
            while(input % factor == 0){
                output.add(factor)
                input = input / factor
            }
            factor++;
        }
        if(input > 1) output.add(input)
        return output
    }
}