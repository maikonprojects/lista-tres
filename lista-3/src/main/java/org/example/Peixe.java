package org.example;

public class Peixe extends AnimalMarinhoAB{

    @Override
    public void dormir() {
        quantidadeHorasDormida += 10;
    }

    @Override
    public void comer() {
        quantidadeComida += 8;
    }

    @Override
    public void nadar() {
        super.nadar();
    }

    @Override
    public void setAltura(float altura) {
        altura = 0.4F;
    }

    @Override
    public void setHabitat(String habitat) {
        habitat = "Aquático";
    }

    @Override
    public void setIdade(int idade) {
        idade = 2;
    }

    @Override
    public void setNome(String nome) {
        nome = "peixe";
    }

    @Override
    public void setPeso(float peso) {
        peso = 0.1F;
    }

    @Override
    public void setTipoAnimal(String tipoAnimal) {
        tipoAnimal = "Mamífero Aquático";
    }
}
