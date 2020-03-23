package tadVector;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do seu vetor");
        int tam = input.nextInt();

        Vector vector = new Vector(tam);

        
        while(true){
            System.out.println("--------MENU--------");

            System.out.println(
                "Digite [1] para saber a quantidade de elementos \n" +
                "Digite [2] para saber se ta vazio \n"+
                "Digite [3] para buscar um elemento \n"+
                "Digite [4] para inserir elemento \n"+
                "Digite [5] para remover um elemento \n"+
                "Digite [6] para substituir um elemento \n"+
                "Digite [7] para listar os elementos \n"
            );

            int entradaMenu = input.nextInt();

            if(entradaMenu == 1){
                vector.quantElementos();
            }
            if(entradaMenu == 2){
                System.out.println("Vazio: " + vector.taVazia());
            }
            if(entradaMenu == 3){
                System.out.println("Digite a posição do elemento");
                int indice = input.nextInt();
                Object o = vector.pincaPosicao(indice);
                System.out.println(o.toString());
            }
            if(entradaMenu == 4){
                System.out.println("Digite a posição em que deseja inserir");
                int indice = input.nextInt();
                System.out.println("Digite o que tem no objeto");
                String objeto = input.nextLine();
                vector.inserir(indice, objeto);
                System.out.println("Objeto incluso"); 
            }
            if(entradaMenu == 5){
                System.out.println("Digite a posição que deseja remover");
                int indice = input.nextInt();
                vector.remover(indice);
            }
            if(entradaMenu == 6){
                System.out.println("Digite a posição do elemento que deseja substituir");
                int indice = input.nextInt();
                System.out.println("Digite o que tem no objeto");
                String objeto = input.nextLine();
                vector.substituicao(indice, objeto);
            }
            if(entradaMenu == 7){
                vector.listar();
            }
        }
    }
}
