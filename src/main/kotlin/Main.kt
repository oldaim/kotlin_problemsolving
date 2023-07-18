import java.util.*
import kotlin.math.max
import kotlin.math.min

class Main

fun main() {
    solution(8,4, intArrayOf(2,3,6))
}



fun solution(n: Int, m: Int, section: IntArray): Int {
    var answer: Int = 0

    val first = section.first()
    val last = section.last()
    var distance = last - first

    while (distance >= 0){

        distance -= m
        answer++
    }
    println(answer)
    return answer
}

