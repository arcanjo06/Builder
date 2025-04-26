package builders;

import entities.Carro;

public class CarroBuilder {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int portas;
    private int autonomia;

    public CarroBuilder setMarca(String marca){
        this.marca=marca;
        return this;
    }
    public CarroBuilder setModelo(String modelo){
        this.modelo=modelo;
        return this;
    }
    public CarroBuilder setAno(int ano){
        this.ano=ano;
        return this;
    }
    public CarroBuilder setCor(String cor){
        this.cor=cor;
        return this;
    }
    public CarroBuilder setPortas(int portas){
        this.portas=portas;
        return this;
    }
    public CarroBuilder setAutonomia(int autonomia){
        this.autonomia=autonomia;
        return this;
    }

    public Carro build(){
        return new Carro(marca, modelo, ano, cor, portas, autonomia);
    }
}
