import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    //val sc = Scanner(System.`in`)
    //var
    val letters = readLine()!!
    val word = readLine()!!
    var max = 0
    for (i in word) {
        if ((letters[(i.toInt()-97)*2].toInt()-48) > max) {
            max = letters[(i.toInt()-97)*2].toInt()-48
        }
    }
    println(max*word.length)
}
