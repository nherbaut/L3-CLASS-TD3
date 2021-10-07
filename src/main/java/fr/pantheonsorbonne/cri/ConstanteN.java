package fr.pantheonsorbonne.cri;

public class ConstanteN extends ConstanteExpressionArithmetique {

    public long value;

    public ConstanteN(long value) {
        this.value = value;
    }

    @Override
    public String afficher() {
        return Long.toString(value);
    }


}
