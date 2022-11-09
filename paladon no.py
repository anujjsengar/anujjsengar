a=int(input("enter three digitno."))
x=a%10
y=(a%100)//10
z=a//100
p=x*100+y*10+z*1
if a==p:
    print("no is paladon")
else:
    print("not paladon")
