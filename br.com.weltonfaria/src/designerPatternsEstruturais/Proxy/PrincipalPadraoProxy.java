package designerPatternsEstruturais.Proxy;

import java.math.BigDecimal;

import designerPatternsEstruturais.Composite.orcamento.ItemOrcamentoComposite;
import designerPatternsEstruturais.Composite.orcamento.OrcamentoComposite;


public class PrincipalPadraoProxy {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Design Patterns - Estruturais - Proxy --- \n");

         String texto = """
            O padrão de projeto Proxy (proxy) é um padrão estrutural que permite que um objeto sirva como representante de outro objeto. 
            Ele cria um objeto proxy que atua como intermediário entre o cliente e o objeto real, permitindo controlar o acesso a ele.

            Principais Pontos:
                * Propósito: Controlar o acesso a um objeto real, permitindo adicionar funcionalidades extras sem modificar o código do objeto original.
                * Como Funciona: O proxy implementa a mesma interface que o objeto real e delega as chamadas de método para ele.
                * Tipos:
                    - Proxy Real: Objeto que realmente realiza a operação.
                    - Proxy: Objeto que controla o acesso ao objeto real.
                    - Uso Comum: Controle de acesso, lazy initialization, logging, cache, etc.""";   
        System.out.println(texto + "/n"); 

        OrcamentoComposite antigo = new OrcamentoComposite();
        antigo.adicionarItem(new ItemOrcamentoComposite(new BigDecimal("200")));

        OrcamentoComposite novo = new OrcamentoComposite();
        novo.adicionarItem(new ItemOrcamentoComposite(new BigDecimal("500")));

        novo.adicionarItem(antigo);
        System.out.println(">>> SEM PROXY <<< ");
        System.out.println(novo.getValorProxy());
        System.out.println(novo.getValorProxy());
        System.out.println(novo.getValorProxy());

        OrcamentoProxy proxy = new OrcamentoProxy(novo);
        System.out.println(">>> COM PROXY <<< ");
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());


    }
}







