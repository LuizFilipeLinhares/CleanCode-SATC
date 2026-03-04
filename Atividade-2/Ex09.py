##------------------ATIVIDADE 2 -----------------------##

#Ex09
class BankAccount:
    def __init__(self, account_holder, balance):
        self.account_holder = account_holder
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if amount <= self.balance:
            self.balance -= amount
        else:
            print("Insufficient funds.")

    def get_balance(self):
        return self.balance

    def get_account_summary(self):
        return f"Account Holder: {self.account_holder}, Balance: {self.balance}"


def calculate_total_balance(accounts):
    return sum(account.balance for account in accounts)


def find_account_with_highest_balance(accounts):
    return max(accounts, key=lambda account: account.balance)


account1 = BankAccount("Alice", 500)
account2 = BankAccount("Bob", 1200)
account3 = BankAccount("Charlie", 700)

account1.deposit(200)
account2.withdraw(300)

print(account1.get_balance())
print(account2.get_account_summary())

accounts = [account1, account2, account3]

print(calculate_total_balance(accounts))
print(find_account_with_highest_balance(accounts).account_holder)