package org.brunoandreotti.solidandpatterns.solid._4_isp.solucao;

import org.brunoandreotti.solidandpatterns.solid._4_isp.solucao.interfaces.PaymentInterface;

public class Paypal implements PaymentInterface {
    @Override
    public void pay() {
        //Lógica para pagamento via Paypal
    }
}
