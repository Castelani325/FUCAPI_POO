//Otávio Castelani
//RA : 212466

public class Main {
    public static void main(String[] args) {

    /*    String titulo = "Título_Exemplo";
        String autor = "Fulado_Autor";
        int anoPublicacao = 2025;


        Livro_Fucapi_POO livro01 = new Livro_Fucapi_POO (titulo, autor, anoPublicacao);

        livro01.exibirDetalhe();
    }
    */
        double altura = 2.0;
        double largura = 2.0;

        Retangulo retangulo01 = new Retangulo(altura, largura);
        Retangulo retangulo02 = new Retangulo();

        retangulo01.calcularArea();
        retangulo01.calcularPerimetro();

        retangulo02.calcularArea();
        retangulo02.calcularPerimetro();


    }
}