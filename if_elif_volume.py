t=float(input("enter time interval"))
r=5
h=10
v=(3.14*r**2*h)/3
a=t*15
if v==a:
    print("tank is full")
elif v<a:
    print("tank is overflood")
else:
    print("tank is not full")
    v1=v-a
    h1=(3*v1)/(3.14*r**2)
    print("remaining height",h1)
