import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val len = sc.nextInt()
    var sum: Long = 0.toLong()
    for (i in 1..len) {
        sum += sc.nextInt().toLong()
    }
    print(sum)
}
