package org.brunoandreotti.solidandpatterns.solid._4_isp.violacao;

public class Boleto implements PaymentInterface {
    @Override
    public void pay() {
        //Lógica para pagamento via Boleto
    }

    @Override
    public void generateQrCode() {
        throw new RuntimeException("Boleto não gera QR Code");
    }

    @Override
    public void generateDocument() {
        //Lógica para gerar Boleto
    }
}
