import java.util.*
import kotlin.collections.ArrayDeque
import kotlin.collections.ArrayList
import kotlin.math.max
import kotlin.math.min

class Main


fun main() {
    solution(intArrayOf(2, 1, 1, 2, 3, 1, 2, 3, 1))
}

fun solution(ingredient: IntArray): Int {
    var answer: Int = 0
    var gred = ingredient.toList()
    var ones = ArrayDeque<Int>()
    var count = 0

    while (count < gred.size - 3){
        if(check(gred, count, count)){
            answer++

            if (ones.size != 0 && count + 4 < gred.size){
                if (check(gred, ones.last(),count + 3)) {
                    answer++
                    ones.removeLast()
                }
            }
            count += 4
        }else{
            if (gred[count] == 1) ones.addLast(count)
            count++
        }

    }

    println(answer)

    return answer
}

fun check(list: List<Int>, fIndex: Int, lIndex: Int): Boolean =
    list[fIndex] == 1 && list[lIndex + 1] == 2 && list[lIndex + 2] == 3 && list[lIndex + 3] == 1

fun cutList(list: List<Int>, index: Int): List<Int> {
    var newList = ArrayList<Int>()
    newList.addAll(list.subList(0,index))

    newList.addAll(list.subList(index + 4, list.lastIndex + 1))
    return newList
}

