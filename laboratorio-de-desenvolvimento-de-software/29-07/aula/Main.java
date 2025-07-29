package aula;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Taviko", 360);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
