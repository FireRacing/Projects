package javaapplication70;


public class program {
    public static void main(String args[])
    {
        double X[] = {-3,6,9};
        double P_X[] = {0.17,0.5,0.33};//P(X=x)
        double E_X = 0; //E(X)
        double E_X_2 = 0; //E(X^2)
        for(int i=0;i<X.length;i++)
        {
            E_X += X[i]*P_X[i];
            E_X_2 += Math.pow(X[i],2)*P_X[i];
        }
        double result =(4*E_X_2)+(4*E_X)+1;
        System.out.println("E(X+2)^2 = "+result);
    }
}
