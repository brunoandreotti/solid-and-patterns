package org.brunoandreotti.solidandpatterns.solid._2_ocp.violacao;

//OCP — Open-Closed Principle (Princípio Aberto-Fechado)
//Classes devem estar abertos para extensão, mas fechados para modificação.

//Esse princípio declara que quando novos comportamentos e recursos
// precisam ser adicionados no software,
// devemos estender e não alterar o código fonte original.

//Estamos violando esse principio pois, estando com a regra de tipos de descontos dentro da classe
//caso surja a necessidade de adicionar mais um tipo de desconto iremos precisar modificar a classe,
//tornando ela aberta para modificação

import lombok.Data;

@Data
public class OrderViolacao {

    double amount;

    public OrderViolacao(double amount) {
        this.amount = amount;
    }

    public void applyFixedDiscount(double discount) {

        if (discount >= amount) {
            throw new RuntimeException("Desconto deve ser menor que o valor do pedido!");

        }

        this.amount = this.amount - discount;
    }

    public void applyPercentageDiscount(double discount) {

        if (discount <= 0 || discount > 100) {
            throw new RuntimeException("Desconto deve ser entre 1% e 100%");
        }

        this.amount = this.amount - (this.amount * discount/100);
    }
}
