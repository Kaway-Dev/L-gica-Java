package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros1 = new int[3];
        int[] numeros2 = {5,4,3,2,1};
        //int[] numeros = new int[] {5,4,3,2,1}; OUTRA FORMA DE DECLARAR.

        //for (int i = 0; i < numeros2.length; i++) {
          //  System.out.println(numeros2[i]);

        for (int num: numeros2) {
            System.out.println(num);
        }
    }
}
