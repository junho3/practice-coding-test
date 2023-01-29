package y2023.m01.d29.doit

import java.util.*

class SlidingWindow {
    private var result = 0
    private val counts = mutableListOf(0, 0, 0, 0) // ACGT
    private val queue: Queue<String> = LinkedList()

    fun init() {
        result = 0
        for (i in counts.indices) {
            counts[i] = 0
        }
        queue.clear()
    }

    fun run(dnas: List<String>, length: Int, validations: List<Int>): Int {
        // 초기 값 셋팅 (0 ~ 7)
        for (i in 0 until length) {
            addDna(dnas[i])
            validateDna(validations)
        }

        for (i in length until dnas.size) {
            removeDna()
            addDna(dnas[i])
            validateDna(validations)
        }

        return result
    }

    private fun addDna(dna: String) {
        queue.offer(dna)
        when (dna) {
            "A" -> counts[0]++
            "C" -> counts[1]++
            "G" -> counts[2]++
            "T" -> counts[3]++
        }
    }

    private fun removeDna() {
        when (queue.poll()) {
            "A" -> { if (counts[0] > 0) { counts[0]-- } }
            "C" -> { if (counts[1] > 0) { counts[1]-- } }
            "G" -> { if (counts[2] > 0) { counts[2]-- } }
            "T" -> { if (counts[3] > 0) { counts[3]-- } }
        }
    }

    private fun validateDna(validations: List<Int>) {
        if (validations[0] == counts[0] &&
            validations[1] == counts[1] &&
            validations[2] == counts[2] &&
            validations[3] == counts[3]
        ) {
            result++
        }
    }
}
