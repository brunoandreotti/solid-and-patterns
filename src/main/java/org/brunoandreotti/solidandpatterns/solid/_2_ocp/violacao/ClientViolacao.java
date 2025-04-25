package org.brunoandreotti.solidandpatterns.solid._2_ocp.violacao;

public class ClientViolacao {

    public static void main(String[] args) {
        OrderViolacao order1 = new OrderViolacao(10);
        order1.applyFixedDiscount(5);
        System.out.println(order1.getAmount());

        OrderViolacao order2 = new OrderViolacao(10);
        order2.applyPercentageDiscount(10);
        System.out.println(order2.getAmount());
    }
}
