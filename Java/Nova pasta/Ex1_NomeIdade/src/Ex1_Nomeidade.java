import java.util.Scanner;

public class Ex1_Nomeidade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Metodo Scanner é utilizado para fazer a leitura de entradas e separar em blocos, o System.in é o comando para solicitar uma entrada de telcado.

        String nome;
        int idade;

        while(true) {
        System.out.println("Nome: ");
        nome = scan.next();
        if(nome.equals("0")) break;
        System.out.println("idade: ");
        idade = scan.nextInt();
        if(idade >140) {
            System.out.println("Erro de idade");
            break;
        }
       // System.out.println(nome + idade);
        }
    }
}
