package problem

class `problem2023-07-24-1` {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var ansList = ArrayList<Int>()
        var map = HashMap<Char,Int>()

        for ((count,letter) in s.withIndex()){
            if (!map.containsKey(letter)){
                map[letter] = count + 1
                ansList.add(-1)
            }else{
                ansList.add(count - map[letter]!! + 1)
                map[letter] = count + 1
            }
        }
        answer = ansList.toIntArray()
        return answer
    }
}