import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val len = readLine()!!
    var height = 0
    val hike = readLine()!!
    var valleys = 0
    for (i in hike) {
        if (i == 'U') {
            height += 1
        } else {
            height -= 1
            if (height == -1) {
                valleys += 1
            }
        }
    }
    print(valleys)
}
