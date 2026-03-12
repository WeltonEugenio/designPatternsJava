package designerPatternsEstruturais.Decorator;

import java.math.BigDecimal;

import impostos.CalculadoraDeImpostosDecorator;
import orcamento.Orcamento;

public class PrincipalPadraoDecorator {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Design Patterns - Estruturais - Decorator --- \n");

         String texto = """
            O padrão de projeto Decorator (decorador) é um padrão estrutural que permite adicionar funcionalidades a objetos de forma dinâmica, 
            sem alterar o código original. Ele funciona como uma "ponte" ou intermediário (também chamado de wrapper ou invólucro) que envolve um objeto 
            e adiciona comportamentos extras a ele.

            Principais Pontos:
                * Propósito: Fazer duas interfaces incompatíveis trabalharem juntas sem alterar o código original (especialmente útil para legados).
                * Como Funciona: Envolve um objeto (o Adaptee) dentro de um adaptador, que traduz as chamadas de método para um formato que o cliente entende (Target).
                * Tipos:
                    - Decorator de Objeto: Usa composição para passar a requisição ao objeto envolvido (mais comum).
                    - Decorator de Classe: Usa herança múltipla para adaptar a interface.
                    - Uso Comum: Integração de bibliotecas de terceiros, compatibilidade com sistemas legados ou conversão de formatos de dados (ex: XML para JSON)""";   
        System.out.println(texto + "/n"); 

        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostosDecorator calculadoraDecorator = new CalculadoraDeImpostosDecorator();
        
        System.out.println(calculadoraDecorator.calcular(orcamento, new PIS(new ICMS((null)))));




    }
}






