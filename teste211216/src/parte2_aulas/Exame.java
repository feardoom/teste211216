package parte2_aulas;

public class Exame extends MomentoAvaliacao {
	private Questao [] questoes;

	public Exame(Questao [] questoes, Aluno aluno, int nota, int dificuldade, String data) {
		this.questoes = questoes;
		this.aluno = aluno;
		this.nota = nota;
		this.dificuldade = dificuldade;
		this.data = data;
	}
	
	public Questao [] getQuestoes() {
		return this.questoes;
	}
	
	public Questao getQuestao(int n) {
		return this.questoes[n];
	}
}
