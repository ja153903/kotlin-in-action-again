package ch4

// by marking a superclass with the sealed modifier
// that restricts the possibility of creating subclasses
// all the direct subclasses must be nested in the superclass

sealed class Expr {
    class Num(val value: Int): Expr()
    class Sum(val left: Expr, val right: Expr): Expr()
}

fun eval(e: Expr): Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }