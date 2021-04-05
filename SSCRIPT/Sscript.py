# cook your dish here
t = int(input())

for _ in range(t):
    N,K = map(int,input().split())
    s = input()
    seq = "*"*K
    
    if(isSubSequence(seq, s)):
        print("YES")
    else:
        print("NO")
