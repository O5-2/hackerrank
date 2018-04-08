import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    var n: Int
    var height: Int
    for (i in 1..t) {
        n = sc.nextInt()
        height = 1
        for (j in 1..n) {
            if (j%2 == 1) {
                height *= 2
            } else {
                height += 1
            }
        }
        println(height)
    }
}
