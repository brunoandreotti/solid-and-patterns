package org.brunoandreotti.solidandpatterns.solid._2_ocp.solucao;

//Para resolver o problema, criamos uma classe para cada tipo de desconto baseado em uma interface (DiscountTypeInterface)
//agora, ao invés de termos a regra de desconto dentro da classe Order, recebemos o desconto por injeção de dependencia.
//Dessa maneira nossa classe Order deixa de ter conhecimento de qual regra de desconto é aplicada e
//evitamos abrir nossa classe para modificação (pois não é mais necessário alterar a regra de desconto)
//e deixamos ela aberta para extensão, uma vez com o comportamento do desconto pode ser extendido de acordo com
//o desconto de será passado na injeção de dependencia.

//Agora, caso seja necessário criar outro tipo de desconto, basta criar uma classe extendendo a interface
//DiscountTypeInterface e atribuir esse desconto a um pedido

import lombok.Data;

@Data
public class OrderSolucao {

    private double amount;
    private DiscountTypeInterface discountType;

    public OrderSolucao(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        if (discountType != null) {
            this.amount = discountType.apply(this.amount);
        }

        return this.amount;
    }
}
