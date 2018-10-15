package ch4

import javax.naming.Context
import javax.swing.text.AttributeSet

//class User constructor(_nickname: String) {
//    val nickname: String
//
//    init {
//        nickname = _nickname
//    }
//}

open class User(val nickname: String) {}
class TwitterUser(nickname: String): User(nickname) {}

open class AnotherView {
    constructor(ctx: Context) {}
    constructor(ctx: Context, attr: AttributeSet) {}
}