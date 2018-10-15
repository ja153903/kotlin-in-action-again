package ch3

// By making the class open, you know that you can subclass it
open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()

    // this is resolved statically so View.showOff() will be called
    view.showOff()
}