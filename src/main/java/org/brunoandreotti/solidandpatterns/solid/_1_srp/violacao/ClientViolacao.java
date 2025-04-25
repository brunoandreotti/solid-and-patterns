package org.brunoandreotti.solidandpatterns.solid._1_srp.violacao;



public class ClientViolacao {

    public static void main(String[] args) {
        OrderViolacao orderViolacao = new OrderViolacao("product", 10, 50.0);

        ProcessOrderServiceViolacao processOrderServiceViolacao = new ProcessOrderServiceViolacao();
        processOrderServiceViolacao.processOrder(orderViolacao);
    }
}
