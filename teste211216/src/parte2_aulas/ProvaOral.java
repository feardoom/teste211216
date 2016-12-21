package parte2_aulas;

public class ProvaOral extends MomentoAvaliacao {
	private int fluencia;
	public int dominioMateria;
	
	public ProvaOral(int fluencia, int dominioMateria, Aluno aluno, int nota, int dificuldade, String data) {
		this.fluencia = fluencia;
		this.dominioMateria = dominioMateria;
		this.aluno = aluno;
		this.nota = nota;
		this.dificuldade = dificuldade;
		this.data = data;
	}
	
	public int getFluencia() {
		return this.fluencia;
	}
	
	public void setFluencia(int novaFluencia) {
		this.fluencia = novaFluencia;
	}
	
}
