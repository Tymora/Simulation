class Herbivore(override val speed: Int, override val health: Int) : Creature() {
    /* Характеристики травоядных
    * -Местонахождение
    *  -??*/
    override fun makeMove() {
        TODO("Not yet implemented")
    }

    override fun lookAround() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "Herb"
    }
}