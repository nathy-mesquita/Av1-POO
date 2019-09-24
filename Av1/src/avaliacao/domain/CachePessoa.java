package avaliacao.domain;

public class CachePessoa {

    //Referencia para o array de pessoas
    private Pessoa p[];
    //Referencia para a ultima pessoa consultada
    private Pessoa cache;

    //construtor obrigatoriamente precisa do array de pessoas
    public CachePessoa(Pessoa[] p) {
        this.p = p;
    }

    //Sem get/set para essa classe pois o unico intuito dela eh fazer cache
    
    //Questao 8.4
    public void retornaPessoa(int id) {

        //Se cache for diferente de null (ou seja, ela possui um valor) E o id na cache for igual ao id 
        //Printa o valor sem consultar a lista
        if ((cache != null) && (cache.getId() == id)) {
            System.out.println(cache);
        } else {
            //Caso o valor nao se encontre em cache, percorre a lista e faz a cache receber o valor consultado
            //Por ultimo printa o valor
            for (int i = 0; i < this.p.length; i++) {
                if (this.p[i].getId() == id) {
                    cache = this.p[i];
                    System.out.println(cache);
                }

            }
        }

    }

}
