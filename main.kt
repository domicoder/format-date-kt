/**
 * @created by: Yander Sanchez, March 24, 2020
 * @edited in: play.kotlinlang.org
 * @lang: Kotlin
 */
import java.util.*
import java.time.*
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.text.SimpleDateFormat

fun main() {
    val formatter = DateTimeFormatter.ISO_INSTANT
    val parsed = ZonedDateTime.parse("1948-08-04T12:19:32.638Z", formatter.withZone(ZoneId.systemDefault()))
    val patternFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    // ZoneDateTime to LocalDateTime -> 1948-08-04T12:19:32.638Z
    val zoneDateTime2LocalDateTime = parsed.toLocalDateTime()
    val localDateTimeFormatted = patternFormatter.format(zoneDateTime2LocalDateTime)
    println("ZoneDateTime to LocalDateTime")
    println(zoneDateTime2LocalDateTime)
    println(zoneDateTime2LocalDateTime.javaClass.name)
    println(localDateTimeFormatted)
    
	println("\nZonedDateTime to Instant")
    // ZonedDateTime to Instant -> 1948-08-04T12:19:32.638Z
    val parseLocalDateTimeToInstant = parsed.toInstant()
    println(parseLocalDateTimeToInstant)
    println(parseLocalDateTimeToInstant.javaClass.name)
    
    println("\nInstant to Date")
    // Instant to Date -> 1948-08-04T12:19:32.638Z
    val dob = Date.from(parseLocalDateTimeToInstant)
    println(dob)
    println(dob.javaClass.name)
    
    println("\nFormat Date")
    val parserDate = SimpleDateFormat("dd/MM/yyyy")
    val dateFormatted = parserDate.format(dob)
    println(dateFormatted)
    println(dateFormatted.javaClass.name)
}