package org.example;

public class Gato extends AnimalAB{

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
        quantidadeComida += 5;
    }

    @Override
    public void setAltura(float altura) {
        altura = 1.0F;
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
        nome = "Mel";
    }

    @Override
    public void setPeso(float peso) {
        peso = 1.2F;
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
