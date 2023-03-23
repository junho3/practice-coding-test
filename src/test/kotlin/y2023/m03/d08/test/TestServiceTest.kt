package y2023.m03.d08.test

import io.kotest.core.spec.style.DescribeSpec

class TestServiceTest : DescribeSpec({

    describe("run") {
        context("호출하면") {
            val subOneClass = SubOneClass()
            it("실행한다.") {
                subOneClass.run(SubOneParam(id = "", name = "", subOneId = ""))
            }
        }
    }
})
