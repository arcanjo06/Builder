package entities;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public String km;
    private int portas;
    private int autonomia;

    public Carro(String marca, String modelo,int ano,String cor,int portas,int autonomia){
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.cor=cor;
        this.portas=portas;
        this.autonomia=autonomia;
    }

    public String toString(){
        return "AQUI ESTÁ SEU CARRO \n"+
        "Marca = "+marca+"\n"+
        "Modelo = "+modelo+"\n"+
        "Ano = "+ano+"\n"+
        "Cor = "+cor+"\n"+
        "Porta = "+portas+"\n"+
        "Autonomia = "+autonomia+"\n";


    }

}
