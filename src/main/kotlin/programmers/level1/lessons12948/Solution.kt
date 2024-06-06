package programmers.level1.lessons12948

class Solution {
    fun solution(phoneNumber: String): String {
        var answer = ""

        answer = phoneNumber
            .substring(phoneNumber.length - 4, phoneNumber.length)
            .padStart(phoneNumber.length, '*')

        return answer
    }
}
