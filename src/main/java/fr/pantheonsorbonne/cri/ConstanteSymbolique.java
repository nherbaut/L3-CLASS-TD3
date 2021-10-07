package fr.pantheonsorbonne.cri;

public class ConstanteSymbolique extends ConstanteExpressionArithmetique {

	public static ExpressionArithmetique PI = new ConstanteSymbolique(ConstantesSymboliqueConnues.PI);

	public static ExpressionArithmetique E = new ConstanteSymbolique(ConstantesSymboliqueConnues.EXPONENTIELLE);

	public ConstanteSymbolique(ConstantesSymboliqueConnues constanteConnue) {
		this.constant = constanteConnue;
	}

	ConstantesSymboliqueConnues constant;

	public enum ConstantesSymboliqueConnues {
		PI("π"), EXPONENTIELLE("e");

		String strRepresentation;

		ConstantesSymboliqueConnues(String strRepresentation) {
			this.strRepresentation = strRepresentation;
		}

		public String getStrPresentation() {
			return this.strRepresentation;
		}

	}

	@Override
	public String afficher() {
		return this.constant.getStrPresentation();
	}

}
