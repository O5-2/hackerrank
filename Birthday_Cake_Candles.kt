import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    var nums: Array<Int> = arrayOf()
    var len = sc.nextInt()
    for (i in 1..len) {
        nums = nums.plus(sc.nextInt())
    }
    var height = 0
    var tallest = 0
    for (i in nums) {
        if (i > height) {
            height = i
            tallest = 1
        } else if (i == height) {
            tallest += 1
        }
    }
    print(tallest)
}
