//Otávio Castelani
//RA : 212466

import Aula_04.Funcionario;
import Aula_04.Termostato;


public class Main {
    public static void main(String[] args) {

        // Aula 03 (Início)

        /*    String titulo = "Título_Exemplo";
        String autor = "Fulado_Autor";
        int anoPublicacao = 2025;


        Aula_03.Livro_Fucapi_POO livro01 = new Aula_03.Livro_Fucapi_POO (titulo, autor, anoPublicacao);

        livro01.exibirDetalhe();
        }

        double altura = 2.0;
        double largura = 2.0;

        Aula_03.Retangulo retangulo01 = new Aula_03.Retangulo(altura, largura);
        Aula_03.Retangulo retangulo02 = new Aula_03.Retangulo();

        retangulo01.calcularArea();
        retangulo01.calcularPerimetro();

        retangulo02.calcularArea();
        retangulo02.calcularPerimetro();
        */
        // Aula 03 (Fim)


        // Aula 04 (Início)
/*
        String nome = "Carlos";
        Double salario = 1000.0;
        String cargo = "Analista";

        Funcionario funcionario = new Funcionario(nome, salario, cargo);

        funcionario.exibirDetalhes();

        String textoDoCargo = funcionario.getCargo();
        String textoDONome = funcionario.getNome();
        Double textoDoSalario = funcionario.getSalario();

        System.out.printf("\n Cargo atual : %s", textoDoCargo);
        System.out.printf("\n Nome atual : %s", textoDONome);
        System.out.printf("\n Salário atual : %.2f", textoDoSalario);


        funcionario.setCargo("Desenvolvedor");
        funcionario.setSalario(2000);
        funcionario.aumentaSalario(5);

        funcionario.exibirDetalhes();
*/
        // Aula 04 (Fim).

        // Aula 05 (Início)

        double temperaturaDesejada = 25 ;

        Termostato termostato = new Termostato(null,20);
        termostato.obterStatus();
        termostato.exibirDetalhes();

        termostato.getTemperaturaAtual();
        termostato.getTemperaturaDesejada();

        termostato.simularMudancaTemperatura(26);

        termostato.exibirDetalhes();
        termostato.obterStatus();

        // Aula 05 (Início)

    }
}