import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    var len = sc.nextInt()
    var x = sc.nextInt()
    var highest = x
    var high = 0
    var lowest = x
    var low = 0
    for (i in 2..len) {
        x = sc.nextInt()
        if (x > highest) {
            highest = x
            high += 1
        } else if (x < lowest) {
            lowest = x
            low += 1
        }
    }
    print(high)
    print(" ")
    print(low)
}
