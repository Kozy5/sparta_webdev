// 한줄 주석입니다
/* 주석을
여러줄로 
달아볼까요 */
리스트 기본기 
# 변수명만으로 리스트 전체 반환 가능
arrayListOf
mutableList
listOf
var list = ?(1,2,3,4,5)
println(list) = [1,2,3,4,5]

[리스트 명(? 검색필요) 지정 하면서 리스트 반환 하는 방법]
a:$변수명

var list = listOf(1,2,3,4,5)

println("a:$list") = 1,2,3,4,5



유용한 함수정리
mutableList에서만 가능한

immutableList
var list = arrayListOf(1,2,3,4,5)
컬렉션.count() = return count items total number
ex) list.count() = 5
컬렉션.sum() = return items sum_total
ex) list.sum() = return 15
컬렉션.contains(element:E) = return boolean (item포함 true or false)
ex) list.contains(1) = return true
컬렉션.get(index:Int) = return index 위치에 item명
ex)list.get(0) = return 1
컬렉션.indexOf(element:E) = return item의 index값
ex)list.indexOf(1) = return 0
컬렉션.isEmpty() = return boolean
ex)list.isEmpty() = return false
컬렉션.subList(fromIndex:Int,toIndex:Int) = return from item ~ to item list계열에서 사용가능
ex)list.subList(0,3) = 1,2,3  // (form은 포함,to는 미포함)
컬렉션.max() = 값이 가장 큰 항목을 반환/항목이 없다면 null 반환
ex)list.max() = 5
컬렉션.min() = 값이 가장 작은 항목을 반환/항목이 없다면 null 반환
ex)list.min() = 1 
컬렉션.first() = 첫번째 항목을 반환
ex)list.first() = 1
컬렉션.last() = 마지막 항목을 반환
list.last() = 5
컬렉션.minus(element:T) = 지정된 항목이 제외된 리스트를 반환/remove() 메서드와 달리
새로운 리스트를 만들어 반환하는것에 유의.항목 대신 배열, 컬렉션, 범위 등이 들어 갈 수 있음 
ex)list.minus(1) = 2,3,4,5 
컬렉션.plus(element:T) 정된 항목이 제외된 리스트를 반환/add() 메서드와 달리
새로운 리스트를 만들어 반환하는것에 유의.항목 대신 배열, 컬렉션, 범위 등이 들어 갈 수 있음 
ex)list.plus(6) = 1,2,3,4,5,6
컬렉션.sort() = 데이터 오름차순 정렬 / mutableList에 사용
ex) var mutableListOf = mutableListOf(7,4,9,1,2)
mutableListOf.sort()
println(mutableListOf)
print(list) = 1,2,3,4,5
컬렉션.sorted() = 데이터 오름차순 정렬(Comparable 인터페이스에 구현된 순서대로)
 sort()와 달리 새로운 리스트를 만들어 반환 
ex)list.sorted() = 1,2,3,4,5 
컬렉션.reverse() = 리스트 역순 정렬 / mutableList에 사용함 
ex)list.reverse() = 5,4,3,2,1
컬렉션.reversed() = 리스트 역순 정렬
reverse()와 달리 새로운 리스트를 만들어 반환 
ex)list.reversed() = 5,4,3,2,1 
컬렉션.shuffle() = 리스트 순서 랜덤 셔플 / mutableList에 사용
ex)list.shuffle() = shuffle list
컬렉션.shuffled() = 리스트 순서 랜덤 셔플/ shuffle()과 달리 새로운 리스트를 반환
ex)list.shuffled() = shuffle list 
컬렉션.drop(n:Int) = 처음n개의 항목을 제외한 리스트 반환 
ex)list.drop(1) = 2,3,4,5
컬렉션.dropLast(n:Int) = 마지막 n개의 항목을 제외한 리스트 반환
ex)list.dropLast(1) = 1,2,3,4 
컬렉션.take(n:Int) = 첫 항목부터n개의 항목을 반환
ex)list.take(2) = 1,2
컬렉션.takeLast(n:Int) = 마지막 항목부터n개의 항목을 반환
ex)list.takeLast(2) = 4,5
컬렉션.clear() = 모든 항목을 제거 / / mutableList에서 사용
ex)list.clear() = [] 
컬렉션.add(element:E) = 리스트에 항목을 추가 / mutableList에서 사용
ex)list.add(6) = 1,2,3,4,5,6 
컬렉션.remove(element:E) = 하나의 항목을 제거 / mutableList에서 사용
ex)list.remove(5) = 1,2,3,4
컬렉션.removeAll(element:Collection) = 지정된 컬렉션 항목들 제거 / mutableList에서 사용
ex)list.removeAll(listOf(1,2,3,)) = 4,5
컬렉션.retainAll(element:Collction) = 지정된 컬렉션 항목만 남김 / mutableList에서 사용
ex)list.retainAll(listOf(1,2,3)) = 1,2,3



