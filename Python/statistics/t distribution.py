from math import exp,pi,gamma
from scipy import integrate
def t_distribution_single_result(r,v,w):
    if v > 0:
        print("P(W,V): ",((1/(2*pi)**(0.5))*exp(-w**2)/2)*((v**((r/2)-1)*exp(-v/2))/(gamma(r/2)*2**(r/2))))
    else:
        print("Invalid value for 'v'")
def t_distribution_series_result(r,vsp,vep,wsp,wep):
    resl = list()
    if vsp == 0:
        if wsp == 0:
            resl = integrate.dblquad(lambda v,w: ((1/(2*pi)**(0.5))*exp(-w**2)/2)*((v**((r/2)-1)*exp(-v/2))/(gamma(r/2)*2**(r/2))),0,vep,0,wep)
            print("P(",vsp,"<= V <=",vep," ,",wsp," <= W <=",wep,"):",resl[0])
    elif vsp>0 :
        resl = integrate.dblquad(lambda v,w: ((1/(2*pi)**(0.5))*exp(-w**2)/2)*((v**((r/2)-1)*exp(-v/2))/(gamma(r/2)*2**(r/2))),vsp,vep,wsp,wep)
        print("P(",vsp,"<= V <=",vep," ,",wsp," <= W <=",wep,"):",resl[0])
    else:
        print("Invalid 'v'")