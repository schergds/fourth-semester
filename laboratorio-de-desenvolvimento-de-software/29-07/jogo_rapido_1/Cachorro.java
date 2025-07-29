package jogo_rapido_1;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String som, String raca) {
        super(nome, idade, som);
        this.raca = raca;
    }

    public void latir(){
        System.out.println(getSom());
    }
}
