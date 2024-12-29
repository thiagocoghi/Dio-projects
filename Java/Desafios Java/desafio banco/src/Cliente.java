public class Cliente {
    private String nome;
    private String sobrenome;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public Cliente(String nome, String sobrenome){
        this.setNome(sobrenome);
        this.setSobrenome(sobrenome);
    }
    public void imprimiCliente(){
        System.out.println(this.nome + " " + this.sobrenome);
    }


}
