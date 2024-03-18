자릿수 더하기 
문제
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

[내 풀이]
class Solution(){
    fun solution(n:Int):Int{
        var answer = 0
        n.toString().forEach{answer+=it.digitToInt()}
        return answer
    }
}

[다른 사람의 풀이1]
class Solution {
    fun solution(n: Int): Int {
        var input = n
        var answer = 0

        while (input != 0) {
            answer += input % 10
            input /= 10
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer
    }
}