package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //doar se salário > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou comprar um curso de 500";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        //(CONDIÇÃO) ? VERDADEIRO : FALSO;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
