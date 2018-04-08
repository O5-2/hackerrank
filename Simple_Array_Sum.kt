import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    var len = sc.nextInt()
    var sum = 0
    for (i in 1..len) {
        sum += sc.nextInt()
    }
    print(sum)
}
