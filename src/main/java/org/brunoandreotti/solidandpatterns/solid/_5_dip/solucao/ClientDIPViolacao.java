package org.brunoandreotti.solidandpatterns.solid._5_dip.solucao;

import org.brunoandreotti.solidandpatterns.solid._5_dip.solucao.adapters.AsaasAdapter;
import org.brunoandreotti.solidandpatterns.solid._5_dip.solucao.adapters.PagarmeAdapter;


public class ClientDIPViolacao {

    public static void main(String[] args) {
        //Processamento utilizando PagarMe
        PagarmeAdapter pagarMe = new PagarmeAdapter();
        OrderDIPViolacao order = new OrderDIPViolacao();
        OrderProcessorService processorPagarMe = new OrderProcessorService(pagarMe);
        processorPagarMe.process(order);

        //Processamento utilizando Asaas
        AsaasAdapter asaas = new AsaasAdapter();
        OrderProcessorService processorAsaas = new OrderProcessorService(asaas);
        processorAsaas.process(order);
;    }
}
