package org.brunoandreotti.solidandpatterns.solid._5_dip.violacao;

public class ClientDIPViolacao {

    public static void main(String[] args) {
        OrderDIPViolacao order = new OrderDIPViolacao();
        OrderProcessorService processor = new OrderProcessorService();

        processor.process(order);
;    }
}
