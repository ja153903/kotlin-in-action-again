fun inRange(percentage: Double): Boolean {
    if (percentage !in 0..100) {
        throw IllegalArgumentException(
            "A percentage value must be between 0 and 100"
        )
    }

    return true;
}

fun main(args: Array<String>) {
    val percentage: Double = Math.random() * 100;
    println(inRange(percentage))

    val percentageCheck =
        if (percentage in 0..100)
            percentage
        else
            throw IllegalArgumentException(
                "A percentage value must be between 0 and 100"
            )
    
    println(percentageCheck)
}