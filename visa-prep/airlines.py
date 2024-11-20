x,n=map(int,input().split())
t=n//100
r=t-x
if(n%100==0):
    print(r)
else:
    print(r+1)
