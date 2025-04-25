package org.brunoandreotti.solidandpatterns.solid._2_ocp.solucao;

public class FixedDiscount implements DiscountTypeInterface {

    private final double discount;

    public FixedDiscount (double discount) {
        if (discount <= 0 || discount > 100) {
            throw new RuntimeException("Desconto deve ser entre 1% e 100%");
        }
        this.discount = discount;
    }


    @Override
    public double apply(double orderAmount) {

        if (this.discount >= orderAmount) {
            throw new RuntimeException("Desconto deve ser menor que o valor do pedido!");

        }

        return orderAmount - this.discount;
    }
}
