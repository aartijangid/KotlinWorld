package rt.practice.problemoftheday

import java.util.*

fun main(args: Array<String>){
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println("Product of numbers by Division: "+ Arrays.deepToString(byDivisionMethod(numbers)))
}

fun byDivisionMethod(numbers: Array<Int>): Array<Int?> {
    val arrayProduct = numbers.reduce { acc, i ->  acc * i  }

    val newArray : Array<Int?> = arrayOfNulls<Int>(numbers.size)

    for (i in numbers.indices) {
        println("A" +numbers[i])
        // println("B" + newArray[i])
        newArray[i] = arrayProduct.div(numbers[i])
    }
    return newArray
}
