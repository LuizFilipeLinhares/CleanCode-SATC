##------------------ATIVIDADE 2 -----------------------##

#Ex01
class CalculadoraSalario:
    def calcular_salario(self, horas_trabalhadas, valor_por_hora):
        return horas_trabalhadas * valor_por_hora


calculadora_salario = CalculadoraSalario()
salario = calculadora_salario.calcular_salario(40, 160)

print(f"Salário: {salario}")

