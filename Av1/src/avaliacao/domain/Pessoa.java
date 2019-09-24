package avaliacao.domain;

public class Pessoa {

    //Atributos
    private int id;
    private String nome;
    private int idade;

    //Construtor
    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    //Metodos Get/Set 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /*Todos os metodos abaixo sao STATIC, pois, pertencem a classe e nao ao objeto (istancia), isso porque, eles foram feitos
    para trabalhar com um array de pessoas*/
    
    //Método auxiliar para apresentar o array, recebe o array e até onde ele deve percorrer 
    //(o motivo do ultimo parametro) é porque em metodos como o da questao 8.2 onde há remocao e por tanto um valor null
    // iria gerar uma excecao NullPointer, passando o valor Max evita isso, se usar o proprio p.lenght, vai da erro
    public static void apresentar(Pessoa p[], int max) {
        for (int i = 0; i < max; i++) {
            System.out.println(p[i]);
        }
    }

    //Questao 8.1
    public static void ordemIdade(Pessoa p[]) {
        //ordena a pessoa pela idade seguindo o principio o Bubble Sort
        Pessoa temp = new Pessoa(0, "", 0);
        for (int i = 0; i < p.length; i++) {
            for (int j = 1; j < (p.length - i); j++) {
                if (p[j - 1].idade > p[j].idade) {
                    temp = p[j - 1];
                    p[j - 1] = p[j];
                    p[j] = temp;
                }

            }
        }
        //apresenta o array completamente
        apresentar(p, p.length);
    }

    //Questao 8.2
    public static void removerPessoa(Pessoa p[]) {
        for (int i = 0; i < p.length; i++) {
//Neste primeiro if, caso a pessoa a ser removida seja a ultima, ela apenas recebe o valor null
            if ((p[i].idade == 27) && (i == p.length - 1)) {
                p[i] = null;
//mas caso nao seja, a ultima pessoa passa a ocupar o lugar dela no array (ela e substituida) e entao a ultima recebe o valor null
//Optei por fazer assim para evitar NullPointers e para ficar mais elegante
            } else if ((p[i].idade == 27)) {
                p[i] = p[p.length - 1];
                p[p.length - 1] = null;
                break;
            }
        }
        apresentar(p, p.length - 1);
    }

    //Questao 8.3
    public static void pessoaMaiorDe(Pessoa p[]) {
        for (int i = 0; i < p.length; i++) {
            if (p[i].idade > 21) {
                System.out.println(p[i]);
            }

        }
    }

    @Override //sobre-escrita do toString, so pra ser mais rapido
    public String toString() {
        return "----------------------------\n"
                + "Nome: " + this.nome + "\n"
                + "Idade: " + this.idade + " anos\n"
                + "----------------------------\n";
    }

}
