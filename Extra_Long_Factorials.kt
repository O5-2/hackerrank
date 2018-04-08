import java.io.*
import java.util.*
import java.math.BigInteger

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var f = BigInteger.ONE
    for (i in 2..n) {
        f *= BigInteger.valueOf(i.toLong())
    }
    print(f)
}
