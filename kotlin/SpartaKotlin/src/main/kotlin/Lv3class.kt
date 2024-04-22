package org.example

fun main(args: Array<String>) {
    var calc = Calculator(5,"%",5)
    var plus = AddOperation(10,5)
    var minus = SubstractOperation(10,5)
    var multiplication = MultiplyOperation(10,5)
    var division = DivideOperation(10,5)
    var remaining = RemainderOperation(10,5)

    plus.calculate()

}
open class Calculator(var num1: Int,var operator:String, var num2:Int){
    fun calculate(){
        if(operator == "+"){
            println(num1 + num2)
        }else if(operator == "-"){
            println(num1 - num2)
        }else if(operator == "*"){
            println(num1 * num2)
        }else if(operator == "/"){
            println(num1 / num2)
        }else if(operator == "%"){
            println(num1 % num2)
        }else{
            println("정확한 연산자를 입력해주세요.")
        }
    }
}

class AddOperation(num1:Int,num2:Int): Calculator(num1,"+",num2)
class SubstractOperation(num1:Int,num2:Int): Calculator(num1,"-",num2)
class MultiplyOperation(num1:Int,num2:Int): Calculator(num1,"*",num2)
class DivideOperation(num1:Int,num2:Int): Calculator(num1,"/",num2)
class RemainderOperation(num1:Int,num2:Int): Calculator(num1,"%",num2)
