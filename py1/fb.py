from random import sample 
lista = list(range(100)) 
vectorbs = sample(lista,8) 

def bubblesort(vectorbs):
    print("El vector a ordenar es:",vectorbs)
    n = 0 
    for _ in vectorbs:
        n += 1 
    for i in range(n-1):  
        for j in range(0, n-i-1): 
            if vectorbs[j] > vectorbs[j+1] :
                vectorbs[j], vectorbs[j+1] = vectorbs[j+1], vectorbs[j]
    print ("El vector ordenado es: ",vectorbs)

bubblesort(vectorbs)

def fibonacci (n):
    a,b = 0,1
    while a < n:
        print(a, end= ' ')
        a, b = b, a+b
        print()
