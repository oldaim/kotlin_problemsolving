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

                ansList.add(list.last())
            }
            else{
                if (list[k -1] < s) {

                    list[k -1] = s
                    list.sort()
                    list.reverse()
                    ansList.add(list[k-1])
                }else{
                    ansList.add(list[k-1])
                }
                list.sort()
                list.reverse()
            }

        }

        answer = ansList.toIntArray()



        return answer
    }
}