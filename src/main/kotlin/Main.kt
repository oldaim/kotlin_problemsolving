import java.util.*
import kotlin.math.max
import kotlin.math.min

class Main


fun main() {
    solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200))
}

fun solution(k: Int, score: IntArray): IntArray {
    var answer: IntArray = intArrayOf()
    var list = ArrayList<Int>()
    var ansList = ArrayList<Int>()

    for ((count, s) in score.withIndex()){
        if(count < k - 1) {
            list.add(s)
            list.sort()
            list.reverse()

            ansList.add(list.last())
        }
        else{
            if (list[k -1] < s) {
                list.sort()
                list.reverse()
                ansList.add(s)
                list[k -1] = s
            }else{
                list.sort()
                list.reverse()
                ansList.add(list[k-1])
            }

        }
        println(list.toString())
    }

    answer = ansList.toIntArray()



    return answer
}

