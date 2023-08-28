public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();


        meuFilme.nome = "A volta dos que não foram";
        meuFilme.anoDeLancamento = 1988;
        meuFilme.duracaoEmMinutos = 45.5;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(12);
        meuFilme.avalia(10);
        System.out.println("Quantidade total das avaliações foram de: "+ meuFilme.totalDasAvaliacoes);


        meuFilme.pegaMedia();



    }
}
