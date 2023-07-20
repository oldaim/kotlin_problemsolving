package problem

class `problem2023-07-20-2` {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        var sub = p.length
        var subLong = p.toLong()

        for (i in t.indices){
            var next = i + sub
            if(next > t.length) break
            var subLongNext = t.substring(i, i+sub).toLong()
            if(subLongNext <= subLong) answer++
        }


        return answer
    }
}