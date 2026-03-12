package designerPatternsEstruturais.Adapter;

import java.math.BigDecimal;

import http.JavaHttpClient;
import orcamento.Orcamento;
import orcamento.RegistroDeOrcamento;

public class PrincipalPadraoAdapter {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Design Patterns - Estruturais - Adapter --- \n");

         String texto = """
            O padrão de projeto Adapter (adaptador) é um padrão estrutural que permite que objetos com interfaces incompatíveis 
            colaborem entre si. Ele funciona como uma "ponte" ou intermediário (também chamado de wrapper ou invólucro) que converte a 
            interface de uma classe existente em outra interface esperada pelo cliente. 
        
            Principais Pontos:
                * Propósito: Fazer duas interfaces incompatíveis trabalharem juntas sem alterar o código original (especialmente útil para legados).
                * Como Funciona: Envolve um objeto (o Adaptee) dentro de um adaptador, que traduz as chamadas de método para um formato que o cliente entende (Target).
                * Tipos:
                    - Adapter de Objeto: Usa composição para passar a requisição ao objeto envolvido (mais comum).
                    - Adapter de Classe: Usa herança múltipla para adaptar a interface.
                    - Uso Comum: Integração de bibliotecas de terceiros, compatibilidade com sistemas legados ou conversão de formatos de dados (ex: XML para JSON)""";   
        System.out.println(texto + "/n"); 
        //como URL nao existe vai lançar uma exceção, mas o objetivo aqui é mostrar o padrão Adapter funcionando
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);

    }
}






