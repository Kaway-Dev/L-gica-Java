package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Imprima o dia da semana considerando 1 como domingo
        byte dia = 7;

        //char, int, byte, short ,
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sáb");
                break;
            default:
                System.out.println("Opção inválida");
                break;

        }
        char sexo = 'X';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
