package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        //Condição valor da parcela tem que ser >=1000.
        //Pode trocar o "i" por parcela que dá no mesmo. (Levar o parcela em consideração quando for ler).
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}