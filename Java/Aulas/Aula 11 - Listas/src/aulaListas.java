class aulaListas {

    class Gato{
        private String nome;
        private inteliger idade;
        private String cor;sd

        public Gato(String nome, inteliger idade, String cor) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        public String getNome() {
            return nome;
        }

        public inteliger getIdade() {
            return idade;
        }

        public String getCor() {
            return cor;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "Gato{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", cor='" + cor + '\'' +
                    '}';
        }
    }
}