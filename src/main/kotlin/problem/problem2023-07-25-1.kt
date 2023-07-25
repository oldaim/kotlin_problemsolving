package problem

class `problem2023-07-25-1` {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var list = ArrayList<Int>()
        var ansList = ArrayList<Int>()

        for ((count,s) in score.withIndex()){
            if(count < k) {
                list.add(s)
                list.sort()
                list.reverse()
            }
            else{
                if (list[k] < s) {
                    ansList.add(list[k])
                    list[k] = s
                }
            }
        }

        answer = ansList.toIntArray()

        println(answer)

        return answer
    }
}