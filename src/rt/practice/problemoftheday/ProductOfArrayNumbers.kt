package rt.practice.problemoftheday

import java.util.*

fun main(args: Array<String>){
    val numbers : Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("Product of numbers by Division: "+ byDivisionMethod(numbers).contentDeepToString())
    println("Product of numbers by two pointers: "+ byKeepingTwoPointers(numbers).contentDeepToString())
}

fun byDivisionMethod(numbers: Array<Int>): Array<Int?> {
    val arrayProduct = numbers.reduce { acc, i ->  acc * i  }

    val newArray : Array<Int?> = arrayOfNulls<Int>(numbers.size)

    for (i in numbers.indices) {
        // println("A" +numbers[i])
        newArray[i] = arrayProduct.div(numbers[i])
    }
    return newArray
}

fun byKeepingTwoPointers(numbers: Array<Int>): Array<Int?> {
    val resultArray : Array<Int?> = arrayOfNulls<Int>(numbers.size)
    var leftArray: Array<Int>
    var rightArray: Array<Int>

    for(i in numbers.indices) {
        var leftProduct : Int = 1
        var rightProduct : Int = 1

        println("For iteration $i ")
        if (i == 0) {
            rightArray = numbers.copyOfRange(i + 1, numbers.size)
            rightProduct = rightArray.reduce { acc, it -> acc * it }

            println("""right array: ${rightArray.contentDeepToString()} product: $rightProduct""")
        } else if (i == numbers.size-1) {
            leftArray = numbers.copyOfRange(0, numbers.size - 1)
            leftProduct = leftArray.reduce { acc, it -> acc * it }

            println("""left array: ${leftArray.contentDeepToString()}  product: $leftProduct""")
        } else if (i >= 1) {
            leftArray = numbers.copyOfRange(0, i)
            leftProduct = leftArray.reduce { acc, it -> acc * it }
            rightArray = numbers.copyOfRange(i + 1, numbers.size)
            rightProduct = rightArray.reduce { acc, it -> acc * it }

            println("""left array: ${leftArray.contentDeepToString()}  product: $leftProduct""")
            println("""right array: ${rightArray.contentDeepToString()} product: $rightProduct""")
        }
        resultArray[i] = leftProduct * rightProduct
    }

    return resultArray
}