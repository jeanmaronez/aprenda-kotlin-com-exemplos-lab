data class Formacao(
    val nome: String,
    val conteudos: List<ConteudoEducacional>,
    val nivel: List<Nivel>
) {
    private val inscritos = mutableListOf<Usuario>() // Lista mutável de usuários inscritos na formação

    fun listarUsuariosMatriculados(): List<Usuario> {
        return inscritos.toList() // Retorna uma cópia da lista de inscritos
    }

    fun matricular(usuarios: List<Usuario>) {
        inscritos.addAll(usuarios) // Adiciona todos os usuários da lista
    }
}
