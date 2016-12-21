package parte1;

import tools.easyIO;

public class exercicio5 {
	
	static easyIO c = new easyIO();
	
	public exercicio5() {
		int [] nums = {5, 2, 7};
		int produto = 0;
		
		for(int i=0; i<3; i++) {	
			produto*=10;
			produto+=nums[i];
		}
		
		c.writeLine("Produto: " + produto);
		
	}
}
