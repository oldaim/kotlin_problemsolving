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
    val xMap = HashMap<Char, String>()
    val yMap = HashMap<Char, String>()


    for (ch in X){

        if(xMap.containsKey(ch)){

            xMap[ch] = xMap[ch] + ch.toString()
        }else{

            xMap[ch] = ch.toString()
        }
    }

    for (ch in Y){

        if(xMap.containsKey(ch)) {

            if (yMap.containsKey(ch)) {
                yMap[ch] = yMap[ch] + ch.toString()
            }
            else {
                yMap[ch] = ch.toString()
            }
        }
    }

    var yKey = yMap.keys.sortedDescending()

    for (y in yKey){


            var xString = xMap[y]!!
            var yString = yMap[y]!!

            answer += if (xString.length >= yString.length) yString else xString

    }



    if (answer == "") return "-1"
    if (answer.startsWith("0")) return "0"

    println(answer)
    return answer
}

