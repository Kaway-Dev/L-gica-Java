package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    //Condição valor da parcela tem que ser >=1000.
    //Pode trocar o "i" por parcela que dá no mesmo. (Levar o parcela em consideração quando for ler).
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int i = 1; i <= valorTotal; i++) {
            double valorParcela = valorTotal / i;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+ i + " R$ " + valorParcela );
        }

    }
}
