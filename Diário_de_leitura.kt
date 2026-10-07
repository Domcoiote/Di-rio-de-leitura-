class Livro(
    val titulo: String,
    val totalPaginas: Int,
    val genero: Int,
    var citacao: String? = null
) {

    fun emocaoLeitura(): String {
        return when (genero) {
            1 -> "Viajando para outro mundo"
            2 -> "Lendo de luz acesa"
            3 -> "Aumentando o QI"
            else -> "Gênero não cadastrado"
        }
    }
}

class SessaoLeitura(
    val data: String,
    val paginasLidas: Int
)

class Leitor(
    val nome: String,
    val metaAnualPaginas: Int
) {

    val sessoes = mutableListOf<SessaoLeitura>()

    fun adicionarSessao(sessao: SessaoLeitura) {
        sessoes.add(sessao)
    }

    fun calcularPaginasLidas(): Int {
        var total = 0

        for (sessao in sessoes) {
            total += sessao.paginasLidas
        }

        return total
    }

    fun verificarMeta() {
        val paginasLidas = calcularPaginasLidas()

        if (paginasLidas >= metaAnualPaginas) {
            println("Parabéns! Você atingiu sua meta de leitura do ano!")
        } else {
            println("Você ainda não atingiu sua meta anual.")
            println("Faltam ${metaAnualPaginas - paginasLidas} páginas.")
        }
    }
}

fun main() {

    val livro = Livro(
        titulo = "O Hobbit",
        totalPaginas = 310,
        genero = 1,
        citacao = null
    )

    val leitor = Leitor(
        nome = "Vinícius",
        metaAnualPaginas = 1000
    )

    leitor.adicionarSessao(
        SessaoLeitura("01/10/2026", 100)
    )

    leitor.adicionarSessao(
        SessaoLeitura("03/10/2026", 80)
    )

    leitor.adicionarSessao(
        SessaoLeitura("05/10/2026", 70)
    )

    leitor.adicionarSessao(
        SessaoLeitura("07/10/2026", 60)
    )

    val paginasLidas = leitor.calcularPaginasLidas()

    val porcentagemConclusao =
        (paginasLidas.toDouble() / livro.totalPaginas.toDouble()) * 100

    println("===== DIÁRIO DE LEITURAS =====")
    println("Leitor: ${leitor.nome}")
    println("Livro: ${livro.titulo}")
    println("Total de páginas: ${livro.totalPaginas}")
    println("Páginas lidas: $paginasLidas")
    println("Progresso: ${"%.2f".format(porcentagemConclusao)}%")

    println("Emoção: ${livro.emocaoLeitura()}")

    val citacaoSalva =
        livro.citacao ?: "Nenhuma citação favorita registrada."

    println("Citação favorita: $citacaoSalva")

    leitor.verificarMeta()
}
