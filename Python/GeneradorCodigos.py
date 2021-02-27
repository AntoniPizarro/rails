import random

def GeneradorCodigos(numCar, cantidad):
    caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890"
    for i in range(cantidad):
        res = ""
        for k in range(numCar):
            res += caracteres[random.randint(0, len(caracteres) - 1)]
        print(res)