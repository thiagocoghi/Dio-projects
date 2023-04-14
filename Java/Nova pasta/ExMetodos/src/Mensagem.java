public class Mensagem {
    
    public static void saudacao(int hora) {

        if (hora >6 && hora <= 12 ){
            System.out.println("Bom Dia!");
        }else if(hora >12 && hora < 18){
            System.out.println("Boa Tarde!");
        }else {
            System.out.println("Boa Noite!");
        }
        
    }
}
