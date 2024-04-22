package org.example

fun main(){
    var list:List<Int> = listOf(1,2,3,4,5)
    var mutablelist:MutableList<Int> = mutableListOf(1,2,3,4,5)
    mutablelist.add(6)
    mutablelist.remove(1)
    println(mutablelist)
}