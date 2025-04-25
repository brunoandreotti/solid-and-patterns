package org.brunoandreotti.solidandpatterns.solid._1_srp.solucao;





public class ClientSolucao {

   private static final InventoryChecker inventoryChecker = new InventoryChecker();
   private static final OrderCalculator orderCalculator = new OrderCalculator();
   private static final PaymentProcessor paymentProcessor = new PaymentProcessor();


    public static void main(String[] args) {
        OrderSolucao order = new OrderSolucao("product", 10, 50.0);

        ProcessOrderServiceSolucao processOrderServiceSolucao = new ProcessOrderServiceSolucao(
                inventoryChecker,
                orderCalculator,
                paymentProcessor);

        processOrderServiceSolucao.processOrder(order);
    }

}
