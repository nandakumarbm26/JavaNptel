n=int(input())
count = 0
for i in range(n):
    s1=str(input())
    s2=str(input())
    x=str(input())
    for j in range(len(s1)):
        for k in range(len(s2)):
            temp=s1[0:j]+s2[0:k]
            if(x.find(temp)!=-1):
                count=count+1
    print(count)


