from math import gamma,exp
from scipy import integrate,inf
def chi_square_single_result(n,i):
    if n > 0:
        print("P(X = ",i,"): ", (exp(-i/2)*i**(n/2 - 1))/(2**(n/2)*gamma(n/2)))
    else:
        print("Invalid parameter 'n' ")
def chi_square_series_result(n,sp,ep):
    if n > 0:
        resl = list()
        resl = integrate.quad(lambda x: (exp(-x/2)*x**(n/2 - 1))/(2**(n/2)*gamma(n/2)),sp,ep)
        print("P(",sp,"<= X <= ",ep,"): ", resl[0])
    else:
        print("Invalid parameter 'n' ")
def E_X_V_X(n):
    print("E(X): ", n)
    print("V(X): ", 2*n)