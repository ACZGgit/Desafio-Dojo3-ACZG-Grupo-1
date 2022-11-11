package Services

class dietaService {
	String dieta
	String refeicoes

	String executar(String entrada) {
		prepararEntrada(entrada)

		String alimentosDaJanta = obterJanta()

		return alimentosDaJanta

	}

	void prepararEntrada(String entrada){
		List<String> elementos = entrada.tokenize(',')

		this.dieta = elementos[0]

		String cafeDaManha = elementos[1]
		String almoco = elementos[2]

		this.refeicoes = cafeDaManha + almoco
		this.refeicoes = this.refeicoes.trim()
	}

	String obterJanta(String dieta, String refeicoes) {


		return dieta.replaceAll(refeicoes,"")
	}
}
