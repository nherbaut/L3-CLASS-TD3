package fr.pantheonsorbonne.cri;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testLn {

	@Test
	void test() {
		
		ExpressionArithmetique lnUn = new Ln(new ConstanteN(1));
		assertEquals(lnUn.afficher(), "(ln(1))");
		assertEquals(lnUn.simplifier().afficher(), "0");
		
		ExpressionArithmetique lnE = new Ln(ConstanteSymbolique.E);
		assertEquals(lnE.afficher(), "(ln(e))");
		assertEquals(lnE.simplifier().afficher(), "1");
		
		ExpressionArithmetique lnO = new Ln(new ConstanteQ(2, 4));
		assertEquals(lnO.afficher(), "(ln((2/4)))");
		assertEquals(lnO.simplifier().afficher(), "(ln((1/2)))");
	}

}
