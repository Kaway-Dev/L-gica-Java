package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean > esses são os tipos primitivos.
        int age = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Philippe";


        System.out.println("A idade é "+age+" anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println("Oi, meu nome é "+nome);

    }
}
