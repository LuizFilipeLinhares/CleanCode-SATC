##------------------ATIVIDADE 2 -----------------------##

#Ex07
def celsius_to_fahrenheit(celsius_temperature):
    return (celsius_temperature * 9 / 5) + 32


def fahrenheit_to_celsius(fahrenheit_temperature):
    return (fahrenheit_temperature - 32) * 5 / 9


celsius_value = 25
fahrenheit_value = 77

print(celsius_to_fahrenheit(celsius_value))
print(fahrenheit_to_celsius(fahrenheit_value))