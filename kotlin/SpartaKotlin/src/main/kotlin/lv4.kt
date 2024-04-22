package org.example

fun main(args: Array<String>) {
    var calc = AbstractOperation(10,"+",5)
    calc.AddOperation()

}
abstract class Calculator4(num1:Int,operator:String,num3:Int) {

    abstract fun AddOperation()
    abstract fun SubstractOperation()
    abstract fun MultiplyOperation()
    abstract fun DivideOperation()
    abstract fun RemainderOperation()
}

class AbstractOperation(num1:Int,operator:String,num2:Int): Calculator4(num1,operator,num2) {
    var num1 = num1
    var num2 = num2
    var operation = operator
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


