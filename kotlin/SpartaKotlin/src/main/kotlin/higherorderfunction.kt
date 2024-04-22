package org.example

fun main(){
    var numbers = listOf(1,2,3,4,5)
    val printfunction = {value:Int -> println(value)}
//    1번 pure forEach   numbers.forEach{value -> println(value)}
//    2번 pure it        numbers.forEach{println(it)}
//    3번 forEach속 lamda함수 numbers.forEach{printfunction(it)}
//    4번 forEach에 lamda함수 적용 numbers.forEach(printfunction)
    numbers.forEach{value -> println(value)}
    println("-------------------------")
    numbers.forEach{println(it)}
    println("-------------------------")
    numbers.forEach{printfunction(it)}
    println("-------------------------")
    numbers.forEach(printfunction)
}