package org.brunoandreotti.solidandpatterns.solid._4_isp.violacao;

public class CreditCard implements PaymentInterface{
    @Override
    public void pay() {
        //Lógica para pagamento via Cartão de Crédito
    }

    @Override
    public void generateQrCode() {
        throw new RuntimeException("Cartão de crédito não gera QR Code");
    }

    @Override
    public void generateDocument() {
        throw new RuntimeException("Cartão de crédito não gera boleto");
    }
}
