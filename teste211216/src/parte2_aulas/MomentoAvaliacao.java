package parte2_aulas;

public class MomentoAvaliacao {
	private Aluno aluno;
	private int nota;
	private int dificuldade;
	private String data;
	
	public MomentoAvaliacao() {
		
	}
	
	public MomentoAvaliacao(Aluno aluno, int nota, int dificuldade, String data) {
		this.aluno = aluno;
		this.nota = nota;
		this.dificuldade = dificuldade;
		this.data = data;
	}
	
	public Aluno getAluno() {
		return this.aluno;
	}
	
	public int getNota() {
		return this.nota;
	}
	
	public int getDificuldade() {
		return this.dificuldade;
	}
	
	public String getData() {
		return this.data;
	}

}
