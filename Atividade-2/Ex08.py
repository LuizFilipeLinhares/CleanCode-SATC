##------------------ATIVIDADE 2 -----------------------##

#Ex08
def calcular_media(notas):
    return sum(notas) / len(notas)


def verificar_aprovacao(media):
    return media >= 60


notas = [70, 80, 50]

media_das_notas = calcular_media(notas)
aprovado = verificar_aprovacao(media_das_notas)

print(f"Média: {media_das_notas}")
print(f"Aprovado: {aprovado}")