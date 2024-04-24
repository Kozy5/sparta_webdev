package org.example

fun main(args: Array<String>){
    var a = hero("박보영","Black",155.5)
    var b = hero("차은우","Blue",171.3,20,"남자")
}
class hero{
    var name:String = ""
    var hairColor:String = ""
    var height:Double = 0.0
    var age:Int = 0
    var gender:String =""
    constructor(_name:String,_hairColor:String,_height:Double){
        println("키:${_height} 머리색 : ${_hairColor} 이름: ${_name} 을 생성했어요")
        name = _name
        hairColor = _hairColor
        height = _height
    }

    constructor(_name:String,_hairColor:String,_height:Double,_age:Int,_gender:String){
        println("키:${_height} 머리색 : ${_hairColor} 이름: ${_name} 나이:${_age} 성별:${_gender} " +
                "을 보조생성자를 통해 생성했어요")
        name = _name
        hairColor = _hairColor
        height = _height
        age = _age
        gender = _gender
    }
}