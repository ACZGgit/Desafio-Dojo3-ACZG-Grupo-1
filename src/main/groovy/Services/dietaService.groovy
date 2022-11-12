package Services

class dietaService {
	String dieta
	String refeicoes
	String janta

	String executar(String entrada) {
		prepararEntrada(entrada)
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


	void verificaRepeticao(){
		for(int i =0; refeicoes.length(); i++){

		}
	}

	void obterJanta() {
		janta = dieta
		for (String letra in refeicoes) {
			janta -= letra
		}
	}
}
