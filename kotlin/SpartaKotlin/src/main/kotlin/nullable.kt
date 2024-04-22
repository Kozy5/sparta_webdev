package org.example

fun main(args: Array<String>) {
    //nullable type
    var a: String? = null

    var b: String = "123"

    nonnulltrustme(b)
}

//조건문 검사
fun conditionnullable(input:Int?,name:String){
    if(input != null){
        println(" ${name} is not null")
    }else {
        println("${name} is null")
    }
}

//elvis 검사
fun elvisnullable(input:Int?){
    if(input ?:"".length == 0 ){
        println("this is null")
    }else {
        println("this is not null")
    }
}

//세이프 콜 널이 아닐 경우만 실행
fun safecall(input:Int?){
    input?.let{
        println("${it} null아님!")
    }
}

// 단언 연산자 , 단언 했다가 null 생기면 null pointer exception 뜸 npe 
fun nonnulltrustme(input:String?){
    println(input!!.length)
}