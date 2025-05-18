package org.brunoandreotti.solidandpatterns.solid._4_isp.solucao.interfaces;

//ISP — Interface Segregation Principle (Princípio da Segregação da Interface)
//Uma classe não deve ser forçada a implementar interfaces e métodos que não irão utilizar.
//Esse princípio declara que é melhor criar interfaces mais específicas ao invés de termos uma única interface genérica.

//Para resolvermos esse problema, podemos criar interfaces mais específicas para cada tipo de ação (pagar, gerar QrCode, gerar documento)
//Dessa maneira conseguimos fazer com que as classes de meio de pagamento implemente somente as interfaces que vão utilizar


public interface PaymentInterface {

    public void pay();




}
