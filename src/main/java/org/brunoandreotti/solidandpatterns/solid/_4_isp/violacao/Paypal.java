package org.brunoandreotti.solidandpatterns.solid._4_isp.violacao;

public class Paypal implements PaymentInterface{
    @Override
    public void pay() {
        //Lógica para pagamento via Paypal
    }

    @Override
    public void generateQrCode() {
        throw new RuntimeException("Cartão de crédito não gera QR Code");
    }

    @Override
    public void generateDocument() {
        throw new RuntimeException("Paypal não gera boleto");
    }
}
