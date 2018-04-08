import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val sc = Scanner(System.`in`)
    val len = sc.nextInt()
    val k = sc.nextInt()
    var nums: Array<Int> = arrayOf()
    var pairs = 0
    for (i in 1..len) {
        nums = nums.plus(sc.nextInt())
    }
    for (i in 0..len-1) {
        for (j in i+1..len-1) {
            if ((nums[i]+nums[j])%k == 0) {
                pairs += 1
            }
        }
    }
    print(pairs)
}
