package rt.practice.problemoftheday

import java.lang.Math.abs

/* Assumption: Array will not have any duplicate number
 */
fun main(args: Array<String>){
    var numbers: IntArray = intArrayOf(-1, 5, 3, 7, -2, 2, 6, 0, -4, -6)
    var negativeNoCount: Int = separateNegativeNumberAndZeros(numbers)
    println("Negative numbers together: ${numbers.contentToString()}")
    println("Total number of negative numbers along with zero in array: $negativeNoCount")
    markPositiveNumbers(numbers, negativeNoCount)
}

fun markPositiveNumbers(numbers: IntArray, negativeNoCount: Int) {
    for(i in negativeNoCount..numbers.size){
        println()

    }
}

// bring all negative number along with zero at the start of array and return total count of them
fun separateNegativeNumberAndZeros(numbers: IntArray): Int {
    var negativeNoCount: Int = 0
    for (i in numbers.indices) {
        if(numbers[i] <= 0){
            // swap and increment
            val temp = numbers[i]
            numbers[i] = numbers[negativeNoCount]
            numbers[negativeNoCount] = temp
            negativeNoCount++
        }
        println( "${numbers.contentToString()}")
    }
    return negativeNoCount
}
