
def fibo(n):
    if n == 0:
        print(0)
        return 0
    elif n==1:
        print(1)
        return 1
    else: return fibo(n-1)+fibo(n-2)

T = int(input())
for i in range(T):
    num = int(input())
    call0=0
    call1=0
    fibo(num)

    print(i, call0,call1)