확장기능
var list2 = arrayListOf("Fe", "Fine")

# 시작 글자 startsWith / 끝 글자 endsWith 응용 2가지

1. all = 모든 item에 조건 부합여부
컬렉션.all {it.startsWith("?")} = return boolean 
ex) list2.all {it.startsWith("F")} = true
ex) list2.all {it.endsWith("e")} = true

2. any = 하나 이상 item에 부합여부
컬렉션.any {it.startsWith("?")} = return boolean 
ex) list2.any {it.startsWith("F")} = true
ex) list2.any {it.endsWith("e")} = true

컬렉션.asReversed() = return 리스트 역순
ex) list2.asReversed() = [Fine,Fe]
컬렉션.containseAll(listOf("Fe","Fine")) = return boolean 컬렉션 속 모든 요소 유무
ex) list2.containsAll(listOf("Fe","Fine")) = true
컬렉션.sortedBy{it}
컬렉션.filter()
컬렉션.filterNot()
컬렉션.find
컬렉션.findLast()
컬렉션.forEach{}
컬렉션.forEachIndexed{}
컬렉션.map{}
컬렉션.mapIndexed{}

메서드 MutableCollection






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

#6 증감연산자와 반복문
증감 연산자
● 증가 연산자 = ex) 전위형 ++a / 후위형 a++ = 변수의 값을 '1 증가'
● 감소 연산자 = ex) 전위형 --a / 후위형 a-- = 변수의 값을 '1 감소'
전위형연산자는 조건 참-> 증감 적용 -> 출력
후위형연산자는 조건 참-> 출력-> 증감적용
[전위형 연산자 예시]
ex) var a = 0
while(a < 5 ){
    println(++a)
}
출력 = 1,2,3,4,5 / 로직= a=0 < 5 true -> 0+1(증가적용) -> 출력 1 -> 증가된 a < 5 조건확인 반복

[후위형연산자 예시]
ex) var a = 0
while(a < 5 ){
    println(a++)
}
출력 = 0,1,2,3,4 / 로직= a=0 < 5 true -> 출력 0  -> 0+1(증가적용) -> 증가된a < 5 조건 확인 반복


반복문
● 조건형 반복문 = 조건이 참인경우 반복을 유지
● 범위형 반복문 = 반복 범위를 정해 반복을 수행

조건형 반복문
조건형1. while
[형태]
while(조건){
    반복할구문
}
로직 = 조건이 거짓일때 출력하지 않고 종료

조건형2. do...while
do
{
    반복할구문
}while(조건)
로직 = 조건과 관계없이구문을 최초 1회 실행하고, 조건이 거짓일때 출력하지 않고 종료


범위형 반복문
범위형 ● for
[형태]
for(i in a..b){
    반복할구문(i) //대체로 i 활용
}
로직 = a부터b까지 반복해서 출력하고 종료
특징 범위 부분에 숫자형 이외에도 알파뱃 순서('a'..'e') 이런것도 가능
