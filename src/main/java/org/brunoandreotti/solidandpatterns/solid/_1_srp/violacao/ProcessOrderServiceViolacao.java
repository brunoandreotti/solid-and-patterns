package org.brunoandreotti.solidandpatterns.solid._1_srp.violacao;

// SRP — Single Responsibility Principle (Princípio da Responsabilidade Única)
// Uma classe deve ter um, e somente um, motivo para mudar.
//
//Esse princípio declara que uma classe deve ser especializada em um único assunto
// e possuir apenas uma responsabilidade dentro do software,
// ou seja, a classe deve ter uma única tarefa ou ação para executar.

//Essa classe fere o princípio pois ProcessOrderService possui
//mais de um motivo para ser alterado, caso alguma lógica de estoque, total do pedido ou pagamento mude
//a classe precisará ser alterada também

public class ProcessOrderServiceViolacao {

    public void processOrder(OrderViolacao orderViolacao) {
        checkInventory(orderViolacao);
        calculateTotal(orderViolacao);
        processPayment(orderViolacao);
    }

    private void checkInventory(OrderViolacao orderViolacao) {
        // Lógica para checar estoque
        System.out.println("Lógica para checar estoque - violação");
    }

    private void calculateTotal(OrderViolacao orderViolacao) {
        // Lógica para calcular total do pedido
        System.out.println("Lógica para calcular total do pedido - violação");
    }

    private void processPayment(OrderViolacao orderViolacao) {
        // Lógica para processar pagamento
        System.out.println("Lógica para processar pagamento - violação");
    }
}
