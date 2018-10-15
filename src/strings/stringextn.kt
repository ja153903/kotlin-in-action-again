package strings

// We should keep in mind that we cannot override extension functions
fun String.lastChar(): Char = this.get(this.length-1)