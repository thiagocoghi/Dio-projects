public class Emprestimo {
    
    public static void juros(double valor) {
        double resultado = valor * 1.15;
        System.out.println("O valor a ser pago é 2 X "+ resultado/2);
    }

    public static void tresMeses(double valor) {
        double resultado = valor * 1.08;
        System.out.println("O valor a ser pago é 3 X "+ resultado/3);
    }

    public static void parcelado(double valor, int parcelas) {
        double resultado = valor / parcelas;
        
        for (int i=0; i<=parcelas; i++){
            resultado *= 1.05;
        }
        double juros = resultado * parcelas;
        System.out.println("valor total é: "+ juros);
        System.out.println("O valor a ser pago é " + parcelas + " X "+ resultado);
    }
}
