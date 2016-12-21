package parte1;

import tools.easyIO;

public class exercicio6 {
	
	static easyIO c = new easyIO();
	
	public exercicio6() {
		
		c.writeLine("Introduza um numero");
		int n = c.readN();
		
		for (int i=1;i<=n; i++) {
			int cont_divs = 0;		
			for (int j=1;j<=i;j++) {
			    if (i%j==0) {
			        cont_divs+=1;
			    }
			}
			if (cont_divs<=2) c.writeLine("Primo! - " + i);

	}
		
	}
}
