from math import exp
from scipy import integrate
def exponential_single_result(alpha,i):
    if i > 0:
        print("P(X = ",i,"): ", alpha*exp(-alpha*i))
    else:
        print("Invalid value of 'i'")
def exponential_series_result(alpha,sp,ep):
    resl = list()
    resl = integrate.quad(lambda x: alpha*exp(-alpha*x),sp,ep)
    print("P(",sp,"<= X <= ",ep,"): ", resl[0])
def E_X_V_X(alpha):
    print("E(X): ", 1/alpha)
    print("V(X): ", 1/(alpha**2))
