def factorial(number):
    f=1
    if number==0:
        f=1
    else:
        for i in range(1,number+1):
            f=f*i
    return f
def find_strong_numbers(num_list):
    l=[]
    for i in num_list:
        s=0
        for a in str(i):
            f=1
            for x in range(1,int(a)+1):
                f=f*x
            s=s+f
            print(s)
        if s==i:
            l.append(i)
    return l,s
lst=[145,2,1,45]
strong_num_list=find_strong_numbers(lst)
print(strong_num_list)


