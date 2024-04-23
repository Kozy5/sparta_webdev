package org.example

import kotlin.collections.MutableList as MutableList1
import kotlin.collections.mutableMapOf as mutableMapOf

fun main(args: Array<String>) {
    var choice = readLine()!!
    startEnd(choice)

}
fun startEnd(num:String){
    when(num){
        "1" -> gamestart()
        "2" -> println("게임을 종료합니다")
        else -> println("시작하려면 1 종료하려면 2를 입력해주세요")
    }
}
fun gamestart() {
    println("게임을 시작합니다")
    println("닉네임,직업 순으로입력해주세요 직업은(전사,마법사,도적 중 1)")
    var nickname = readLine()!!
    var job = readLine()!!
    choiceChar(nickname,job)
}

fun choiceChar(name:String,job:String){
    var nicknamelist = mutableListOf<String>()
    var joblist = mutableListOf<String>()
    var userinfo = mutableMapOf<Any, Any>("nickname" to nicknamelist,"job" to joblist)
    println("좋아 ${name} 앞으로 잘 부탁한다.")
    while(joblist.indexOf(job) != null){
        when(job){
            "전사" -> joblist += job
            "마법사" -> joblist += job
            "도적" -> joblist += job
            else -> null
        }
    }




}