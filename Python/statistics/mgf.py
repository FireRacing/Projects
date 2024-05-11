from math import exp,pi
from scipy import misc
import numpy as np

def mgf(s,mu,sigma):
    mgf = np.exp(mu*s + ((sigma**2)*(s**2))/2)
    return mgf
def moment(s, i): 
    mo = misc.derivative(mgf, s, dx=0.000000001, n=i)
    return mo