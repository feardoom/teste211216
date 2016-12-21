package parte1;

import tools.easyIO;

public class exercicio1 {
	
	static easyIO c = new easyIO();
	
	public exercicio1() {
		
		char [] caracteres = new char[5];
		int soma = 0;
		
		for (int i=0; i<caracteres.length; i++) {
			c.writeLine("Digite uma letra");
			caracteres[i] = c.readC();
			
			if ((int) caracteres[i] >= 48 && (int) caracteres[i] <= 57) {
				soma++;
			}
		}
		
		c.writeLine(soma+ " letras correspondentes aos numeros de 0 a 9");
		
	}
}
