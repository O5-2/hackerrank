import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val a1 = sc.nextInt()
    val a2 = sc.nextInt()
    val a3 = sc.nextInt()
    val b1 = sc.nextInt()
    val b2 = sc.nextInt()
    val b3 = sc.nextInt()
    var alice = 0
    var bob = 0
    if (a1 > b1) {
        alice += 1
    } else if (a1 < b1) {
        bob += 1
    }
    if (a2 > b2) {
        alice += 1
    } else if (a2 < b2) {
        bob += 1
    }
    if (a3 > b3) {
        alice += 1
    } else if (a3 < b3) {
        bob += 1
    }
    print(alice)
    print(" ")
    print(bob)
}
