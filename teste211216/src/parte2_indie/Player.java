package parte2_indie;

public class Player extends SensibleDummy {
	private int fatigue;
	private int atack;
	private int defense;
	
	public Player(String nome, String cor, int fatigue, int atack, int defense) {
		this.nome = nome;
		this.cor = cor;
		this.fatigue = fatigue;
		this.atack = atack;
		this.defense = defense;
	}
	
	public int getFatigue() {
		return this.fatigue;
	}
	
	public int getAtack() {
		return this.atack;
	}
	
	public int getDefense() {
		return this.defense;
	}
	
	public void pass() {
		
	}
	
	public void shoot() {
		
	}
	
}
