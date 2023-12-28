class Predator(override val speed: Int, override val health: Int, val attack: Int) :Creature() {
    /* Характеристики хищников.
    * -Местонахождение */
    override fun makeMove() {
        TODO("Not yet implemented")
    }

    override fun lookAround() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "Pred"
    }

}