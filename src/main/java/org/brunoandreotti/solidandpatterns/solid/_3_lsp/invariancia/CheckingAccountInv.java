package org.brunoandreotti.solidandpatterns.solid._3_lsp.invariancia;

//LSP - Liskov Substitution Principle (Princípio da substituição de Liskov)
//Uma classe derivada deve ser substituível por sua classe base.
//Esse princípio declara que uma classe herdada de outra classe ou que implementa uma ‘interface’
// pode ser substituída por sua classe mãe ou outra classe que implementa a mesma ‘interface’
// sem que o comportamento do sistema seja alterado.

//Invariância
//Não altere condições já estabelecidas pela classe superior.



public class CheckingAccountInv extends BankAccountInv {

    private Double overdraftLimit;

    public CheckingAccountInv() {

        super();
        this.overdraftLimit = 0.0;

    }

    @Override
    public void withdraw(Double amount) {

        if (amount <= 0) {
            throw new RuntimeException("O valor deve ser positivo");
        }

        double availableBalance = this.balance + this.overdraftLimit;

        if (amount > availableBalance) {
            throw new RuntimeException("Saldo insuficiente");
        }

        this.balance -= amount;
    }


}
