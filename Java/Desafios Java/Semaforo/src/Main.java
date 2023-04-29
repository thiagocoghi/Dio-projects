import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int valor; //cria variavel valor para receber entrada do teclado

        valor = scan.nextInt(); // recebe entrada do teclado
        switch (valor) { //estrutura de controle do programa onde escolhe a melhor situação de acordo com o valor inserido.
            case (1):
                System.out.println("Pare! O sinal esta vermelho.");
                break;
            case (2):
                System.out.println("Atencao! O sinal esta amarelo.");
                break;
            case (3):
                System.out.println("Siga em frente! O sinal esta verde.");
                break;
            default:

                System.out.println("Valor invalido! Digite 1, 2 ou 3 para indicar a cor do semaforo.");
        }

    }
}
