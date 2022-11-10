import Services.dietaService

class app {
    static void main(String[] args){
        println "Hello World!"

        def Dservice = new dietaService()

        println Dservice.executar("EXMPLO,EX,P")

    }
}
