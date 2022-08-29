/**
 * Have the function MostFreeTime(strArr) read the strArr parameter being passed which will represent a full day and
 * will be filled with events that span from time X to time Y in the day. The format of each event will be
 * hh:mmAM/PM-hh:mmAM/PM. For example, strArr may be ["10:00AM-12:30PM","02:00PM-02:45PM","09:10AM-09:50AM"].
 * Your program will have to output the longest amount of free time available between the start of your first event
 * and the end of your last event in the format: hh:mm. The start event should be the earliest event in the day and
 * the latest event should be the latest event in the day. The output for the previous input would therefore be 01:30
 * (with the earliest event in the day starting at 09:10AM and the latest event ending at 02:45PM).
 * The input will contain at least 3 events and the events may be out of order.
 *
 */
fun mostFreeTime(strArr: Array<String>): String {

    val startTimes = mutableListOf<String>()
    val endTimes = mutableListOf<String>()
    for (timeSpan in strArr) {
        startTimes.add(timeSpan.split("-")[0])
        endTimes.add(timeSpan.split("-")[1])
    }

    //find earliest
    var earliestDur = Int.MAX_VALUE
    var earliestTime = startTimes[0]
    for (startTime in startTimes) {
        if (getMinuteOfDay(startTime) < earliestDur) {
            earliestDur = getMinuteOfDay(startTime)
            earliestTime = startTime
        }
    }

    //find latest
    var latestDur = Int.MIN_VALUE
    var latestTime = endTimes[0]
    for (endTime in endTimes) {
        if (getMinuteOfDay(endTime) > latestDur) {
            latestDur = getMinuteOfDay(endTime)
            latestTime = endTime
        }
    }

    return "$earliestTime $latestTime"
}

private const val MINUTES_IN_HOUR = 60
private const val MINUTES_IN_DAY = 24 * 60

private fun getMinuteOfDay(time: String): Int {

    val parts = time.split(":")
    var hour = parts[0].toInt()
    val minute = parts[1].substring(0, parts[1].length - 2).toInt()

    if (hour == 12) {
        hour = 0
    }

    val minuteOfDay = if (time.toLowerCase().contains("pm")) {
        hour * MINUTES_IN_HOUR + minute + MINUTES_IN_DAY / 2
    } else {
        hour * MINUTES_IN_HOUR + minute
    }

    return if (minuteOfDay > MINUTES_IN_DAY) {
        minuteOfDay - MINUTES_IN_DAY
    } else {
        minuteOfDay
    }


}

fun main() {
    val result = mostFreeTime(arrayOf("10:00AM-12:30PM", "02:00PM-02:45PM", "09:10AM-09:50AM"))
    println("result=$result")
}