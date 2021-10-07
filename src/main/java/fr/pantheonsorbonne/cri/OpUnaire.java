package fr.pantheonsorbonne.cri;

public abstract class OpUnaire implements ExpressionArithmetique {

    protected ExpressionArithmetique value;
    protected String operationName;

    public OpUnaire(ExpressionArithmetique op, String operationName) {
        this.operationName = operationName;
        this.value = op;
    }

    @Override
    public String afficher() {

        return "(" + this.operationName + "(" + value.afficher() + "))";
    }

}
