package easy

import java.time.Duration
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


fun main() {
    val timestamps = listOf(
        "2023-06-28T20:29:54.937+0000",
        "2023-06-28T20:29:42.991+0000",
        "2023-06-28T20:25:27.190+0000",
        "2023-06-28T20:25:18.062+0000",
        "2023-06-28T20:25:17.761+0000",
        "2023-06-28T20:25:16.392+0000",
        "2023-06-28T20:25:14.822+0000",
        "2023-06-28T20:25:07.947+0000",
        "2023-06-28T20:24:57.404+0000",
        "2023-06-28T20:23:27.096+0000",
        "2023-06-28T20:22:36.438+0000",
        "2023-06-28T20:22:06.939+0000",
        "2023-06-28T20:21:29.802+0000",
        "2023-06-28T20:21:20.526+0000",
        "2023-06-28T20:21:03.347+0000",
        "2023-06-28T20:20:57.403+0000",
        "2023-06-28T20:20:52.878+0000",
        "2023-06-28T20:20:51.085+0000",
        "2023-06-28T20:20:35.965+0000",
        "2023-06-28T09:01:58.092+0000",
        "2023-06-28T09:01:08.780+0000",
        "2023-06-28T09:01:04.088+0000",
        "2023-06-28T09:00:56.444+0000",
        "2023-06-28T09:00:42.341+0000"
    )

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    val parsedTimestamps = timestamps.map { LocalDateTime.parse(it, formatter) }

    val timeDifferences = calculateTimeDifferences(parsedTimestamps)

    timeDifferences.forEachIndexed { index, duration ->
        val formattedDuration = formatDuration(duration)
        println("Difference between ${timestamps[index]} and ${timestamps[index + 1]}: $formattedDuration")
    }
}

fun calculateTimeDifferences(timestamps: List<LocalDateTime>): List<Duration> {
    val timeDifferences = mutableListOf<Duration>()

    for (i in 0 until timestamps.size - 1) {
        val diff = Duration.between(timestamps[i], timestamps[i + 1])
        timeDifferences.add(diff)
    }

    return timeDifferences
}

fun formatDuration(duration: Duration): String {
    val hours = duration.toHours()
    val minutes = duration.toMinutesPart()
    val seconds = duration.toSecondsPart()
    val milliseconds = duration.toMillisPart()

    return String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds)
}







/*fun main() {
    val timestamps = listOf(
        "2023-06-28T20:29:54.937+0000",
        "2023-06-28T20:29:42.991+0000",
        "2023-06-28T20:25:27.190+0000",
        "2023-06-28T20:25:18.062+0000",
        "2023-06-28T20:25:17.761+0000",
        "2023-06-28T20:25:16.392+0000",
        "2023-06-28T20:25:14.822+0000",
        "2023-06-28T20:25:07.947+0000",
        "2023-06-28T20:24:57.404+0000",
        "2023-06-28T20:23:27.096+0000",
        "2023-06-28T20:22:36.438+0000",
        "2023-06-28T20:22:06.939+0000",
        "2023-06-28T20:21:29.802+0000",
        "2023-06-28T20:21:20.526+0000"
    )

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    val parsedTimestamps = timestamps.map { LocalDateTime.parse(it, formatter) }

    val timeDifferences = calculateTimeDifferences(parsedTimestamps)

    timeDifferences.forEachIndexed { index, duration ->
        println("Difference between ${timestamps[index]} and ${timestamps[index + 1]}: $duration")
    }
}

fun calculateTimeDifferences(timestamps: List<LocalDateTime>): List<Duration> {
    val timeDifferences = mutableListOf<Duration>()

    for (i in 0 until timestamps.size - 1) {
        val diff = Duration.between(timestamps[i], timestamps[i + 1])
        timeDifferences.add(diff)
    }

    return timeDifferences
}*/