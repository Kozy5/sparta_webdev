package org.example

fun main(args: Array<String>) {
    var calc = Calculator4(10,5)
    calc.AddOperation()
    calc.SubstractOperation()
    calc.MultiplyOperation()
    calc.DivideOperation()
    calc.RemainderOperation()

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


