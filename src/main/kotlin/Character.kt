sealed class Character(
    val name: Text,
    val weaponType: WeaponType
) {
    data class Warrior(val ability: Text): Character(NAMEWARRIOR, WeaponType.SWORD)
    data class Mage(val ability: Text) : Character(MAGENAME, WeaponType.STICK)
    data class Archer(val ability: Text):Character(ARCHERNAME,WeaponType.BOW)

    companion object{
        const val NAMEWARRIOR ="Воин"
        const val MAGENAME ="Маг"
        const val ARCHERNAME ="Лучник"
    }

}