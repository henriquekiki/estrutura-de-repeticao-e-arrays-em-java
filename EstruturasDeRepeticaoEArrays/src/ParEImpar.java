import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


    int quantNumeros;
    int count = 0;
    int numero;
    int quantPares = 0;
    int quantImpar = 0;


    System.out.println("Quantidade de números: ");
    quantNumeros = scan.nextInt();

    

    do{
        System.out.println("Números: ");
        numero = scan.nextInt();

        if ( numero % 2 == 0) quantPares++;
        else quantImpar++;

        
        count++;
    }while(count < quantNumeros);

    System.out.println("Quantidade de números Pares " + quantPares);
    System.out.println("Quantidade de números Ímpar " + quantImpar);
    }
    
}
