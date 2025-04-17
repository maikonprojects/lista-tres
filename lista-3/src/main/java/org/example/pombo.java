package org.example;

public class pombo extends AnimalVoadorAB{

    @Override
    public void dormir() {
        quantidadeHorasDormida += 10;
    }

    @Override
    public void comer() {
        quantidadeComida += 8;
    }

    @Override
    public void voar() {
        super.voar();
    }

    @Override
    public void setAltura(float altura) {
        altura = 0.5F;
    }

    @Override
    public void setHabitat(String habitat) {
        habitat = "Florestal";
    }

    @Override
    public void setIdade(int idade) {
        idade = 10;
    }

    @Override
    public void setNome(String nome) {
        nome = "Fred";
    }

    @Override
    public void setPeso(float peso) {
        peso = 0.23F;
    }

    @Override
    public void setQuantidadePatas(int quantidadePatas) {
        quantidadePatas = 2;
    }

    @Override
    public void setTipoAnimal(String tipoAnimal) {
        tipoAnimal = "Columba Livia";
    }

}
