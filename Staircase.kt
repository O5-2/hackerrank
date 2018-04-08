import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val x = " "
    val y = "#"
    var current = ""
    val sc = Scanner(System.`in`)
    val height = sc.nextInt()
    for (i in 1..height) {
        for (j in 1..height-i) {
            current += x
        }
        for (j in 1..i) {
            current += y
        }
        println(current)
        current = ""
    }
}
