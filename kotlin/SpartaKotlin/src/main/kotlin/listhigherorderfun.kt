package org.example

fun main(args: Array<String>) {
    val people = listOf(
        mapOf("name" to "김르탄","age" to 27),
        mapOf("name" to "이스파","age" to 18),
        mapOf("name" to "최개발","age" to 54),
        mapOf("name" to "박코딩","age" to 32)
    )
//    println(people)
//    println("------------------------")
//    for (person in people){
//        println(person)
//    }
//    println("--------------------------")
//    var lamda = {a:String,b:Int -> a+b}
//    println(people.forEach{lamda(it["name"].toString(),it["age"] as Int)})
//
//    println("------------------------")
//    people.forEach{println(it)}
    people.filter{
        var age = it["age"]
        if(age is Int){
             age < 30
        }else{
            false
        }
    }.forEach{
        println(it)
    }

}