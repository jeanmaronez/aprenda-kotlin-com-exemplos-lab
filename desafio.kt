// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel {
                 BASICO,
    INTERMEDIARIO,
    AVANCADO
}

data class Usuario(
        val nome: String,
        val Idade: Int
)

data class ConteudoEducacional(
        val nome: String,
        val duracao: Int,
        val nivel: List<Nivel>
)

    data class Formacao(
        val nome: String,
        val conteudos: List<ConteudoEducacional>
) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main(vararg) {
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val usuario = Usuario("Jean", 31),
    val conteudo = ConteudoEducacional("Aprendendo Funções em Kotlin", 02, Nivel.INTERMEDIARIO),
    val formacao = Formacao("Formação em Kotlin", Nivel.AVANCADO)
}
