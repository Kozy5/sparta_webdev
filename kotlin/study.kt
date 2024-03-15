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
