package parser

class Parser {

	String executar(String entrada) {
		String saida

		List acoes = entrada.tokenize(',')

		String numeroInicialDeAbasString = acoes.remove(0)
		String numeroDeAcoesString = acoes.remove(1)

		Integer numeroInicialDeAbas = new Integer(numeroInicialDeAbasString)
		Integer numeroDeAcoes = new Integer(numeroDeAcoesString)

		for (String acao : acoes) {
			if (acao == 'F') {

			} else if (acao == 'C') {

			}
		}

		return saida

	}
}
