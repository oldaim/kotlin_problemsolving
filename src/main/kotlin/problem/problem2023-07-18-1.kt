package problem

class `problem2023-07-18-1` {
    /*
    * 길이가 n 미터인 벽은 n개로 나눔 1미터가 한구역
    * 롤러가 m 일때
    * */
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0

        val boolean = BooleanArray(n) { false }

        for (sec in section){
            boolean[sec - 1] = true
        }

        var count = 0

        while (count < m){
            if(boolean[count]){
                for (i in count until count + m) {
                    if(count + m < count) boolean[i] = true
                }
                answer++
                count += m
            }else{
                count++
            }
        }

        return answer
    }

}