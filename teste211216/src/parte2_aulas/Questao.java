package parte2_aulas;

public class Questao {
	private String pergunta;
	private double cotacao;
	
	public Questao(String pergunta, double cotacao) {
		this.pergunta = pergunta;
		this.cotacao = cotacao;
	}
	
	public String getPergunta() {
		return this.pergunta;
	}
	
	public double getCotacao() {
		return this.cotacao;
	}
}
