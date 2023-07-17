import java.util.*
import kotlin.math.max
import kotlin.math.min

class Main

fun main() {
    solution(arrayOf(".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."))
}



    fun solution(wallpaper: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var lux = Int.MAX_VALUE
        var luy = Int.MAX_VALUE
        var rdx = 0
        var rdy = 0

        for((count, y) in wallpaper.withIndex()){
            for((count2, x) in y.withIndex()){
                if(x == '#'){
                    lux = min(lux, count2)
                    luy = min(luy, count)
                    rdx = max(rdx, count2)
                    rdy = max(rdy, count)
                }
            }
        }





        answer = intArrayOf(luy, lux, rdy + 1, rdx + 1)
        return answer
    }

