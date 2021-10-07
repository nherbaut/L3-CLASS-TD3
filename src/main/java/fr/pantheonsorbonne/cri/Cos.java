package fr.pantheonsorbonne.cri;

public class Cos extends OpUnaire {

    public Cos(ExpressionArithmetique op) {
        super(op, "cos");
    }


    @Override
    public ExpressionArithmetique simplifier() {
        ExpressionArithmetique val = this.value.simplifier();
        if (val instanceof ConstanteSymbolique) {
            ConstanteSymbolique cons = (ConstanteSymbolique) val;
            if (cons.constant == ConstanteSymbolique.ConstantesSymboliqueConnues.PI)
                return new ConstanteN(-1);
        }
        if (val instanceof ConstanteN) {
            ConstanteN value = (ConstanteN) val;
            if (value.value == 1)
                return new ConstanteN(0);
        }
        return new Cos(val);
    }

}
