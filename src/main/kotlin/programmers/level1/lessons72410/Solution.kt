package programmers.level1.lessons72410

class Solution {
    fun solution(new_id: String): String {
        var answer: String = ""

        // 1단계 소문자로 치환
        answer = new_id.lowercase()

        // 2단계
        answer = answer.filter {
            (it in 'a'.. 'z')
                || it.isDigit()
                || it == '-'
                || it == '_'
                || it == '.'
        }

        answer = answer.replace(Regex("[.]{2,}"), ".")

        if (answer.startsWith(".")) {
            answer = answer.substring(1, answer.length)
        }
        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length - 1)
        }

        if (answer.isEmpty()) {
            answer = "a"
        }

        if (answer.length >= 16) {
            answer = answer.substring(0, 15)
            if (answer.endsWith(".")) {
                answer = answer.substring(0, answer.length - 1)
            }
        }

        if (answer.length <= 2) {
            val lastString = answer.last()
            while (answer.length < 3) {
                answer += lastString
            }
        }

        return answer
    }
}
