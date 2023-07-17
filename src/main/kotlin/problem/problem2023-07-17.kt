package problem

import java.util.*

class `problem2023-07-17` {

    fun solution(wallpaper: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var boolean = Array(wallpaper.size){Array(wallpaper.first().length){false}}
        var queue = LinkedList<Char>()
        var start: Pair<Int,Int>

        for ((count,line) in wallpaper.withIndex()){
            for((count2,l) in line.withIndex()){
                if (l == '#'){
                    queue.add(l)
                    start = Pair(count,count2)

                }
            }

        }


        return answer
    }

}