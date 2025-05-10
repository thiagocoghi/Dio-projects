import java.util.*;

public class dados {

    public static void main(String[] args) {

        List<Double> temperatura = new ArrayList<Double>(); //criando a lista de temperaturas

        Scanner scan = new Scanner(System.in); //habilitando teclado
        System.out.println("Insira a média de temperatura mensal dos seis primeiros meses: ");

        for (int i=0; i<=5; i++){ //loop de inserção de temperaturas
            temperatura.add(i, scan.nextDouble());
        }

        Iterator<Double> iterator = temperatura.iterator();
        Double soma =0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        } // somador das temperaturas
        Double media = soma/temperatura.size(); // tira a media do semestre

        System.out.println("As temperatururas nos seis primeiros meses foram: " + temperatura);
        System.out.println("A média das temperaturas é: " + media );

        Iterator<Double> iterator1 = temperatura.iterator();
        
        int count = 0; // exibe os meses que estão acima da média
        while (iterator1.hasNext()){
            Double temp = iterator1.next();
            if(temp > media){
                switch (count) {
                    case (0):
                        System.out.printf("1 - Janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - Fevereiro: %.1f\n ", temp);
                        break;
                    case (2):
                        System.out.printf("3 - Março: %.1f\n ", temp);
                        break;
                    case (3):
                        System.out.printf("4 - Abril: %.1f\n ", temp);
                        break;
                    case (4):
                        System.out.printf("5 - Mario: %.1f\n ", temp);
                        break;
                    case (5):
                        System.out.printf("6 - Junho: %.1f\n ", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }

            count++;
        }
    }
}