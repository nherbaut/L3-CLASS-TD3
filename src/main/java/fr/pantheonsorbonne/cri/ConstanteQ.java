package fr.pantheonsorbonne.cri;

public class ConstanteQ extends ConstanteExpressionArithmetique {

    long num;
    long denum;


    public ConstanteQ(long num, long denum) {
        this.num = num;
        this.denum = denum;
    }

    private static long pgcd(long n1, long n2) {

        while (n1 != n2) {
            if (n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        return n2;
    }

    @Override
    public String afficher() {
        // TODO Auto-generated method stub
        return "(" + getNum() + "/" + getDenum() + ")";
    }

    @Override
    public ExpressionArithmetique simplifier() {
        long pgcd = pgcd(this.num, this.denum);
        if (pgcd == 1) {
            return super.simplifier();
        } else if (getDenum() / pgcd == 1) {
            return new ConstanteN(getNum() / pgcd);
        } else {
            return new ConstanteQ(getNum() / pgcd, getDenum() / pgcd);
        }
    }

    public long getNum() {
        return num;
    }

    public long getDenum() {
        return denum;
    }

}
