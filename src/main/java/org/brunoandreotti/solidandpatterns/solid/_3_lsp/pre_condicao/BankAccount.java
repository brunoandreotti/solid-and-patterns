package org.brunoandreotti.solidandpatterns.solid._3_lsp.pre_condicao;

//LSP - Liskov Substitution Principle (Princípio da substituição de Liskov)
//Uma classe derivada deve ser substituível por sua classe base.
//Esse princípio declara que uma classe herdada de outra classe ou que implementa uma ‘interface’
// pode ser substituída por sua classe mãe ou outra classe que implementa a mesma ‘interface’
// sem que o comportamento do sistema seja alterado.

//Pré-condição
//Não altere condições já estabelecidas pela classe superior.

//Nesse caso estamos ferindo a pre-condição de que o valor de depósito deve ser maior do que 0, ao adicionar
//uma regra na classe SavingsAccount dizendo que o valor deve ser maior do que 10, assim sobrescrevendo
//uma regra/condição pre-estabelecida pela classe superior.

//Isso irá quebrar o código cliente, pois ao utilizar a classe SavingAccount o cliente imagina que terá as pre-condições
//da classe BankAccount

//Para resolver isso, ao invés de utilizar herança poderíamos utilizar interface, dessa maneira ficaria mais claro que
//cada classe criada a partir da interface teria suas próprias regras

public class BankAccount {

    private Double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(Double amount) {

        if (amount <= 0) {
            throw new RuntimeException("O valor deve ser positivo");
        }

        this.balance += amount;
    }

    public Double getBalance() {
        return balance;
    }
}
