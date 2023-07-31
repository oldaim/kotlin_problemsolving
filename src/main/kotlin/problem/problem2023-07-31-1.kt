package problem

class `problem2023-07-31-1` {

    /*
    *  aya, ye, woo, ma 만 사용 가능
    *
    * */

    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val hashSet = hashSetOf<String>("aya","ye","woo","ma")
        val set = HashSet<String>()
        var st = ""

        for (say in babbling){

            for (ch in say){

                st += ch

                if (st.length == 2){

                    if (hashSet.contains(st) && !set.contains(st)) {
                        answer++
                        set.add(st)
                        st = ""
                    }
                }

                else if (st.length == 3){
                    if (hashSet.contains(st) && !set.contains(st)) {
                        answer++
                        st = ""
                    }
                }

                else break
            }

        }


        return answer
    }
}