import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // Leitura do salário e dos benefícios
        double salarioBruto = input.nextDouble();
        double beneficios = input.nextDouble();
        double imposto = 0;

        if (salarioBruto <= 1100 ){
            imposto = 0.95;
            System.out.printf("%.2f", salarioBruto*imposto+beneficios);
        } else if (salarioBruto <= 2500) {
            imposto = 0.90;
            System.out.printf("%.2f", salarioBruto*imposto+beneficios);
        }else {
            imposto = 0.85;
            System.out.printf("%.2f", salarioBruto*imposto+beneficios);
        }
    }
}