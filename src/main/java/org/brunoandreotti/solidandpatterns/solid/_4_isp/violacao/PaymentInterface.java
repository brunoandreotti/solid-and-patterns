package org.brunoandreotti.solidandpatterns.solid._4_isp.violacao;

//ISP — Interface Segregation Principle (Princípio da Segregação da Interface)
//Uma classe não deve ser forçada a implementar interfaces e métodos que não irão utilizar.
//Esse princípio declara que é melhor criar interfaces mais específicas ao invés de termos uma única interface genérica.

//Estamos ferindo esse principio, pois, apesar de todas as classes de pagamento (CreditCard, Paypal e PIX)
//utilizarem o method pay() da interface, apenas o PIX utiliza o method generateQRCode() e como criamos
//apenas uma interface genérica, foi preciso adicionar o method de gerar QR Code nela também
//fazendo com que as classes CreditCard e Paypal implementem um method que não irão utilizar.qq


public interface PaymentInterface {

    public void pay();

    public void generateQrCode();

    public void generateDocument();
}
