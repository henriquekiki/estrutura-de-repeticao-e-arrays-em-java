import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Digite seu nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            if (idade > 100) break;
        }

        


    }
}
