package com.example.unittesting

class PrimeFactorsCalculator {
    fun factorsOf(number: Int): List<Int> {
        var output: MutableList<Int> = mutableListOf()
        var input = number
        if(input > 1) {
            if(input % 2 == 0){
                output.add(2)
                input = input / 2
            }
        }
        if(input > 1) output.add(input)
        return output
    }
}