package problem

class `problem2023-07-26-1` {
    fun solution(number: Int, limit: Int, power: Int): Int {
        /*
        * 프로그래머스 Level 기사 단원의 무기
        * 각 기사에게는 1번부터 Number 까지 번호가 지정
        * 무기 구매 -> 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기 구매
        * limit 이상이라면 power 크기의 무기 구매해야함
        * 1kg 당 공격력 1
        * 몇키로? = answer
        * 약수나 배수같은건 미리 배열로 저장해서 푸는게 좋다
        * */

        var answer: Int = 0

        for(num in 1 .. number){
            var ans = 0
            ans = if (limit < numOfDivisor(num)) power else numOfDivisor(num)
            answer += ans
        }

        println(answer)

        return answer
    }

    fun numOfDivisor(num: Int): Int {
        var answer = 0;
        for (i in 1 .. num){
            if(num % i == 0) {
                when {
                    num / i < i -> {
                        answer *= 2
                        return answer
                    }
                    num / i == i -> {
                        answer++
                        answer = answer * 2 - 1
                        return answer
                    }
                    else -> {
                        answer++
                    }

                }
            }
        }
        return answer
    }
}