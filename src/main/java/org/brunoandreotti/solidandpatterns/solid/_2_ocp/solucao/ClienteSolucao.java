package org.brunoandreotti.solidandpatterns.solid._2_ocp.solucao;

public class ClienteSolucao {
    public static void main(String[] args) {
        OrderSolucao order1 = new OrderSolucao(10);
        order1.setDiscountType(new FixedDiscount(5));
        System.out.println(order1.getAmount());

        OrderSolucao order2 = new OrderSolucao(10);
        order2.setDiscountType(new PercentageDiscount(10));
        System.out.println(order2.getAmount());

        OrderSolucao order3 = new OrderSolucao(10);
        System.out.println(order3.getAmount());
    }
}
