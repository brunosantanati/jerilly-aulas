package org.example;

public class Casa {

    private int numeroDeComodos;
    String cor;

    public int getNumeroDeComodos(){
        return this.numeroDeComodos;
    }

    public void setNumeroDeComodos(int numeroDeComodos){
        if(numeroDeComodos < 1){
            throw new RuntimeException("Numero de comodos nao pode ser menor que 1");
        }
        this.numeroDeComodos = numeroDeComodos;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "numeroDeComodos=" + numeroDeComodos +
                ", cor='" + cor + '\'' +
                '}';
    }
}
