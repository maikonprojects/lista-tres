package org.example;

public class AnimalAB implements AnimalIF{

    int quantidadeComida;
    int quantidadeCaminho;
    int quantidadeHorasDormida;
    String nome;
    String tipoAnimal;
    int idade;
    String habitat;
    int quantidadePatas;
    float altura;
    float peso;

    @Override
    public void comer() {

    }

    @Override
    public void moverse() {

    }

    @Override
    public void dormir() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
