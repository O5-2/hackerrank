import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val hurdles = sc.nextInt()
    val jump = sc.nextInt()
    var heights: Array<Int> = arrayOf()
    for (i in 1..hurdles) {
        heights = heights.plus(sc.nextInt())
    }
    heights.sort()
    print(arrayOf(0,heights[hurdles-1]-jump).max()!!)
}
