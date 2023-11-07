public class Cliente {
    private int numero;
    private String agencia;
    private String nome;
    private Double saldo = 237.48;

    /**
     * @return
     */
    public int getNumero(){
        return numero;
    }
    /**
     * @return
     */
    public String getAgencia(){
        return agencia;
    }
    /**
     * @return
     */
    public String getNome(){
        return nome;
    }
    /**
     * @return
     */
    public Double getSaldo (){
        return saldo;
    }
    /**
     * @param numero
     */
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    /**
     * @param nome
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Cliente [numero=" + numero +
         ", agencia=" + agencia + 
         ", nome=" + nome +
          ", saldo=" + saldo + "]";
    }
    
} 