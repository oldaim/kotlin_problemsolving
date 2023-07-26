import java.util.*
import kotlin.math.max
import kotlin.math.min

class Main


fun main() {
    solution(10, 3, 2)
}

fun solution(number: Int, limit: Int, power: Int): Int {
    /*
    * 프로그래머스 Level 기사 단원의 무기
    * 각 기사에게는 1번부터 Number 까지 번호가 지정
    * 무기 구매 -> 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기 구매
    * limit 이상이라면 power 크기의 무기 구매해야함
    * 1kg 당 공격력 1
    * 몇키로? = answer
    * */

    var answer: Int = 0

    for(num in 1 .. number){
        var ans = 0
        ans = if (limit < numOfDivisor(num)) power else numOfDivisor(num)
        answer += ans
    }

    println(answer)

    return answer
}

fun numOfDivisor(num: Int): Int {
    var answer = 0;
    for (i in 1 .. num){
        if(num % i == 0) {
            when {
                num / i < i -> {
                    answer *= 2
                    return answer
                }
                num / i == i -> {
                    answer++
                    answer = answer * 2 - 1
                    return answer
                }
                else -> {
                    answer++
                }

            }
        }
    }
    return answer
}

