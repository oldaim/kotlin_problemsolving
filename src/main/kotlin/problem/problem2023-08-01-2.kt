package problem

import java.util.HashMap
import java.util.SortedMap

class `problem2023-08-01-2` {

    fun solution(X: String, Y: String): String {
        var answer: String = ""
        val xMap = HashMap<Int, Int>()
        val yMap = HashMap<Int, Int>()
        val answerMap = HashMap<String,Int>()

        for (ch in X){
            var num = ch.toString().toInt()
            if(xMap.containsKey(num)){
                xMap[num] = xMap[num]!! + 1
            }else{
                xMap[num] = 1
            }
        }

        for (ch in Y){

            var num = ch.toString().toInt()
            if(xMap.containsKey(num)) {
                if (yMap.containsKey(num)) {
                    yMap[num] = yMap[num]!! + 1
                } else {
                    yMap[num] = 1
                }
            }
        }

        var xKey = xMap.keys
        var yKey = yMap.keys

        for (y in yKey){
            if(yKey.contains(y)){

                var xNum = xMap[y]!!
                var yNum = yMap[y]!!

                answerMap[y.toString()] = if (yNum >= xNum) xNum else yNum
            }
        }



        for (a in answerMap.keys.sortedDescending()){
            for (i in 0 until answerMap[a]!!){
                answer += a
            }
        }

        if (answer == "") return "-1"
        if (answer.startsWith("0")) return "0"


        return answer
    }
}