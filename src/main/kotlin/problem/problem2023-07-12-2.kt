package problem

class `problem2023-07-12-2` {

    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        var map = HashMap<String,Int>()
        var ansList = ArrayList<Int>()
        var count = 0

        for (n in name){

            map[n] = yearning[count]
            count ++
        }

        for (arr in photo){
            var sum = 0
            for (el in arr){
                sum = map[el]!!
            }
            ansList.add(sum)
            sum = 0
        }

        return ansList.toIntArray()
    }

}