package org.brunoandreotti.solidandpatterns.solid._4_isp.solucao;

import org.brunoandreotti.solidandpatterns.solid._4_isp.solucao.interfaces.PaymentInterface;
import org.brunoandreotti.solidandpatterns.solid._4_isp.solucao.interfaces.QrCodeGeneratorInterface;

public class Pix implements PaymentInterface, QrCodeGeneratorInterface {
    @Override
    public void pay() {
        //Lógica para pagamento via Cartão de Crédito
    }

    @Override
    public void generateQrCode() {
        //Lógica para gerar Qr code
    }
}
