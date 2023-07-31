package problem

class `problem2023-07-31-2` {
    /*
    *  빈병 2개를 주면 콜라 1개를 줌
    *  20개 라면
    *  20 / 2 = 10 0
    *  10 / 2 = 5 0
    *  5 / 2 = 2 1
    *  2/ 2 = 1
    *  1 + 1 = 2
    *  2 / 2 = 1
    *  빈병 a 개를 주면 콜라 b 개를 주는 가게에 n개를 들고갔을때
    *
    *   일단 ( n / a ) * b
    *   나머지 ( n % a ) 고 a 개를 넘을때 마다 b 개 추가
    * */

    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var num = n
        var mod = 0
        var emptyBottle = 0

        while (num > 1){
            emptyBottle += (num / a) * b
            mod = num % a
            if(mod >= a) {
                emptyBottle += b
                mod -= a
            }

            num /= a

        }

        println(emptyBottle)

        answer = emptyBottle

        return answer
    }

}