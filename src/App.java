import java.util.Scanner;

import builders.CarroBuilder;
import entities.Carro;

public class App {

    static Scanner scan= new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String marca = "";
        String modelo = "";
        int ano = 0;
        String cor = "";
        int portas = 0;
        int autonomia = 0;

        CarroBuilder carrobuilder= new CarroBuilder();

        System.out.println("---BEM--VINDO--AO--CRIADOR--DE--CARROS---");

        while (true) {
        
            System.out.println("1-Adicionar marca");
            System.out.println("2-Adicionar modelo");
            System.out.println("3-Adicionar ano");
            System.out.println("4-Adicionar cor");
            System.out.println("5-Adicionar portas");
            System.out.println("6-Adicionar autonomia");
            System.out.println("7-Verificar Seu Carro");
            System.out.println("8-Sair");

            int input= scan.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Digite a marca do seu carro:");
                    marca = scan.next();
                    continue;
                case 2:
                    System.out.println("Digite o modelo do seu carro:");
                    modelo = scan.next();
                    continue;
                case 3:
                    System.out.println("Digite o ano do seu carro:");
                    ano = scan.nextInt();
                    continue; // limpar buffer
                    
                case 4:
                    System.out.println("Digite a cor do seu carro:");
                    cor = scan.next();
                    continue;
                case 5:
                    System.out.println("Digite a quantidade de portas do seu carro:");
                    portas = scan.nextInt();
                    continue; // limpar buffer
                    
                case 6:
                    System.out.println("Digite a autonomia do seu carro (em km):");
                    autonomia = scan.nextInt();
                    continue; // limpar buffer
            
                case 7:
                    Carro carro = carrobuilder.setMarca(marca).setModelo(modelo).setAno(ano).setCor(cor).setPortas(portas).setAutonomia(autonomia).build();
                    System.out.println("\n---SEU CARRO---");
                    System.out.println(carro.toString());
                    scan.next();
                    continue;
                    
                case 8:
                    System.out.println("Saindo... Até logo!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
       
            
        }
        

        
        
    }
}
