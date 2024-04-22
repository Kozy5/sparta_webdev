package org.example

fun main() {
    val student1Score = 95
    val student2Score = 27
    val student3Score = 88

    val student1rank = checkRank(student1Score)
    val student2rank = checkRank(student2Score)
    val student3rank = checkRank(student3Score)

    println("학생 1 등급은 " + student1rank)
    println("학생 2 등급은 " + student2rank)
    println("학생 3 등급은 " + student3rank)
}
fun checkRank(score:Int):String{
    when(score){
        in 90..100 -> return "A"
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        else -> return "D"
    }
}