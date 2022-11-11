package Services

class dietaService {
	String dieta
	String refeicoes

	void separar(String entrada){
		List<String> elementos = entrada.tokenize(",")

		this.dieta = elementos[0]

		String cafeDaManha = elementos[1]
		String almoco = elementos[2]

		this.refeicoes = cafeDaManha + almoco
	}

	String executar(String entrada) {

		separar(entrada)


		return alimentosDaJanta

	}
}
