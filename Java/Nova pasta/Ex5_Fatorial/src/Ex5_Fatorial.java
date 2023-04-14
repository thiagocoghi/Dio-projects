import java.util.Scanner;

public class Ex5_Fatorial {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int fatorial =1, count;
        
        System.out.println("Qual valor deseja fatorar?");
        count = scan.nextInt();
                
        for (int i = count; i >=1; i--) {
            
            fatorial *= i;
            System.out.println("O valor fatorado é:" + fatorial);
                        
        }        
    }
}
