package parte2_aulas;

public class Aluno {
	private String nome;
	private int idade;
	private int numero;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int idade, int numero) {
		this.nome = nome;
		this.idade = idade;
		this.numero = numero;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public int getNumero() {
		return this.numero;
	}
}
