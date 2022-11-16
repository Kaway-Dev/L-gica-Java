package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        //Eu tenho uma variável de referência do tipo estudante, e para eu criar objetos eu sempre vou precisar a
        // palavra new e em seguida o nome do objeto que eu quero criar.
        Estudante estudante = new Estudante();
        //Essa parte aqui é variável aqui de referência = a new Estudante é o objeto.
        estudante.nome = "Narutin";
        estudante.idade = 21;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
