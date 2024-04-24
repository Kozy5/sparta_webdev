package org.example

fun main(){
    var a = person("박보영",1990)
    var b = person("차은우",1997)
    var c = person("카리나")
}
class person(name:String,birthDay:Int){
    init{
        println("${birthDay}년생 ${name}님을 생성하였습니다.")
    }
    constructor(name:String):this(name,1997){
        println("보조 생성자를 사용하였습니다.")
    }
}