package ch4

// classes in Kotlin are final by default that means they cannot be subclassed
// By saying this class is open, we are allowing it to be subclassed
open class RichButton: Clickable {
    fun disable() {}
    open fun animate() {}
    // by stating that this function is a final override
    // this means that we cannot override the function
    // in the subsequent subclasses
    final override fun click() {}
}

internal open class TalkativeButton: Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!!")
}

//fun TalkativeButton.giveSpeech() {
//    yell()
//    whisper()
//}