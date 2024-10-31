// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

fun main() {
    val conteudo1 = ConteudoEducacional("Kotlin Básico", Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Kotlin Avançado", Nivel.AVANCADO) // Cria duas instâncias da classe ConteudoEducacional

    val formacaoKotlin = Formacao(
            "Formação Kotlin Completa",
            listOf(conteudo1, conteudo2),
            listOf(Nivel.AVANCADO)
    ) // Cria uma instância da classe Formacao, definindo o nome, os conteúdos e o nível da formação, o tipo inferido é Nivel, mas List<Nivel> era esperado. Como posso resolver?
    val aluno = Usuario("João Silva", 25) // Cria uma instância da classe Usuario
    formacaoKotlin.matricular(listOf(aluno)) //Adiciona o aluno à lista de inscritos da formação
}
