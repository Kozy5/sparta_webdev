package org.example

fun main(args: Array<String>) {
    var fruits:MutableMap<String,Int> = mutableMapOf("apple" to 1, "kiwi" to 2, "strawberry" to 3)

    println(fruits)
//    println(map[0]) 인덱스 접근 불가
    println(fruits["apple"]) // 키로 접근 가능

    fruits["watermelon"] = 4
    fruits.remove("apple")
    println(fruits)

}