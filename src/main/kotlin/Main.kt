import java.util.*
import kotlin.collections.ArrayDeque
import kotlin.collections.ArrayList
import kotlin.math.max
import kotlin.math.min

class Main


fun main() {
    solution(3,1,20)
}


fun solution(a: Int, b: Int, n: Int): Int {
    var answer: Int = 0
    var num = n
    var mod = 0
    var emptyBottle = 0

    while (num >= 1){
        emptyBottle += (num / a) * b


        num = num - (num / a) * a + (num / a) * b

    }

    println(emptyBottle)

    answer = emptyBottle

    return answer
}

