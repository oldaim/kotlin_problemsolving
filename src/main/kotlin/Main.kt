import java.util.*
import kotlin.math.max
import kotlin.math.min

class Main


fun main() {
    solution(3, 4, intArrayOf(1,2,3,1,2,3,1))
}

fun solution(k: Int, m: Int, score: IntArray): Int {
    /*
    * 사과는 상태에 따라 1,k 까지
    * 한상자에 m 개씩 담아 포장 합니다. 남는 사과는 버립니다. 상자개수 score.length / m
    * 과일 장수가 얻을 수 있는 최대 이익
    * 그러면 각 상자당 최저 점수
    * */
    var answer: Int = 0
    var numOfBox = (score.lastIndex + 1) / m
    var mod = (score.lastIndex + 1) % m
    var scoreList = score.toMutableList()

    if (numOfBox == 0) return 0

    scoreList.sort()
    println(scoreList.toString())
    var boxList = scoreList.subList(mod, scoreList.lastIndex + 1)

    println(boxList.toString())

    var count = 0
    var first = 0
    while (count < numOfBox){

        var subList = boxList.subList(first, first + m)
        println(subList)
        answer += subList.first() * m

        first += m
        count++
    }

    println(answer)

    return answer
}
