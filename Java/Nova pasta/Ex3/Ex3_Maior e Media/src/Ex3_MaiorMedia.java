import java.util.Scanner;

public class Ex3_MaiorMedia {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int soma =0;
        int maior = 0;

        do{
            System.out.println("Insira um valor: ");
            numero = scan.nextInt();
           
            if (numero > maior) maior = numero; // armazena o maior valor 
            soma += numero; // faz somatório dos numeros inseridos
            count += 1;


            } while (count < 5); // repete por 5 vezes o bloco
            
            System.out.println("O maior valor é:"+ maior + " " + "e a média da soma é:"+ soma/5 );

        }
    }
