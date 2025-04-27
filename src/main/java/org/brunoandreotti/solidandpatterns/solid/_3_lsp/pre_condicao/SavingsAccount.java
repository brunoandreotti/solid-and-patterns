package org.brunoandreotti.solidandpatterns.solid._3_lsp.pre_condicao;

public class SavingsAccount extends BankAccount {

    @Override
    public void deposit(Double amount) {

        if (amount <= 10) {
            throw new RuntimeException("O valor deve ser maior do que 10");
        }

        super.deposit(amount);
    }
}
