package galassini.tecnology.exercmod_2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform