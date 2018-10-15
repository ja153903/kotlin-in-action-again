package ch4

import java.io.Serializable

interface State: Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class AnotherButton: View {
    override fun getCurrentState(): State {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonState: State {}
}

class Outer {
    // inner classes store a reference to an outer class
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}