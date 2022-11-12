package Services

class dietaService {
	String dieta
	String refeicoes
	String janta
	boolean cheater = false

	String executar(String entrada) {
		prepararEntrada(entrada)
		verificarAlimentoForaDieta()

		if(cheater) return "CHEATER!"

		obterJanta()

		return janta

	}

	void prepararEntrada(String entrada) {
		List<String> elementos = entrada.tokenize(',')

		dieta = elementos[0]

		String cafeDaManha = elementos[1]
		String almoco = elementos[2]

		refeicoes = cafeDaManha + almoco
		refeicoes = refeicoes.trim()
	}

	void verificarAlimentoForaDieta() {
		for (String letra in refeicoes) {
			if (!dieta.contains(letra)) cheater = true
		}
	}


	void verificaRepeticao() {
		for() {

		}
	}

	void obterJanta() {
		janta = dieta
		for (String letra in refeicoes) {
			janta -= letra
		}
	}
}
