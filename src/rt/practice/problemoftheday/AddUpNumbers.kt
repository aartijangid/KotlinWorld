package rt.practice.problemoftheday

import java.util.*

fun main(args: Array<String>){

    val numberArray = intArrayOf(10, 15, 3, 7)

    val hashSet = HashSet<Int>()

    for (i in numberArray.indices) {
        //println(numberArray[i]);
        //println(17 - numberArray[i]);
        if (hashSet.contains(17 - numberArray[i])) {
            println("true")
        } else hashSet.add(numberArray[i])
    }

}