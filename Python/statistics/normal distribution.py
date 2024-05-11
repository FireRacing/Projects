from scipy import integrate
from math import sqrt,exp
from numpy import pi
def normal_single_result(sigma,mean,i):
    if sigma > 0:
        print("P(X = ",i,"): ",(1/(sigma*sqrt(2*pi)))*exp(-(((i-mean)/sigma)**2)/2))
    else:
        print("Invalid value for sigma")
def normal_series_result(sigma,mean,sp,ep):
    if sigma > 0:
        resl = list()
        resl = integrate.quad(lambda x: (1/(sigma*sqrt(2*pi)))*exp(-(((x-mean)/sigma)**2)/2),sp,ep)
        print("P( ",sp,"<= X <=",ep,"): ",resl[0])
    else:
        print("Invalid value for sigma")
def E_X_V_X(mean,sigma):
    print("E(X): ", mean)
    print("V(X): ", sigma**2)
normal_series_result(3.5,15,5,16)
