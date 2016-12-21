package parte1;

import tools.easyIO;

public class exercicio3 {
	
	static easyIO c = new easyIO();
	
	public exercicio3() {
		
		int [] golos = {3, 4, 2, 2, 1};
		int soma = 0;
		
		for (int i=0; i<golos.length; i++) {
			soma+=golos[i];
		}
		
		c.writeLine("A média de golos que o avançado tem por jogo é: " + (float) soma/golos.length);
		
	}
}
