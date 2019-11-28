package rt.practice.problemoftheday

class StairCase {
    fun countWaysRecurrsively(totalSteps: Int, stepsAtTime: Int): Int {
        var result = 0
        if(totalSteps <= 1)
            return 1

       result += countWaysRecurrsively(totalSteps - 1, 1)
       result += countWaysRecurrsively(totalSteps - 2, 2)
        return result
    }

    fun countWaysDynamically(totalSteps: Int, stepsAtTime: Int): Int {
        val res = IntArray(totalSteps + 1)
        res[0] = 1
        res[1] = 1
        for (i in 2..totalSteps)
            for (j in 1.. stepsAtTime)
                res[i] = (res[i - 1] + res[i - 2])
        return res[totalSteps]
    }
}

fun main(argc: Array<String>) {

    println(StairCase().countWaysDynamically(totalSteps = 4, stepsAtTime = 2))
    println(StairCase().countWaysRecurrsively(totalSteps = 4, stepsAtTime = 2))
}
