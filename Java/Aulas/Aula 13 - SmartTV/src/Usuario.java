public class Usuario {

    public static void main (String[] args) throws Exception{

        SmartTv smartTv= new SmartTv();

        smartTv.abaixarVolume();     
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();  
        smartTv.aumentarVolume();
   

        System.out.println("Tv Ligada?"+ smartTv.ligada );
        System.out.println("Canal Atual : " + smartTv.canal );
        System.out.println("Volume Atual : " + smartTv.volume );

        smartTv.mudarCanal(15);
        System.out.println("Canal Atual : " + smartTv.canal );
        smartTv.ligar();
        System.out.println("Novo status: Tv Ligada?"+ smartTv.ligada);

        smartTv.desligar();

       System.out.println("Novo status: Tv Ligada?"+ smartTv.ligada);
    }
}
