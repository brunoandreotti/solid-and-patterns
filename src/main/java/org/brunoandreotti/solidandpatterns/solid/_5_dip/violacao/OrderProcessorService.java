package org.brunoandreotti.solidandpatterns.solid._5_dip.violacao;

//DIP — Dependency Inversion Principle (Princípio da Inversão de Dependência)

//Dependa de abstrações e não de implementações.
//Esse princípio diz que uma classe deve depender de interfaces e não de suas implementações ou classes concretas.

//Nessa caso estamos violando o princípio, pois, ao depender da classe PagarmeClient estamos dependendo de uma classe concreta
//e não de uma abstração e caso essa classe mude por algum motivo (nova versão da biblioteca e etc) precisaremos alterar o código
//e isso cria um acoplamento forte na nossa classe de régra de negócio
//Também dificulta caso queiramos utilizar outra biblioteca externa, pois precisaremos alterar a lógica da nossa
//classe de regra de negócio para se encaixar com a lógica da classe da nova biblioteca

import org.brunoandreotti.solidandpatterns.solid._5_dip.violacao.bibliotecaExterna.PagarmeClient;

public class OrderProcessorService {

    public void process(OrderDIPViolacao orderDIPViolacao) {

        //Logica de processamento do pedido

        PagarmeClient pagarMe = new PagarmeClient();
        pagarMe.pay("nome pedido", orderDIPViolacao);

    }
}
