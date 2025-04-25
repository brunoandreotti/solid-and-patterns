package org.brunoandreotti.solidandpatterns.solid._1_srp.solucao;

//Para resolver o problema podemos retirar a lógica dos passos de processamento de um pedido
//e tranferir ela para classes separadas, dessa maneira deixando cada classe com sua responsabilidade
//ou seja, com apenas um motivo para ser alterada.
//Na classe de Service apenas chamamos os métodos necessários para o processamento do pedido.


public class ProcessOrderServiceSolucao {

    InventoryChecker inventoryChecker;
    OrderCalculator orderCalculator;
    PaymentProcessor paymentProcessor;

    public ProcessOrderServiceSolucao(InventoryChecker inventoryChecker,
                                      OrderCalculator orderCalculator,
                                      PaymentProcessor paymentProcessor) {

        this.inventoryChecker = inventoryChecker;
        this.orderCalculator = orderCalculator;
        this.paymentProcessor = paymentProcessor;
    }


    public void processOrder(OrderSolucao orderSolucao) {
        inventoryChecker.checkInventory(orderSolucao);
        orderCalculator.calculate(orderSolucao);
        paymentProcessor.process(orderSolucao);
    }

}
