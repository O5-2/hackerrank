import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val time = readLine()!!
    if (time == "12:00:00AM") {
        print("00:00:00")
    } else if (time == "12:00:00PM") {
        print("12:00:00")
    } else if ((time[8] == 'P') and (time.slice(0..1) == "12")) {
        print("00"+time.slice(2..7))
    } else if (time[8] == 'P') {
        print((time.slice(0..1).toInt()+12).toString()+time.slice(2..7))
    } else {
        print(time.slice(0..7))
    }
}
