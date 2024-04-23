package org.example

fun main(args: Array<String>) {
    var read = readLine()!!
    menu(read)
}
fun menu(input:String) {

    when(input){
        "1" -> return println("게임이 시작되었습니다.")
        "2" -> return println("게임이 종료되었습니다.")
        else -> return println("시작을 원하면 1을 종료를 원하면 2를 입력해주세요")
    }
}