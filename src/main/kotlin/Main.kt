import java.util.*
import kotlin.math.max
import kotlin.math.min

class Main


fun main() {
    solution(intArrayOf(1,7,1,2))
}

fun solution(food: IntArray): String {
    var answer: String = ""
    var str = ""

    for ((count,el) in food.withIndex()){
        if(el % 2 == 1) {
            food[count] -= 1
            food[count] = food[count] / 2
        }else{
            food[count] = food[count] / 2
        }

    }

    for ((count,el) in food.withIndex()){
        if(count != 0) {
            var num = count

            for (i in 1..el) {
                str += num.toString()
            }
        }
    }


   answer = str + "0" + str.reversed()

    println(answer)

    return answer
}
