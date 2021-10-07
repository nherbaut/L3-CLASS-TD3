package fr.pantheonsorbonne.cri;

public class Soustraction extends OpBinaire {
    public Soustraction(ExpressionArithmetique leftOp, ExpressionArithmetique rightOp, String symbol) {
        super(leftOp, rightOp, "-");
    }

    @Override
    protected ExpressionArithmetique simplifier(ConstanteN valLeft, ConstanteN valRight) {
        return new ConstanteN(valLeft.value - valRight.value);
    }

    @Override
    protected ExpressionArithmetique simplifier(ConstanteQ valLeft, ConstanteQ valRight) {
        long num = valLeft.getNum() * valRight.getDenum() - valLeft.getDenum() * valRight.getNum();
        long denum = valLeft.getDenum() * valRight.getDenum();
        return new ConstanteQ(num, denum).simplifier();
    }

    protected ExpressionArithmetique simplifier(ConstanteQ valLeft, ConstanteN valRight) {
        //todo
        return null;
    }

}
