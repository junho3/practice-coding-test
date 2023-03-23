package y2023.m03.d08.test

class TestService {
    fun run() {
        val subOneClass = SubOneClass()
        val subTwoClass = SubTwoClass()

        subOneClass.run(SubOneParam("1", "2", "3"))
        subTwoClass.run(SubTwoParam("3", "4", "5"))
    }
}
