public class App {
    public static void main(String[] args) throws Exception {
        /*Conta cc = new ContaCorrente();
        cc.depositar(150);
        Conta cp = new ContaPoupanca();
        cp.depositar(200);
        cc.transferir(50, cp);*/
        Cliente pessoa = new Cliente("Thiago", "Coghi");
        pessoa.imprimiCliente();
      /* System.out.println(cc);
        System.out.println("\n"+ cp);*/
    }
}
