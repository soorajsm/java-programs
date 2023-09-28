N,K=map(int,input().split())
a=[1,2,3]
for i in range(N-len(a)):
    a.append(sum(a[-K:]))
print(a)