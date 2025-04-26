import builders.CarroBuilder;
import entities.Carro;
import java.util.Scanner;

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
            System.out.println("Escolha uma opção: ");
        
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
                    System.out.println("Digite a marca: ");
                    marca = scan.next();
                    carrobuilder.setMarca(marca);
                    break;
                case 2:
                    System.out.println("Digite o modelo: ");
                    modelo = scan.next();
                    carrobuilder.setModelo(modelo);
                    break;
                case 3:
                    System.out.println("Digite o ano: ");
                    ano = scan.nextInt();
                    carrobuilder.setAno(ano);
                    break;
                case 4:
                    System.out.println("Digite a cor: ");
                    cor = scan.next();
                    carrobuilder.setCor(cor);
                    break;
                case 5:
                    System.out.println("Digite a quantidade de portas: ");
                    portas = scan.nextInt();
                    carrobuilder.setPortas(portas);
                    break;
                case 6:
                    System.out.println("Digite a autonomia: ");
                    autonomia = scan.nextInt();
                    carrobuilder.setAutonomia(autonomia);
                    break;
                case 7:
                    Carro carro = carrobuilder.build(); 
                    System.out.println(carro.toString());
                    System.out.println("Pressione enter para continuar...");
                    scan.next();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

       
            
        }
        

        
        
    }
}
