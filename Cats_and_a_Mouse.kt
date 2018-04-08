import java.io.*
import java.util.*
import java.math.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val queries = sc.nextInt()
    var positions: Array<Double> = arrayOf()
    for (i in 1..queries) {
        for (j in 0..2) {
            positions = positions.plus(sc.nextInt().toDouble())
        }
        if (Math.abs(positions[0]-positions[2]) < Math.abs(positions[1]-positions[2])) {
            println("Cat A")
        } else if (Math.abs(positions[1]-positions[2]) < Math.abs(positions[0]-positions[2])) {
            println("Cat B")
        } else {
            println("Mouse C")
        }
        positions = arrayOf()
    }
}
