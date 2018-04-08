import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val len = sc.nextInt()
    var socks: Array<Int> = arrayOf()
    var pairs = 0
    var i = 0
    for (j in 1..len) {
        socks = socks.plus(sc.nextInt())
    }
    socks.sort()
    while (i <= len-2) {
        if (socks[i] == socks[i+1]) {
            pairs += 1
            i += 1
        }
        i += 1
    }
    println(pairs)
}
