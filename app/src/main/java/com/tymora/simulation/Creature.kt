abstract  class Creature: Entity() {
    abstract val speed: Int
    abstract val health: Int
    abstract fun makeMove()
    abstract fun lookAround()  // поиск пищи
}