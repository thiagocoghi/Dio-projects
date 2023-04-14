import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor =0;
        int numero1=0, numero2=0, hora=0, parcelas =1;
        System.out.print("Coloque valor: ");
        numero1 = scan.nextInt();
        System.out.print("Coloque valor: ");
        numero2 = scan.nextInt();
        System.out.print("Que horas são? ");
        hora = scan.nextInt();
        System.out.print("Quanto deseja emprestar? ");
        valor = scan.nextDouble();
        System.out.print("Quantas parcelas quer pagar? ");
        parcelas = scan.nextInt();

        System.out.println("Demonstração de Calculadora java");
        Calculadora.soma(numero1, numero2);
        Calculadora.subtrai(numero1, numero2);
        Calculadora.divide(numero1, numero2);
        Calculadora.multiplica(numero1, numero2);

        Mensagem.saudacao(hora);

        Emprestimo.juros(valor);
        Emprestimo.parcelado(valor, parcelas);
        Emprestimo.tresMeses(valor);
    }
}
