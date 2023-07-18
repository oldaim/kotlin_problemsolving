package problem

import kotlin.jvm.internal.Intrinsics.Kotlin
import kotlin.math.min

class `problem2023-07-18-2` {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var ansList = ArrayList<Int>()
        val map = HashMap<Char,Int>()

        for (key in keymap){
            for ((count,el) in key.withIndex()){
                if(!map.containsKey(el)){
                    map[el] = count + 1
                }else{
                    map[el] = min(count + 1, map[el]!!)
                }
            }
        }

        for (target in targets){
            var sum = 0
            loop@ for(el in target){
                if(map.containsKey(el)){
                    sum += map[el]!!
                }else{
                    sum = -1
                    break@loop
                }
            }
            ansList.add(sum)
        }

        answer = ansList.toIntArray()
        return answer
    }
}