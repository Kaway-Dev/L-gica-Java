package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double irá imprimir 0
        //char '\u0000' irá imprimir nada
        // boolean false
        //String null

        String [] nomes = new String[3];
        nomes [0] = "Kakashi";
        nomes [1] = "Naruto";
        nomes [2] = "Itachi";

        //Length(PROPRIEDADE DO ARRAY QUE DIRÁ O SEU TAMANHO) IRÁ RETORNAR O TAMANHO DO ARRAY.
        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
