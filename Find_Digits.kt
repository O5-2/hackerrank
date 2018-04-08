import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    var n: Int // = 0
    var digits: Int // = 0
    for (i in 1..t) {
        n = sc.nextInt()
        digits = 0
        for (j in n.toString()) {
            if (j != '0') {
                if (n%(j.toInt()-48) == 0) {
                    digits += 1
                }
            }
        }
        println(digits)
    }
}
