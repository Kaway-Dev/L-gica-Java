package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        //Utilizando switche e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        //considerando 1 como domingo


        //Dá para fazer dessa forma também, menos linhas de cód.
        byte dia = 10;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("DIA ÚTIL");
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
                break;
        }
    }
}
