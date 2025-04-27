package org.brunoandreotti.solidandpatterns.solid._3_lsp.invariancia;

//LSP - Liskov Substitution Principle (Princípio da substituição de Liskov)
//Uma classe derivada deve ser substituível por sua classe base.
//Esse princípio declara que uma classe herdada de outra classe ou que implementa uma ‘interface’
// pode ser substituída por sua classe mãe ou outra classe que implementa a mesma ‘interface’
// sem que o comportamento do sistema seja alterado.

//Invariância
//Não crie variação de comportamento. Não sobrescreva comportamentos da classe superior

//Nessa caso estamos ferindo a invariância, pois na classe CheckingAccount estamos sobrescrevendo
// um comportamento definido pela classe superior BakingAccount.
//Dessa maneira podendo gerar comportamentos inesperados no cliente que usará as classes.



public class BankAccountInv {

    protected Double balance;

    public BankAccountInv() {
        this.balance = 0.0;
    }

    public void withdraw(Double amount) {

        if (amount <= 0) {
            throw new RuntimeException("O valor deve ser positivo");
        }

        if (amount > this.balance) {
            throw new RuntimeException("Saldo insuficiente");
        }

        this.balance -= amount;
    }

    public Double getBalance() {
        return balance;
    }
}
