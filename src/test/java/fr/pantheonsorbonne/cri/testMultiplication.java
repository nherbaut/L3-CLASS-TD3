package fr.pantheonsorbonne.cri;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testMultiplication {

	@Test
	void test() {
		
		ExpressionArithmetique mulNN = new Multiplication(new ConstanteN(2), new ConstanteN(8));
		assertEquals(mulNN.afficher(), "(2*8)");
		assertEquals(mulNN.simplifier().afficher(), "16");
		
		ExpressionArithmetique mulQQ = new Multiplication(new ConstanteQ(2, 7), new ConstanteQ(4, 7));
		assertEquals(mulQQ.afficher(), "((2/7)*(4/7))");
		assertEquals(mulQQ.simplifier().afficher(), "(8/49)");
		
		ExpressionArithmetique mulNQ = new Multiplication(new ConstanteN(2), new ConstanteQ(4, 7));
		assertEquals(mulNQ.afficher(), "(2*(4/7))");
		assertEquals(mulNQ.simplifier().afficher(), "(8/7)");
		
		ExpressionArithmetique mulQN = new Multiplication(new ConstanteQ(4, 7), new ConstanteN(2));
		assertEquals(mulQN.afficher(), "((4/7)*2)");
		assertEquals(mulQN.simplifier().afficher(), "(8/7)");
		
		ExpressionArithmetique mulON = new Multiplication(ConstanteSymbolique.PI, new ConstanteN(5));
		assertEquals(mulON.afficher(), "(π*5)");
		assertEquals(mulON.simplifier().afficher(), "(π*5)");
	}

}
