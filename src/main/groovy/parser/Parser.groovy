package parser

class Parser {

	String executar(String entrada) {
		String saida

		List acoes = entrada.tokenize(',')

		String numeroInicialDeAbasString = acoes.remove(0)
		String numeroDeAcoesString = acoes.remove(0)

		Integer numeroInicialDeAbas = new Integer(numeroInicialDeAbasString)
		Integer numeroDeAcoes = new Integer(numeroDeAcoesString)

		Integer numerodeAbas = numeroInicialDeAbas

		for (String acao : acoes) {
			//Manipulação do valor do numero de abas conforme o caso
			if (acao == 'F') {
				numerodeAbas = numerodeAbas + 1
			} else if (acao == 'C') {
				numerodeAbas = numerodeAbas - 1
			}
		}

		return numerodeAbas

	}
}
