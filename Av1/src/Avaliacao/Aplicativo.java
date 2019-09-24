package Avaliacao;
public class Aplicativo {
	public static void main(String[] args) {
		
		Pessoa p[] = new Pessoa[5];
		p[0] = new Pessoa(1, "João", 10);
		p[1] = new Pessoa(2, "Alice", 5);
		p[2] = new Pessoa(3, "Fernando", 22);
		p[3] = new Pessoa(4, "Carlos", 12);
		p[4] = new Pessoa(5, "Priscila", 31);
		

	p[0].apresentar();
	
	
		Pessoa pe[] = new Pessoa [5];
		pe[0] = new Pessoa(1, "Paulo", 8);
		pe[1] = new Pessoa(2, "Silas", 19);
		pe[2] = new Pessoa(3, "Paulo", 18);
		pe[3] = new Pessoa(4, "Pedro", 25);
		pe[4] = new Pessoa(5, "Paulo", 50);
		
		
	pe[1].apresentar();
	}
}
