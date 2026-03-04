##------------------ATIVIDADE 2 -----------------------##

##Ex02
def encontrar_maior_numero(lista_numeros):
    if not lista_numeros:
        raise ValueError("A lista não pode estar vazia.")
    
    maior_numero = lista_numeros[0]

    for numero in lista_numeros:
        if numero > maior_numero:
            maior_numero = numero

    return maior_numero


maior_valor = encontrar_maior_numero([3, 7, 2, 9, 4])
print(f"Maior número: {maior_valor}")


