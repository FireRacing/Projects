from scipy.special import comb
def binomial_single_result(n,i,p,q):
    if p == 0:
        print("P(X = ",i,"): ",comb(n,i)*((1-q)**i)*(q**(n-i)))
    elif q==0:
        print("P(X = ",i,"): ",comb(n,i)*(p**i)*((1-p)**(n-i)))

def binomial_series_result(n,p,sp,limit):
    res1 = 0
    if p>0 and p<1 and limit<=n:
        if sp == 0 and limit<=n:
            for i in range(0,limit+1):
                res = comb(n,i)*(p**i)*((1-p)**(n-i))
                print("B(",n,",",i,"): ",res)
                res1 += res
            print("P(X <=",limit,"): ", res1)
        elif sp > 0 and limit <= n:
            for i in range(sp,limit+1):
                res = comb(n,i)*(p**i)*((1-p)**(n-i))
                print("B(",n,",",i,"): ",res)
                res1 += res
            print("P(",sp,"<= X <=",limit,"): ", res1)
    else:
        print("Inputted 'p' value is invalid therefore, P(",sp," <= X <= ",limit,"): 0")
def E_X_V_X(n,p):
    print ("E(X): ",n*p)
    print("V(X): ", n*p*(1-p))
binomial_series_result(18,0.9,16,18)
