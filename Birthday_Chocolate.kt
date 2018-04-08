import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val len = sc.nextInt()
    var squares: Array<Int> = arrayOf()
    for (i in 1..len) {
        squares = squares.plus(sc.nextInt())
    }
    val d = sc.nextInt()
    val m = sc.nextInt()
    var ways = 0
    for (i in 0..(len-m)) {
        if (squares.slice(i..(i+m-1)).sum() == d) {
            ways += 1
        }
    }
    print(ways)
}
