package Services

class dietaService {

	String executar(String entrada) {

		String alimentosDaJanta = 'ABCD,AB,C'
		List<String> elementos = alimentosDaJanta.tokenize(",")

		String dieta = elementos[0]
		String cafe_da_manha = elementos[1]
		String almoco = elementos[2]


		return alimentosDaJanta

	}
}
