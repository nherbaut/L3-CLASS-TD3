package fr.pantheonsorbonne.cri;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddition {

	@Test
	void test() {
		
		ExpressionArithmetique addNN = new Addition(new ConstanteN(2), new ConstanteN(8));
		assertEquals(addNN.afficher(), "(2+8)");
		assertEquals(addNN.simplifier().afficher(), "10");
		
		ExpressionArithmetique addQQ = new Addition(new ConstanteQ(2, 7), new ConstanteQ(4, 7));
		assertEquals(addQQ.afficher(), "((2/7)+(4/7))");
		assertEquals(addQQ.simplifier().afficher(), "(6/7)");
		
		ExpressionArithmetique addNQ = new Addition(new ConstanteN(2), new ConstanteQ(4, 7));
		assertEquals(addNQ.afficher(), "(2+(4/7))");
		assertEquals(addNQ.simplifier().afficher(), "(18/7)");
		
		ExpressionArithmetique addQN = new Addition(new ConstanteQ(4, 7), new ConstanteN(2));
		assertEquals(addQN.afficher(), "((4/7)+2)");
		assertEquals(addQN.simplifier().afficher(), "(18/7)");
		
		ExpressionArithmetique addON = new Addition(ConstanteSymbolique.PI, new ConstanteN(5));
		assertEquals(addON.afficher(), "(π+5)");
		assertEquals(addON.simplifier().afficher(), "(π+5)");
	}

}
