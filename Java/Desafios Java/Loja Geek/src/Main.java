import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            double media = scanner.nextDouble();

            if (media <5){
                System.out.println("REP");
            }else if (media < 7){
                System.out.println("MED");
            }else {
                System.out.println("APR");
            }
        }
    }