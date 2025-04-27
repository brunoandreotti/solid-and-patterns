package org.brunoandreotti.solidandpatterns.solid._3_lsp.pos_condicao;

import java.io.File;

//LSP - Liskov Substitution Principle (Princípio da substituição de Liskov)
//Uma classe derivada deve ser substituível por sua classe base.
//Esse princípio declara que uma classe herdada de outra classe ou que implementa uma ‘interface’
// pode ser substituída por sua classe mãe ou outra classe que implementa a mesma ‘interface’
// sem que o comportamento do sistema seja alterado.

//Pós-condição
//Não retorne comportamentos inesperados.

//Nessa caso estamos ferindo esse principio em sua pós-condição, pois, apesar das classes CSVReportGenerator, PDFReportGenerator, S3ReportGenerator
//implementarem a mesma interface e o retorno ser uma String, o conteúdo do retorno em si é diferente.
//CSV e PDF retornam um caminho de arquivo local enquanto S3 retorna uma url para arquivo na nuvem, dessa maneira
//sendo um comportamento inesperado.
//Isso fará o código que utiliza a interface quebrar, pois não espera o comportamento diferente do S3ReportGenerator.

//O problema foi gerado, pois a interface ReportGeneratorInterface é muito genérica, para uma situação em que existem
//geradores com comportamentos diferentes.

//Para resolver podemos segregar a interface e criar duas interfaces mais específicas, uma para geradores que geram arquivos locais
//e outra para geradores que geram arquivos na nuvem, por exemplo
//LocalReportGeneratorInterface
//CloudReportGeneratorInterface

//Dessa maneira o cliente sabe que existem tipos diferentes de gerador, podendo segregar as classes quie utilizariam
// as interfaces, fazendo regras específicas para cada tipo.
//LocalReportProcessor
//CloudReportProcessor


public class ReportProcessor {

    public void process(ReportGeneratorInterface reportGenerator) {

        String path = reportGenerator.generate();

        File file = new File(path);

        if (!file.exists()) {
            throw new RuntimeException("Arquivo local não existente.");
        }

        // lógica para processas arquivo
    }

}
