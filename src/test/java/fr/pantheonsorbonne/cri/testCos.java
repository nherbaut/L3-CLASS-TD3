package fr.pantheonsorbonne.cri;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCos {

	@Test
	void test() {
		
		ExpressionArithmetique cosPi = new Cos(ConstanteSymbolique.PI);
		assertEquals(cosPi.afficher(), "(cos(π))");
		assertEquals(cosPi.simplifier().afficher(), "-1");
		
		ExpressionArithmetique cosUn = new Cos(new ConstanteN(1));
		assertEquals(cosUn.afficher(), "(cos(1))");
		assertEquals(cosUn.simplifier().afficher(), "0");
		
		ExpressionArithmetique cosO = new Cos(new ConstanteN(2));
		assertEquals(cosO.afficher(), "(cos(2))");
		assertEquals(cosO.simplifier().afficher(), "(cos(2))");
	}

}
