package org.example;

public class Elefante extends AnimalAB{

    @Override
    public void dormir() {
        quantidadeHorasDormida += 8;
    }

    @Override
    public void moverse() {
        quantidadeCaminho += 20;
    }

    @Override
    public void comer() {
        quantidadeComida += 20;
    }

    @Override
    public void setAltura(float altura) {
        altura = 3.2F;
    }

    @Override
    public void setHabitat(String habitat) {
        habitat = "Savana";
    }

    @Override
    public void setIdade(int idade) {
        idade = 14;
    }

    @Override
    public void setNome(String nome) {
        nome = "Dumbo";
    }

    @Override
    public void setPeso(float peso) {
        peso = 60000F;
    }

    @Override
    public void setQuantidadePatas(int quantidadePatas) {
        quantidadePatas = 4;
    }

    @Override
    public void setTipoAnimal(String tipoAnimal) {
        tipoAnimal = "Mamífero";
    }

}
