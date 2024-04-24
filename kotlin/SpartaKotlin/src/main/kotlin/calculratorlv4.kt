package org.example

fun main(args: Array<String>) {

    while(start() == "Y"){
        println("연산할 첫번째 숫자를 입력해주세요")
        val firstNumber = readLine()!!.toInt()
        println("연산할 두번째 숫자를 입력해주세요")
        val secondNumber = readLine()!!.toInt()

        val calc = Calculator4(firstNumber,secondNumber)

        printCalculationGuideMessage()

        val selectCalculationMethod = readLine()!!
        when(selectCalculationMethod){
            "1" -> calc.AddOperation()
            "2" -> calc.SubstractOperation()
            "3" -> calc.MultiplyOperation()
            "4" -> calc.DivideOperation()
            "5" -> calc.RemainderOperation()
            else ->reInputRequest()
        }
    }

}
fun start():String{
    println("-----------------------------------")
    println("-------------계산 방법---------------")
    println("연산할 숫자를 안내에 따라 하나씩 입력해주세요")
    println("숫자 입력 후 연산 방법을 결정 할 수 있습니다.")
    println("-----------------------------------")
    println("메뉴를 골라주세요")
    println("계속 계산을 원하시면 숫자 1")
    println("계산 종료를 원하시면 아무거나 입력해주세요")
    val getStartRequest = readLine()!!
    when(getStartRequest){
        "1" -> return "Y"
        else -> return "N"
    }
}
fun printWelcomeMessage(){

}
fun printCalculationGuideMessage(){
    println("연산 방법을 골라주세요")
    println("1. 더하기")
    println("2. 빼기")
    println("3. 곱하기")
    println("4. 나누기(몫 구하기)")
    println("5. 나누기(나머지 구하기)")
}
fun reInputRequest(){
    println("연산 방법 중 하나를 골라주셔야 합니다.")
}

abstract class AbstractOperation(num1:Int,num3:Int) {

    abstract fun AddOperation()
    abstract fun SubstractOperation()
    abstract fun MultiplyOperation()
    abstract fun DivideOperation()
    abstract fun RemainderOperation()
}

class Calculator4(num1:Int,num2:Int): AbstractOperation(num1,num2) {
    var num1 = num1
    var num2 = num2

    override fun AddOperation() {
        println(num1+num2)
    }

    override fun SubstractOperation() {
        println(num1-num2)
    }

    override fun MultiplyOperation() {
        println(num1*num2)
    }

    override fun DivideOperation() {
        println(num1/num2)
    }

    override fun RemainderOperation() {
        println(num1%num2)
    }

}


