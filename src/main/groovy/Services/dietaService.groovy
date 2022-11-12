package Services

class dietaService {
	String dieta
	String refeicoes
	String janta
	boolean cheater = false

	String executar(String entrada) {
		prepararEntrada(entrada)

		verificarAlimentoForaDieta()
		//verificarRepeticao()
		if(cheater) return "CHEATER"


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
			if (!dieta.contains(letra))
			{
				cheater = true
			}
		}
	}

	void verificarRepeticao() {
		String dieta1 = dieta

		for(String letra in dieta1){
			dieta1 -= letra

			if(dieta1.contains(letra))
			{
				cheater = true
			}
		}

	}

	void obterJanta() {
		janta = dieta
		for (String letra in refeicoes) {
			janta -= letra
		}
	}

	
}
