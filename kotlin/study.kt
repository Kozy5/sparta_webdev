// 한줄 주석입니다
/* 주석을
여러줄로 
달아볼까요 */

# 기본 주의사항
fun main(){
    var a:Int // 이렇게만 선언 할 시 warning
    println(a) // 이 상태로 출력 시 error

    null pointer exception
}

# 변수 선언 방식 

1. 자료형 지정 후 변수의 값넣기
var a:Int 
a = 123
2. 자료형 지정과 함께 변수의 값넣기
var a:Int = 123




# 기본 자료형 (primitive type)

숫자형

Byte 8bits
Short 16bits
Int 32bits
Long 64bits

실수형
Double 64bits
Float 32bits

정수형의 리터럴(리터럴* 코드 내에 값을 표기하는 것)
10진수, 16진수, 2진수

var intValue:Int = 1234 // 기본형
var longValue:Long = 1234L
var intValueByHex:Int = 0x1af //16진수 0x x=hexadecimal
var intValueByBin:Int = 0b10110110 //2진수 0b b= binary

실수형의 리터럴

var doubleValue:Double= 123.5
var doubleValueWithExp:Double = 123.5e10 // e는 exponential의 약어
var floatValue:Float = 123.5f 


캐릭터 리터럴유니코드 인코딩 방식인(UTF-16 BE)
// 글자 하나하나가 2byte(16bits) 

var charValue:Char = 'a' 
\t 탭
\b 백스페이스
\r 첫 열로 커서 옮김
\n 개행
\' 작은 따옴표
\"    " 큰 따옴표
\\ 역 슬래시
\$ $문자
\uxxxx 유니코드 문자

논리형
var booleanValue:Boolean = true

문자열
val stringValue ="one line string test" 

val mulitlineStringValue = """ multiline
string
test"""


#3 형변환
★논리형은 형변환 불가능

명시적 형변환 = 변환될 자료형을 개발자가 직접 지정함

암시적 형변환 = 변수를 할당할 시 자료형을 
지정하지 않아도 자동으로 형변환 됨

/*
#   형변환시 생겨나는 오류를 막기 위해 
코틀린은 암시적 형변환은 지원하지 않음.

# 형 변환시 호환이 가능한지 여부를 체크하여
변환여부를 확인할 수 있는 방법은 클래스 배울 때 다시 교육
*/
toByte()
toShort()
toInt()
toLong()
toFloate()
toDouble()
toChar()

[잘못된 예]
var a:Int = 54321
var b:Long = a /*  이렇게 할당만 할 시 
Type mismatch (자료형이 맞지 않는다는 에러가 남)
*/
[옳은 예]
var a:Int = 54321
var b:Long = a.toLong()

#3-1 배열 array

Array<T> // <T> 제너릭

[배열 만드는 법]
var intArr = arrayof(1,2,3,4,5) // 0~4 index
var nullArr = arrayOfNulls<Int>(5) // 0~4 index 

[배열 활용하는법]
intArr[index]
nullArr[4] = 15
println(nullArr[4]) // 15출력

#4 함수 
특정한 동작을 하거나 원하는 결과값을 얻을 때 사용
function에 준말인 "fun" 으로 시작
                  /* 반환형 */ 
fun 함수명(a:자료형):자료형{
    
}

return 
/* 함수 안에서 return은 
1. 뒤에 오는 값을 반환
2. 함수 종료
*/

단일 표현식 함수 (한가지 기능만 하는 경우에 쓰임)
[기본형태]
fun 함수명(a:자료형):자료형/<-반환형/{
    return a+b+c    
}
[단일 표현식 함수 형태] 반환형 생략 가능
fun 함수명(a:자료형) = a + b + c

코틀린에서 함수는 쉽게 생각하면
1. 파라미터를 넣는
2. 자료형이 결정 된 변수
함수형 언어라는 코틀린의 특징 이해하기 쉬움




#5 조건문과 비교연산자

5-1 조건문 if 참과 거짓을 구분하여 실행
1. 주어진 값이 참이라면 
2. 따라오는 구문을 실행

[예시 1] 참일 경우만 실행
var a = 7 
if(a>10) {
    println("a는10보다 크다")
}
[예시 1]에 경우 거짓이므로 실행 되지않음


[예시 2] 참일 경우,거짓일 경우
var a = 7 
if(a>10) {
    println("a는10보다 크다")
}else {
    println("a는 10보다 작거나 같다")
}
[예시 2] 거짓이므로 else 구문 실행 

1. 중괄호 치는 이유는 실행해야할 구문이 여러개 일수도 있기때문
2. 한가지만 실행 한다면 중괄호 생략 가능
# 비교연산자를 많이 이용함

5-2 비교 연산자 
1. 부등호
<   작다
<=  작거나 같다
>   크다
>=  크거나 같다
!=  같지 않다

2. 등호
== 같다
// 할당연산자( = ) 와 구분하기 위해 2개 사용

3. 자료형 체크 연산자
is 자료형 맞는지 체크하는 연산자

!is 자료형이 틀린지 체크하는 // 낫 이즈 연산자

※ 변수 is 자료형 구조로 작성하면
1. 좌측 변수가 우측 자료형에 호환되는지 여부 체크하고
2. 형변환까지 한번에 해줌!

5-3 when

fun doWhen(a:Any) //
※Any라는 자료형은 어떤 자료형이든 상관없이 호환되는
코틀린 최상위 자료형

[when을 조건에 맞는 동작을 하는 조건문으로써 사용!]
fun doWhen(a:Any){
    when(a){
        1 -> println("정수 1입니다")
        "guma" -> println("구마의 코틀린")
        is Long -> println("Long타입입니다")
        !is String -> println("String타입이 아닙니다")
        else -> println("어떤 조건도 맞지 않습니다.")
    }
}
when 주의사항
1. 등호와 부등호 사용불가능
2. 여러개의 조건이 맞을경우에 먼저 부합하는 조건이 실행됨

[실행 예시]
doWhen(1)
doWhen("guma")
doWhen(13L)
doWhen(3.14159)
doWhen("kotlin")

[출력값]
"정수 1입니다"
"구마의 코틀린"
"Long 타입입니다."
"String타입이 아닙니다"
"어떤 조건도 맞지 않습니다."

[when조건이 맞을때 값을 반환하는 표현식!]
fun doWhen(a:Any){
    var result = when(a){
        1 -> "정수 1입니다"
        "guma" -> "구마의 코틀린"
        is Long -> "Long타입입니다"
        !is String -> "String타입이 아닙니다"
        else -> "어떤 조건도 맞지 않습니다."
    }
}
[실행 예시]
println(result)

[출력값]
"정수 1입니다"
"구마의 코틀린"
"Long 타입입니다."
"String타입이 아닙니다"
"어떤 조건도 맞지 않습니다."

[혼자 실습해본]
fun main() {
    
    doWhen("이군이군이군이군이군")
         
}

fun doWhen(a:Any){
       when(a){
           is String -> println("이제부터 내 닉네임은 ${a}이군 알겠어!")
           is Int -> println("제 몸무게는 ${a}kg 입니다.")
           is Float -> println("${a} 오호라 플로트라 오랜만일세")
           is Double -> println("원의 반지름 파이는 바로 ${a}")
           'g' -> println("뭐야 구마의 ${a}??? 너 구마를 어떻게 알아? 정체가 뭐냐!!")
           else -> println("뭐라고 하는지 못 알아 듣겄다!")
       }
}


