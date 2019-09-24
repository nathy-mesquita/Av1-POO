package Avaliacao;
public class Pessoa {
	
	//Atributos
	private int id;
	private String nome;
	private int idade; 

	//Métodos Públicoss
	public void ordemNome(int idade[]) {
	//Ordenar as pessoas por idade
		int aux = 0; 
		int i, j;
		for(i = 0; i < 5; i++) {
			for(j = 0; j<=4; j++) {
				if (idade[i] < idade[j]) {
					aux = idade[i];
					idade[i] = idade[j];
					idade[j] = aux;
				}
			}
		}
		for (int k = 0; k < 5; k++) {
		apresentar();
		}
	}
	
	public void removerPessoa() {
	//Remover a pessoa que tem 27 anos
		if (this.idade == 27) {
		
		}
		
	}
	
	public void pessoaMaiorDe(int idade[]) {
	//Imprimir as pessoas que tem mais que 21anos 
		/*for(i = 0; i <= 5; i++) {
		if(idade[i] > 21) 
			System.out.println("Nome: " + this.nome);
		}*/
	}
	
	public void apresentar() {
	System.out.println("------------------------------------");
	System.out.println("ID:" + this.getId());
	System.out.println("Nome:" + this.getNome());
	System.out.println("Idade:" + this.getIdade() + " Anos");
	System.out.println("------------------------------------");
	}
	

	//Construtor
	public Pessoa(int id, String nome, int idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}
	
	//Métodos Especiais 
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
}
