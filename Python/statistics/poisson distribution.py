from math import exp,factorial
def poisson_single_result(n,p,i):
    alpha = n*p
    print("P(X = ",i,"): ",exp(-alpha)*(alpha**(i))/factorial(i))
def poisson_series_result(n,p,sp,iterations):
    alpha = n*p
    res1 = 0
    if sp == 0:
        for i in range(0,iterations+1):
            res = exp(-alpha)*(alpha**(i))/factorial(i)
            print("P(X = ",i,"): ",res)
            res1 += res
        print("P(X <= ",iterations,"): ",res1)
    elif sp > 0:
        for i in range(sp,iterations+1):
            res = exp(-alpha)*(alpha**(i))/factorial(i)
            print("P(X = ",i,"): ",res)
            res1 += res
        print("P(",sp," <= X <= ",iterations,"): ",res1)
def E_X_V_X(n,p):
    print("E(X) , V(X) : ",n*p)
poisson_series_result(60,0.0667,2,60)
    