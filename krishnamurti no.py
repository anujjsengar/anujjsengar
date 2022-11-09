a=int(input("enter a no."))
s=1
n=0
for i in str(a):
    i=int(i)
    for a in range(1,i+1):
        s=s*1
    n=n+s
    s=1
if a==n:
    print("krishnamurti no")
else:
    print("not krishnamurti")
