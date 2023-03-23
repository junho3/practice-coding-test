package y2023.m03.d08.test

data class SubOneParam(
    override val id: String,
    override val name: String,
    val subOneId: String,
) : MainParam(id, name)
