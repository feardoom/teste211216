package parte2_aulas;

public class Exame extends MomentoAvaliacao {
	private Questao [] questoes;
	
	public Exame() {
		
	}
	
	public Exame(Questao [] questoes) {
		this.questoes = questoes;
	}
}
