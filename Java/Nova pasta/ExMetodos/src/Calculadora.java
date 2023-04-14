public class Calculadora {
        

        public static void soma(int numero1,int numero2) {
            int resultado = numero1 + numero2;
            System.out.println("Resultado da soma é: " + resultado);
        }
        public static void subtrai(int numero1, int numero2) {
            int resultado = numero1-numero2;
            System.out.println("Resultado da subtração é: " + resultado);
        }
        public static void multiplica(int numero1, int numero2){
            int resultado = numero1 * numero2;
            System.out.println("Resultado da multiplicação é: " + resultado);
        }
        public static void divide(int numero1, int numero2) {
            int resultado = numero1 / numero2;
            System.out.println("Resultado da divisão é: " + resultado);
        }
    }