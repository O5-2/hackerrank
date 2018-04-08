import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    var nums: Array<Long> = arrayOf()
    for (i in 1..5) {
        nums = nums.plus(sc.nextInt().toLong())
    }
    val sum = nums.sum()
    print(sum-nums.max()!!)
    print(" ")
    print(sum-nums.min()!!)
}
