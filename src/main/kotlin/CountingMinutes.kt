import java.text.SimpleDateFormat
import java.util.*

/**
 * Have the function CountingMinutes(str) take the str parameter being passed which will be two times (each properly
 * formatted with a colon and am or pm) separated by a hyphen and return the total number of minutes between the two
 * times. The time will be in a 12 hour clock format.
 * For example: if str is 9:00am-10:00am then the output should be 60.
 * If str is 1:00pm-11:00am the output should be 1320.
 */
fun countingMinutes(str: String): Int {
    val times = str.split("-")

    val simpleDateFormat = SimpleDateFormat("hh:mm", Locale.ENGLISH)

    val startTime = simpleDateFormat.parse(times[0])
    val endTime = simpleDateFormat.parse(times[1])
    var diff = (endTime.time - startTime.time) / 1000 / 60
    if (times[0].endsWith("pm")) {
        diff += 12 * 60
    }
    println("startTime=$startTime, endTime=$endTime diff=$diff")
    return diff.toInt()
}

private const val MINUTES_IN_HOUR = 60
private const val MINUTES_IN_DAY = 24 * 60

fun countingMinutes2(str: String): Int {
    val times = str.split("-")
    val startTime = getMinuteOfDay(times[0])
    val endTime = getMinuteOfDay(times[1])
    return if (startTime <= endTime) {
        endTime - startTime
    } else {
        MINUTES_IN_DAY - startTime + endTime
    }
}

private fun getMinuteOfDay(time: String): Int {
    val parts = time.split(":")
    val hour = Integer.parseInt(parts[0])
    val minute = Integer.parseInt(parts[1].subSequence(0, parts[1].length - 2).toString())
    val minuteOfDay = if (time.toLowerCase().contains("pm")) {
        hour * MINUTES_IN_HOUR + minute + MINUTES_IN_DAY / 2
    } else {
        hour * MINUTES_IN_HOUR + minute
    }
    return if (minuteOfDay > MINUTES_IN_DAY) {
        minuteOfDay - MINUTES_IN_HOUR
    } else {
        minuteOfDay
    }
}

fun main() {
    countingMinutes("09:00am-10:00am")
    countingMinutes("9:00am-10:00am")
    countingMinutes("1:00pm-11:00am")

    countingMinutes2("09:00am-10:00am")
    countingMinutes2("9:00am-10:00am")
    countingMinutes2("1:00pm-11:00am")
}