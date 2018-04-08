import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val len = sc.nextInt()
    for (i in 1..len) {
        var grade = sc.nextInt()
        if (grade < 38) {
            println(grade)
        } else {
            if ((grade % 5) > 2) {
                println(((grade/5)+1)*5)
            } else {
                println(grade)
            }
        }
    }
}
