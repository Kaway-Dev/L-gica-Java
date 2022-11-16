package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não autorizado a comprar...");
        }
        // É POSSÍVEL FAZER DA FORMA ABAIXO TAMBÉM, A DIFERENÇA É QUE UM ELSE SEMPRE VAI PRECISAR DE UM IF.

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcólica");
            //if (isAutorizadoComprarBebida == false) ESSA FORMA É MENOS USADA MAS DÁ PARA FAZER ASSIM TBM.
        }
    }
}
