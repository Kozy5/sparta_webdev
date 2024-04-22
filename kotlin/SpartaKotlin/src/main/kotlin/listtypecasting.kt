package org.example

fun main(args: Array<String>) {
    var list:List<String> =  listOf("apple","banana","grape") // list를
    var listFromMap:Map<String,Int> = list.associateWith {list.indexOf(it)} // 맵으로 변환 associateWith{} 이용
    println(listFromMap) //{apple=0, banana=1, grape=2}

    val map:Map<String,Int> = mapOf("Q" to 150,"W" to 80, "E" to 15,"R" to 400) // 맵을
    val mapFromlist: List<Pair<String,Int>> = map.toList() // 리스트로 변환 리스트 자료형<Pair<String,Int>>
    println(mapFromlist) // [(Q,150),(W,80),(E,15),(R,400)]
}