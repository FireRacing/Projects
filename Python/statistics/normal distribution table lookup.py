from numpy import loadtxt
from csv import writer as cwriter
class normal_table_lookup:
    clist = list()
    def __init__(self):
        self.clist = loadtxt("normal dist writer.csv",dtype = str,delimiter = ',',skiprows = 1,usecols = (1,2,3,4,5,6,7,8,9,10))
    def lookup(self,z):
        row = (int)(z*10)
        col = int(100*z - 10*int(10*z))
        return(self.clist[row][col])
n = normal_table_lookup()
print(n.lookup(0.28))
