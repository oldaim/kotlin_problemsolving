import java.util.*
import kotlin.collections.ArrayDeque
import kotlin.collections.ArrayList
import kotlin.math.max
import kotlin.math.min

class Main


fun main() {
    solution(arrayOf(intArrayOf(10,7), intArrayOf(12,3), intArrayOf(8,15), intArrayOf(14,7), intArrayOf(5,15)))
}


fun solution(sizes: Array<IntArray>): Int {
    var answer: Int = 0

    var widthArray = sizes.sortedByDescending { it[0] }
    var heightArray =  sizes.sortedByDescending { it[1] }
    var countWidth = 0
    var countHeight = 0

    while (countHeight < widthArray.size && countWidth < widthArray.size){


        if (widthArray[countWidth][0] > heightArray[countHeight][1] && widthArray[countWidth][1] >= heightArray[countHeight][0] && widthArray[countWidth][1] > heightArray[countHeight][0]){
            countHeight += 1
        }else if (widthArray[countWidth][0] < heightArray[countHeight][1] && widthArray[countWidth][1] <= heightArray[countHeight][0] && widthArray[countWidth][1] < heightArray[countHeight][0]){
            countWidth += 1
        }else if (widthArray[countWidth][0] == heightArray[countHeight][1] && widthArray[countWidth][1] < heightArray[countHeight][0] && widthArray[countWidth][1] <= widthArray[countWidth][0]){
            countWidth += 1
        }else if (widthArray[countWidth][0] == heightArray[countHeight][1] && widthArray[countWidth][1] > heightArray[countHeight][0] && heightArray[countHeight][1] >= heightArray[countHeight][0]){
            countHeight += 1
        }else break

    }

    answer = widthArray[countWidth][0] * heightArray[countHeight][1]
    println(answer)
    return answer
}

