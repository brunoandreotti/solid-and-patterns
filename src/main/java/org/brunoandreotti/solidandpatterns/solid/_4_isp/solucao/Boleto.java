package org.brunoandreotti.solidandpatterns.solid._4_isp.solucao;

import org.brunoandreotti.solidandpatterns.solid._4_isp.solucao.interfaces.DocumentGeneratorInterface;
import org.brunoandreotti.solidandpatterns.solid._4_isp.solucao.interfaces.PaymentInterface;

public class Boleto implements PaymentInterface, DocumentGeneratorInterface {
    @Override
    public void pay() {
        //Lógica para pagamento via Boleto
    }


    @Override
    public void generateDocument() {
        ////Lógica para gerar boleto
    }
}
