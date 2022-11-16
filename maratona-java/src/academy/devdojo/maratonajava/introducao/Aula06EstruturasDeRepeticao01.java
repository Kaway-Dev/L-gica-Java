package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //While, do While, for
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count = count + 1;
        }

        do {
            System.out.println("dentro do do-while");
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("for " + 1);
        }
    }
}
