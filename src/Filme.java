public class Filme {
    String nome;
    int anoDeLancamento;
    double duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;

    int totalDasAvaliacoes;

    void exibeFichaTecnica(){
        System.out.printf("""
                *******************
                        
                Nome do filme: %s
                        
                Ano de lançamento: %s
                        
                Duração em minutos: %s
                        
                %n""", nome, anoDeLancamento,duracaoEmMinutos);// se todas são Strings, não precisa o .formatted
        // .formatted( nome, anoDeLancamento, duraçãoEmMinutos)
        // , nome, anoDeLancamento, duracaoEmMinutos.

    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;// o valor de nota, será acumulado em soma das avaliações
        totalDasAvaliacoes++;// toda vez que o método avalia for chamado, o totalDasAvaliações será aumentado em 1,
        // ou seja, se chama-lo 3x vezes, ser valor será de 3
    }



    void pegaMedia(){
        System.out.println("A média das avaliações foram de: " + somaDasAvaliacoes / totalDasAvaliacoes);


    }

}
