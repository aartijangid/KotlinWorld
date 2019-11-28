//Take the set of integers
//1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,……

//First, delete every second number, we get following reduced set.
//1,3,5,7,9,11,13,15,17,19,…………

//Now, delete every third number, we get
//1, 3, 7, 9, 13, 15, 19,….….

//Continue this process indefinitely……
//Any number that does NOT get deleted due to above process is called “lucky”.

class LuckyNumber {
    var counter = 2

    fun isLucky(num: Int): Boolean {
        var nextPosition = num
        if (counter > num)
            return true
        if (num % counter == 0)
            return false

        // calculate next position of input number
        nextPosition -= nextPosition / counter
        //increment counter
        counter++

        return isLucky(nextPosition)
    }
}

fun main(args: Array<String>) {
    val x = 19
    if (LuckyNumber().isLucky(x))
        println("$x is a lucky no.")
    else
        println("$x is not a lucky no.")
}