import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int tabuada;
        int count = 1;

        System.out.println("Qual tabuada você deseja ver?");
        tabuada = scan.nextInt();
        System.out.println("Usando Do, While");
        do{
            
            System.out.println(tabuada + " x " + count + " = " + tabuada * count );
            count++;

        }while (count <= 10);
        
        System.out.println("Usando For");
        for (int x=0; x <= 10; x++){
            
            System.out.println(tabuada+1 + " x " + x + " = " + tabuada * x );
        }
    }

   

}