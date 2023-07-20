package problem

import java.time.LocalDate

import java.time.format.DateTimeFormatter

import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class `problem2023-07-20-1` {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var ansList = ArrayList<Int>()
        var termMap = HashMap<String, Int>()
        var privacyMap = HashMap<Int,LocalDate>()
        var sequencePrivacy = HashMap<Int, String>()
        var todayDate = LocalDate.parse(today.replace('.','-'), DateTimeFormatter.ofPattern("yyyy-MM-dd"))

        for (term in terms){
            var name = term.substringBefore(' ')
            var duration = term.substringAfter(' ')

            termMap[name] = duration.toInt()
        }

        for ((count,privacy) in privacies.withIndex()){
            var date = privacy.substringBefore(' ').replace('.','-')
            var name = privacy.substringAfter(' ')

            sequencePrivacy[count + 1] = name
            privacyMap[count + 1] = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        }

        for ( el in privacyMap){
            var count = el.key
            var name = sequencePrivacy[count]
            var date = el.value
            var deadLine = el.value.plusMonths(termMap[name!!]!!.toLong())

            if (deadLine.isBefore(todayDate) || deadLine.isEqual(todayDate)) ansList.add(count)

        }

        ansList.sort()

        answer = ansList.toIntArray()

        return answer
    }
}