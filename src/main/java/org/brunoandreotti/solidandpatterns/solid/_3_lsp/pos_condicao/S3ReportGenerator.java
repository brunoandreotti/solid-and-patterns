package org.brunoandreotti.solidandpatterns.solid._3_lsp.pos_condicao;

public class S3ReportGenerator implements ReportGeneratorInterface {
    @Override
    public String generate() {

        // Código para o relatório S3

        String fileName = "relatório-s3.txt";

        return String.format("https://s3.amazonaws.com/bucket/%s", fileName);
    }
}
