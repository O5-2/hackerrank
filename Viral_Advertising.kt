import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val days = sc.nextInt()
    var green = 0
    var m = 5
    for (i in 1..days) {
        green += (m/2)
        m = (m/2)*3
    }
    println(green)
}
