package problem

class `problem2023-08-08-1` {
    fun solution(n: Int): Int {
        var answer: Int = 0

        for (i in 0 .. n){
            if(n % i == 1) {
                answer = i
                break
            }
        }

        if (answer == 0) answer = n - 1
        return answer
    }
}