enum class UserRole(val accessLevel: Int)
{ ADMIN(3), EDITOR(2), VIEWER(1) }


fun checkUserAccess(role: UserRole, requiredLevel: Int): Boolean {
    return role.accessLevel >= requiredLevel
}

fun main() {
    val roles = listOf(UserRole.ADMIN, UserRole.EDITOR, UserRole.VIEWER)
    val requiredLevel = 2

    roles.forEach { role ->
        println("${role.name} access: ${checkUserAccess(role, requiredLevel)}")
    }
}