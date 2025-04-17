package org.example;

public class Cachorro extends AnimalAB{

    @Override
    public void dormir() {
        quantidadeHorasDormida += 10;
    }

    @Override
    public void moverse() {
        quantidadeCaminho += 12;
    }

    @Override
    public void comer() {
        quantidadeComida += 8;
    }

    @Override
    public void setAltura(float altura) {
        altura = 1.3F;
    }

    @Override
    public void setHabitat(String habitat) {
        habitat = "Domestico";
    }

    @Override
    public void setIdade(int idade) {
        idade = 12;
    }

    @Override
    public void setNome(String nome) {
        nome = "Bidu";
    }

    @Override
    public void setPeso(float peso) {
        peso = 1.34F;
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
