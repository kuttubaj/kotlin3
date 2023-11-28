fun main(args: Array<String>) {
    val commonCharacter = CharacterCommon

    val warrior = Character.Warrior("Aragorn")
    val mage = Character.Mage("Gandalf")
    val archer = Character.Archer("Legolas")

    println("Enter 0 for defense or 1 for attack:")
    val scanner = Skine(System.`in`)
    val input = scanner.nextInt()

    when (input) {
        0 -> {
            CharacterCommon.defend(warrior)
            CharacterCommon.defend(mage)
            CharacterCommon.defend(archer)
        }

        1 -> {
            commonCharacter.attack(mage)
            commonCharacter.attack(warrior)
            commonCharacter.attack(archer)
        }
    }
}