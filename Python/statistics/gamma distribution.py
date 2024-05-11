from scipy.special import gamma
from scipy import integrate
from math import exp
def gamma_single_result(n,alpha,i):
    if i > 0:
        print("P(X = ",i,")",((alpha*exp(-alpha*i))*((alpha*i)**(n-1)))/gamma(n))
    else:
        print("Invalid 'i' value")
def gamma_serial_result(n,alpha,sp,ep):
    if sp >= 0 and ep > 0:
        resl = list()
        resl = integrate.quad(lambda x: ((alpha*exp(-alpha*x))*((alpha*x)**(n-1)))/gamma(n), sp,ep)
        print("P(",sp,"<= X <= ",ep," ): ",resl[0])
    else:
        if sp < 0 and ep < 0:
            print("Invalid start and end points")
        elif sp < 0:
            print("Invalid start point")
        elif ep < 0:
            print("Invalid end point")
def E_X_V_X(n,alpha):
    print("E(X): ", (n/alpha))
    print("V(X): ", n/(alpha**2))

