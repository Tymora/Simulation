import kotlin.random.Random

fun main() {
    val lists = mutableListOf<List<Entity?>>()
    for (i in 0..<10) {
        val list = mutableListOf<Entity?>()
        for (j in 0..<10) {
            val r = Random.nextInt(6)
            when (r) {
                0 -> list.add(null)
                1 -> list.add(Herbivore(10, 100))
                2 -> list.add(Predator(10, 100, 20))
                3 -> list.add(Rock())
                4 -> list.add(Grass())
                5 -> list.add(Tree())
            }
        }
        lists.add(list)
    }
    val field = Field(lists)
    for (i in 0..<10) {
        for (j in 0..<10) {
            print("${lists[i][j]} ")
        }
        println()
    }
}
