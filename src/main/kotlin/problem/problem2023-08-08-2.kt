package problem

class `problem2023-08-08-2` {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0

        var widthArray = sizes.sortedByDescending { it[0] }
        var heightArray =  sizes.sortedByDescending { it[1] }
        var countWidth = 0
        var countHeight = 0

        while (countHeight < widthArray.size && countWidth < widthArray.size){


            if (widthArray[countWidth][0] > heightArray[countHeight][1] && heightArray[countHeight][1] > heightArray[countHeight][0]){
                countHeight += 1
            }else if (widthArray[countWidth][0] < heightArray[countHeight][1] && widthArray[countWidth][1] <= widthArray[countWidth][0]){
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
}