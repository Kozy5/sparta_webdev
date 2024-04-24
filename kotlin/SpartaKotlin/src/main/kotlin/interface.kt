package org.example

fun main(){
    var bird = Bird("새")
    var peosion = peosion("비둘기")
    var chicken = chicken("닭")
    var egule = egule("독수리")

    bird.fly()
    peosion.fly()
    chicken.fly()
    egule.fly()

}
open class Bird(var name:String){
    fun fly(){
        println("${name}날아요~")
    }
}

class peosion(name:String):Bird(name){

}
class chicken(name:String):Bird(name){

}class egule(name:String):Bird(name){

}
