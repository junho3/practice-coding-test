package y2023.m03.d08.test

data class SubTwoParam(
    override val id: String,
    override val name: String,
    val subTwoId: String,
) : MainParam(id, name)
