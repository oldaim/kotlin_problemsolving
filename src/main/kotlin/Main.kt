import java.util.*

class Main

fun main() {
    solution(arrayOf(".#...", "..#..", "...#."))
}



    fun solution(wallpaper: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var boolean = Array(wallpaper.size){Array(wallpaper.first().length){false}}
        var height = wallpaper.size - 1
        var width = wallpaper.first().length - 1
        var queue = LinkedList<Pair<Int,Int>>()
        var start: Pair<Int,Int> = Pair(0,0)
        var end: Pair<Int,Int> = Pair(0,0)
        var dx = arrayOf(Pair(0,1),Pair(0,-1),Pair(1,0),Pair(-1,0))

        loop@ for ((count,line) in wallpaper.withIndex()){
             for((count2,l) in line.withIndex()){
                boolean[count][count2] = true
                if (l == '#'){
                    start = Pair(count,count2)
                    queue.add(start)
                    break@loop
                }
            }
            break
        }

        while (!queue.isEmpty()){
            var element = queue.pop()
            for (d in dx){
                var next = Pair( element.first + d.first, element.second + d.second )
                if (next.first >= 0 && next.first <= height && next.second >= 0 && next.second <= width){
                    if(!boolean[next.first][next.second]){
                        queue.add(next)
                        boolean[next.first][next.second]
                        if (wallpaper[next.first][next.second] == '#')
                            end = Pair(next.first,next.second)
                    }

                }

            }
        }
        println("${start.first} ${start.second}")
        println("${end.first} ${end.second}")

        return answer
    }

