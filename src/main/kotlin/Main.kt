import java.util.*
import kotlin.collections.ArrayDeque
import kotlin.collections.ArrayList
import kotlin.math.max
import kotlin.math.min

class Main


fun main() {
    solution("5525", "1255")
}


fun solution(X: String, Y: String): String {
    var answer: String = ""
    val xMap = HashMap<Int, String>()
    val yMap = HashMap<Int, String>()
    val answerMap = HashMap<Int, String>()

    for (ch in X){
        var num = ch.toString().toInt()
        if(xMap.containsKey(num)){
            xMap[num] = xMap[num] + ch.toString()
        }else{
            xMap[num] = ch.toString()
        }
    }

    for (ch in Y){

        var num = ch.toString().toInt()

        if(yMap.containsKey(num)){
            yMap[num] = yMap[num] + ch.toString()
        }else{
            yMap[num] = ch.toString()
        }
    }

    var xKey = xMap.
    var yKey = yMap.keys

    for (x in xKey){
        if(yKey.contains(x)){

            var xString = xMap[x]!!
            var yString = yMap[x]!!

            answer += if (xString.length >= yString.length) yString else xString
        }
    }



    if (answer == "") return "-1"
    if (answer.startsWith("0")) return "0"

    println(answer)
    return answer
}

