import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double idadeTerrestre = scanner.nextDouble();
        String planeta = scanner.next();
        double idade = 0d;
        {
            switch (planeta){
                case("Marte"):
                    idade = idadeTerrestre/1.88;
                    System.out.print("Idade equivalente em Marte: ");
                    System.out.printf("%.2f", idade);
                    System.out.print(" anos");
                    break;
                case("Venus"):
                    idade = idadeTerrestre/0.62;
                    System.out.print("Idade equivalente em Venus: ");
                    System.out.printf("%.2f", idade);
                    System.out.print(" anos");
                    break;
                case("Jupiter"):
                    idade = idadeTerrestre/11.86;
                    System.out.print("Idade equivalente em Jupiter: ");
                    System.out.printf("%.2f", idade);
                    System.out.print(" anos");
                    break;
                default: System.out.println("Planeta invalido.");

            }
        }

            scanner.close();
    }
}
