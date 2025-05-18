package org.brunoandreotti.solidandpatterns.solid._5_dip.solucao;

//DIP — Dependency Inversion Principle (Princípio da Inversão de Dependência)

//Dependa de abstrações e não de implementações.
//Esse princípio diz que uma classe deve depender de interfaces e não de suas implementações ou classes concretas.

//Para resolver isso podemos criar uma interface que será implementada por classes que servirão de adaptadores para as classes
//concretas das bibliotecas externas
//Dessa maneira caso haja alguma alteração na classe da biblioteca externa não iremos precisar alterar
//a classe contendo e classe de negócio
//E caso queiramos utilizar outra biblioteca de pagamento, basta criar uma nova classe implementando a interface
//para service de adaptador para a nova biblioteca

public class OrderProcessorService {

    private final PaymentGatewayInterface paymentGatewayInterface;

    public OrderProcessorService(PaymentGatewayInterface paymentGatewayInterface) {
        this.paymentGatewayInterface = paymentGatewayInterface;
    }

    public void process(OrderDIPViolacao orderDIPViolacao) {

        //Logica de processamento do pedido

        paymentGatewayInterface.pay(orderDIPViolacao);

    }
}
