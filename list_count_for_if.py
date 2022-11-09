#Python program to count the number 4 in a given list.
l=list(input("enter list"))
n=len(l)
a=0
for i in range(0,n):
    if l[i]=="4":
        a=a+1
print("no of 4 is",a)
