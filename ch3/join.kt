// we can change class name when called by the following
@file:JvmName("join")

package strings

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

/* 
Therefore, in Java, when we want to import this function
we just do the following

import strings.join;
join.joinToString(...);
 */