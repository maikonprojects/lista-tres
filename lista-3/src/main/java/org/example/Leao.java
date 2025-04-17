package org.example;

public class Leao extends AnimalAB{

    @Override
    public void dormir() {
        quantidadeHorasDormida += 19;
    }

    @Override
    public void moverse() {
        quantidadeCaminho += 4;
    }

    @Override
    public void comer() {
        quantidadeComida += 17;
    }

    @Override
    public void setAltura(float altura) {
        altura = 1.30F;
    }

    @Override
    public void setHabitat(String habitat) {
        habitat = "Terrestre";
    }

    @Override
    public void setIdade(int idade) {
        idade = 30;
    }

    @Override
    public void setNome(String nome) {
        nome = "Simba";
    }

    @Override
    public void setPeso(float peso) {
        peso = 120F;
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
