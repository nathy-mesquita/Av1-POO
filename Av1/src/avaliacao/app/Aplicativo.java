package avaliacao.app;

import avaliacao.domain.CachePessoa;
import avaliacao.domain.Pessoa;

//Questao 8.5
public class Aplicativo {

    public static void main(String[] args) {

        //Primeiro array de Pessoas
        Pessoa p1[] = new Pessoa[5];
        p1[0] = new Pessoa(1, "João", 10);
        p1[1] = new Pessoa(2, "Alice", 5);
        p1[2] = new Pessoa(3, "Fernando", 27);
        p1[3] = new Pessoa(4, "Carlos", 12);
        p1[4] = new Pessoa(5, "Priscila", 31);

        //Segundo array de Pessoas
        Pessoa p2[] = new Pessoa[5];
        p2[0] = new Pessoa(1, "Paulo", 8);
        p2[1] = new Pessoa(2, "Silas", 19);
        p2[2] = new Pessoa(3, "Paulo", 18);
        p2[3] = new Pessoa(4, "Pedro", 25);
        p2[4] = new Pessoa(5, "Paulo", 50);

        //Primeira cache passando o primeiro array
        CachePessoa cache1 = new CachePessoa(p1);

        //Segunda cache passando o segundo array
        CachePessoa cache2 = new CachePessoa(p2);

        //Questao 8.1:
        Pessoa.ordemIdade(p1);

        //Questao 8.2:
        Pessoa.removerPessoa(p1);

        //Questao 8.3:
        Pessoa.pessoaMaiorDe(p1);

        //Questao 8.4:
        cache1.retornaPessoa(5);
        cache1.retornaPessoa(5);

        cache2.retornaPessoa(5);
        cache2.retornaPessoa(5);
    }
}
