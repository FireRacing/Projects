from scipy.special import comb,gamma
from math import ceil,exp,factorial,sqrt
from numpy import pi
def binomial(n,i,p):
    q = 1-p
    result = comb(n,i)*(p**i)*(q**(n-i))
    result = ceil(result*10000)/10000
    return result
def poisson (n,p,i):
    alpha = n*p
    result = (exp(-alpha)*(alpha**i))/factorial(i)
    result = ceil(result*10000)/10000
    return result
def gamma_dist(r,alpha,i):
    result = ((alpha*exp(-alpha*i))*((alpha*i)**(r-1)))/gamma(r)
    result = ceil(result*10000)/10000
    return result
def exponential(alpha,i):
    result = alpha*exp(-alpha*i)
    result = ceil(result*10000)/10000
    return result
def normal(sigma,mean,i):
    result = (1/(sigma*sqrt(2*pi)))*exp(-(((i-mean)/sigma)**2)/2)
    result = ceil(result*10000)/10000
    return result
def binomial_mean_and_variance(n,p):
    q = 1-p
    print ('Binomial E(X): ',ceil((n*p)*10000)/10000)
    print('Binomial V(X): ',ceil((n*p*q)*10000)/10000)
def poisson_mean_and_variance(n,p):
    print('Poisson E(X),V(X): ',n*p)
def gamma_mean_and_variance(r,alpha):
    print("Gamma E(X): ", ceil((r/alpha)*10000)/10000)
    print('Gamma V(X): ',ceil((r/(alpha**2))*10000)/10000)
def exponential_mean_and_variance(alpha):
    print("Exponential E(X): ",ceil((1/alpha)*10000)/10000)
    print("Exponential V(X): ",ceil((1/(alpha**2))*10000)/10000)
def chi_square_mean_and_variance(n):
    print("Chi Square E(X): ",n)
    print("Chi Square V(X): ", 2*n)
def normal_mean_and_variance(mean,sigma):
    print("Normal E(X): ",mean)
    print("Normal V(X): ", sigma**2)
