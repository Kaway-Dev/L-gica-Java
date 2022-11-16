package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *

        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;

        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // operadores lógicos - < e >   <= e >= ==(comparando, igual sozinho é atribuir) != diferente! Eles sempre
        // vão retornar valores booleanos.

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualDez = 10 == 15;
        boolean isDezDiferenteDez = 10 !=15.0;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);


        // Lógicos AND
        // &&(AND)   ||(OR)     !(NOT)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 4800;
        double valorFinal = valorTotalContaCorrente + valorTotalContaPoupanca;
        float valorPlay = 5000F;
        boolean isPlayCompravel =
                valorTotalContaCorrente > valorPlay || valorTotalContaPoupanca > valorPlay || valorFinal >= valorPlay;
        System.out.println("isPlayCompravel "+isPlayCompravel);

        //= += -= *= /= %= OPERAÇÕES PARA PESQUISAR DEPOIS, AULA 19.

    }

}
