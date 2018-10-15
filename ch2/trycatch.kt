import java.io.BufferedReader
import java.io.StringReader

// In Kotlin, try, catch, and finally are considered
// expressions. They are not like in Java.
fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } 
    catch (e: NumberFormatException) {
        return null
    } 
    finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}