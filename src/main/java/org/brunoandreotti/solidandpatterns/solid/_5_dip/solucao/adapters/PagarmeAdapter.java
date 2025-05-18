package org.brunoandreotti.solidandpatterns.solid._5_dip.solucao.adapters;

import org.brunoandreotti.solidandpatterns.solid._5_dip.solucao.OrderDIPViolacao;
import org.brunoandreotti.solidandpatterns.solid._5_dip.solucao.PaymentGatewayInterface;
import org.brunoandreotti.solidandpatterns.solid._5_dip.solucao.bibliotecaExterna.PagarmeClient;

public class PagarmeAdapter implements PaymentGatewayInterface {
    @Override
    public void pay(OrderDIPViolacao order) {
        PagarmeClient pagarMe = new PagarmeClient();
        pagarMe.pay("nome pedido", order);
    }
}
