#Write a Python program to get a new string from a given string where "Is" has been added to the front. If the given string already begins with "Is" then return the string unchanged.
a=str(input("enter string"))
if a[0:2]=="ls":
    print(a)
else:
    x="ls"+a
    print(x)
