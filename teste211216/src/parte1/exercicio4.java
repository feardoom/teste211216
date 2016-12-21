package parte1;

import tools.easyIO;

public class exercicio4 {
	
	static easyIO c = new easyIO();
	static double custo_bilhete = 7.5; //-
	static double custo_camisola = 14; //-
	
	public exercicio4() {
		char opc;
		int pessoas = 0, lucro_camisolas = 0;
		double lucro_bilhetes = 0;
				
		do {
			c.writeLine("A pessoa tem camisola do clube? ('c' para sim | 'n' para nao | 's' para sair)");
			do {
				opc = c.readC();
			}while(opc!='c' && opc!='n' && opc!='s');
			
			if (opc=='c') {
				lucro_camisolas+=custo_camisola;
			} else if(opc=='s') {
				break;
			}
			
			lucro_bilhetes+=custo_bilhete;
			pessoas++;
			
		}while(true);
		
		c.writeLine("\nPara um total de " + pessoas + " pessoas:");
		c.writeLine("Na venda de bilhetes, foram angariados " + lucro_bilhetes + " €");
		c.writeLine("Na venda de camisolas, foram angariados " + lucro_camisolas + " €");
		
	}
}
