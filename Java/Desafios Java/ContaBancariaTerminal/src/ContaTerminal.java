import java.util.*;
public class ContaTerminal {
    public static void main( String[] args) {

        Scanner scan = new Scanner(System.in); //habilita teclado
        Cliente cliente = new Cliente(); //cria novo cliente
        System.out.println("Insira o numero da conta (apenas números)");; //recolhe o numero da conta
        cliente.setNumero(scan.nextInt());
        System.out.println("Insira a sua agencia");
        cliente.setAgencia(scan.next());
        System.out.println("Insira seu nome");
        cliente.setNome(scan.next());

        System.out.println(cliente);      
    }
   
}
