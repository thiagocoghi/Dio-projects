import java.util.Scanner;

public class Ex1_Nota {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int nota = -1;

        while (nota < 0 || nota > 10){
            System.out.println("nota: ");
            nota = scan.nextInt();
            System.out.println("Valor invalido, insira novamente");
            }
        
        }
    }

