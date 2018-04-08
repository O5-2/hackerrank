import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val len = readLine()!!.toInt()
    val b = readLine()!!.split(" ")
    val birds = b.map{ it.toInt() }
    var types = arrayOf(0,0,0,0,0)
    var highest = 42
    var high = 0
    for (i in 0..len-1) {
        types[birds[i]-1] += 1
    }
    for (i in 0..4) {
        if (types[i] > high) {
            highest = i
            high = types[i]
        }
    }
    println(highest+1)
}
