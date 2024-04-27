package org.example

fun main() {

}
abstract class Animal(var name:String, var age:Int, var type:String){
    init{
        println("Animal Class")
    }
}

class Dog():Animal(){

}