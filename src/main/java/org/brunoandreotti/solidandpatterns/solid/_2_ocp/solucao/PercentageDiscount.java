package org.brunoandreotti.solidandpatterns.solid._2_ocp.solucao;

public class PercentageDiscount implements DiscountTypeInterface{

    private final double discount;

    public PercentageDiscount (double discount) {

        this.discount = discount;
    }


    @Override
    public double apply(double orderAmount) {
        return orderAmount - (orderAmount * this.discount / 100);
    }
}
