package parte2_indie;

public class Referee extends SensibleDummy {
	private String strickness;
	
	public Referee(String nome, String cor, String strickness) {
		this.nome = nome;
		this.cor = cor;
		this.strickness = strickness;
	}
	
	public String getStrickness() {
		return this.strickness;
	}
}
