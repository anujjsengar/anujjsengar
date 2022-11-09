a=int(input("enter three digitno."))
x=a%10
y=(a%100)//10
z=a//100
b=x**3+y**3+z**3
c=x+y+z
if b==c:
    print("armstrong no.")
else:
    print("not armstrong")
        
