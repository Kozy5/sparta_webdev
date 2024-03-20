# 주석 
한줄 주석 : //
여러줄 주석 : /* */
안드로이드 스튜디오 : 컨트롤 + /

1. 함수 

1-1 statement와 expression

1. 기본적으로는 every functions is expression in kotlin
2. 방식에따라 문(statement) or 식(expression)으로 구분은 가능

[statement type function]
fun helloWorld():Unit {
    println("hello world")
}

expression function

fun add(a:Int, b:Int) : Int {
    return a+b
}

차이점 
# return의 차이가 있다
1. 반환형 데이터 지정 유무
2. return 명시 
3. 조건문에서 else 작성 유무

# expression에서는 위 3가지 작성해야함
2. expression함수에서는 return 꼭 작성해줘야함

stetement함수 케이스에서 결국 print나 Sring Tmeplate할땐 
expression 변수를 return없이 작성하고 내부에서 불러서 사용 할 수 있지만


[잘못된 예 1] return미작성 expression함수 외부에서 pirnt호출 / 불가능
fun main() {
    println(checkNumber(1))
}

fun checkNumber(score:Int):Int{
    when(score){
        1 -> 1
        2 -> 2
        else -> 3
    } 
}
오류 : A 'return' expression required in a function with a block body ('{...}')

[잘못된 예 2] return 미작성,expression변수를 print로 호출해놓은 함수 / 불가능
fun main() {
    checkNumber(1)
}

fun checkNumber(score:Int):Int{
    var a = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    } 
    println(a)
}
1번과 같은오류

[옳은 예 1] return 작성한 expression 함수 외부에서print호출 / 가능
fun main() {
    print(checkNumber(1))
}

fun checkNumber(score:Int):Int{
    when(score){
        1 -> return 1
        2 -> return 2
        else -> return 3
    } 
}
출력 : 1
[잘못된 예 2] return 작성,expression변수를 print로 호출해놓은 함수
!!!!!!!!!!!!!expression함수를 print로 호출하면 안됨 Int가 return값!!!!!
fun main() {
    checkNumber(1)
}

fun checkNumber(score:Int):Int{
    var a = when(score){
        1 -> return 1
        2 -> return 2
        else -> return 3
    } 
    print(a)
}
# statement에서 
1번 : 안해도 Unit 자동
2번 : X
3번 : 안해도 작동됨

1-2 함수 속 변수


[예시 1] statement함수속 expression 변수(변환)

# expression 함수속에서는 String Template X

# 해당 변수 내부에서 print문, String Template으로 있다는 건 애초에
statement라는 것. 변수명 지정 필요없음

# 해당 함수내에 expression 등 값으로 존재하는 식일경우
변수에 저장을해서 따로 값을불러올 매개체를 만들어주는것도 필요

정리 : 식은 변수에 담고,
문은 그저 존재만으로 출력이 가능하다..

[예시 1] statement 함수속 expression 변수/변수에담고 print로 StringTenplate
fun checkNumber(score:Int){
    when(score){
        1->print("this is 1")
        2->print("tiis is 2")
    }
    var b = when(score){ //변수에 담고
        1 -> 5
        2 -> 10
        else 15
    } 
    print("b: $b") // String Template화
}
main {checkNumber(1)}
    출력:  this is 1, b : 5 

[예시 2] statement 함수속 statement 변수/ 필요없는 케이스..
fun checkNumber(score:Int){
    when(score){
        1->print("this is 1")
        2->print("tiis is 2")
    }
    var b = when(score){ //?? 어차피 그냥 바로 출력됨
        1 -> print("this is 5")
        2 -> print("this is 10")
        else print("this is anything")
    } 
    main {checkNumber(1)}
    출력:  this is 1, this is 5  
}
[예시 3] 


2. val과 var

2-1 차이점

val = value    / 변할 수 없는 값
[예시]
val a = 1   
a =2  / 불가능

var = variable / 변할 수 있는 값
[예시]
var a = 1
a = 2 / 가능 

2-2 var의 주의사항
[예시 1] a에 1을 담고 b값에 a를 String으로 바꾸고 싶을 때
(주의사항 예)
var a = 1
var b = a / 오류 
(옳은 예)
var a = 1 
var b = a.toString() / 가능

[주의사항 2] 값을 할당하지 않고 변수를 만드는 법/자료형 지정 유무
[잘못된 예] 
var a / 불가능
a = 1
[옳은 예]
var a:Int
a = 1

3. String Template
[예시 1] Stirng속 변수는 $
val name = "kane"
prinln("제 이름은 $name 입니다") 
[예시 1 단점] 붙여서 쓸 수 없음 $뒤에를 다 변수명으로 인식
println("제이름은$name입니다")
오류 : Unresolved reference: name입니다

[예시 2] 다 붙여서 쓰고 싶을 때
val name="kane"
println("제이름은${name}입니다")

[예시 3] $를 문자로 쓰고 싶은데 인식에 문제가 생길 때
(잘못된 예)
val money = 1000
println("${money}$를획득하였습니다")
오류 : Unresolved reference: 를획득하였습니다
(옳은 예)
val money = 1000
println("${money}\$를획득하였습니다") 
출력 : 1000$를획득하였습니다

4. 조건식
4-1 if문 / 파라미터에 대해 이럴때 이것 아니면 이것의 느낌이 더 강함
[예시1] 정석 if문 함수
fun maxBy(a:Int, b:Int):Int {
    if(a > b){
        return a
    }else {
        return b
    }
}
[예시2] if문 단일 표현식 함수 / 코틀린의 변수 타입추론으로 반환형 생략가능
fun maxBy(a:Int,b:Int) = if(a>b) a else b

4-2 when문 / 파라미터에 대해 이럴때 이것! 이럴때 이것! 간결하게 많은양 
[예시 1 ] statement when
fun checkNumber(score:Int){
    when(score){
        0 -> print("this is 0")
        1 -> print("this is 1")
        2,3 -> print("this is 2 or 3")
        else -> print("i don't know")
    }
}
[예시 2] expression when 
fun checkNumber(score:Int):Int{
    in 0..1 -> return 1
    in 2..10 -> return 10
    in 11..50 ->return 50
    else -> return 0
}







