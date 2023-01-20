package y2023.m01.d20.dongbin

class GreatestAdventurerGroup {
    fun run(adventurers: List<Int>): Int {
        var result = 0

        adventurers.sorted()
            .fold(mutableListOf<Int>()) { group, adventurer ->
                group.add(adventurer)

                if (adventurer == group.size) {
                    result++
                    mutableListOf()
                } else {
                    group
                }
            }

        return result
    }
}
