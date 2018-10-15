package ch2;

interface Expr

class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr

// fun eval(e: Expr): Int {
//     if (e is Num) {
//         val n = e as Num 
//         // explicit cast, but we don't need it because we're in if statement 
//         // where we know it's a Num
//         return n.value
//     }

//     if (e is Sum) {
//         // smart cast
//         return eval(e.right) + eval(e.left)
//     }

//     throw IllegalArgumentException("Unknown Expression")
// }

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else -> throw IllegalArgumentException("Unknown Expression")
    }


fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}