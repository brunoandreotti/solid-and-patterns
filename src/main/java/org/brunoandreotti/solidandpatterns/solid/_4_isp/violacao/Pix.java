package org.brunoandreotti.solidandpatterns.solid._4_isp.violacao;

public class Pix implements PaymentInterface{
    @Override
    public void pay() {
        //Lógica para pagamento via Cartão de Crédito
    }

    public void generateQrCode() {
        //Lógica para gerar QrCode
    }

    @Override
    public void generateDocument() {
        throw new RuntimeException("Pix não gera boleto");
    }
}
