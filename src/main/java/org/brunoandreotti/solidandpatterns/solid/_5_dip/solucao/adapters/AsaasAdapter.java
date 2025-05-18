package org.brunoandreotti.solidandpatterns.solid._5_dip.solucao.adapters;

import org.brunoandreotti.solidandpatterns.solid._5_dip.solucao.OrderDIPViolacao;
import org.brunoandreotti.solidandpatterns.solid._5_dip.solucao.PaymentGatewayInterface;
import org.brunoandreotti.solidandpatterns.solid._5_dip.solucao.bibliotecaExterna.AsaasClient;

public class AsaasAdapter implements PaymentGatewayInterface {
    @Override
    public void pay(OrderDIPViolacao order) {
       AsaasClient asaas = new AsaasClient();
        asaas.pay("nome pedido", order);
    }
}
