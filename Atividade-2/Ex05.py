##Ex05
def encontrar_menor_numero_impar(lista_numeros):
    menor_impar = None

    for numero in lista_numeros:
        if numero % 2 != 0:  # verifica se é ímpar
            if menor_impar is None or numero < menor_impar:
                menor_impar = numero

    return menor_impar


resultado = encontrar_menor_numero_impar([3, 10, 7, 8, 15])
print(f"Menor número ímpar: {resultado}")