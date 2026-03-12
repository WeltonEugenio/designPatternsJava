package designerPatternsEstruturais.Composite;

import java.math.BigDecimal;
import designerPatternsEstruturais.Composite.orcamento.ItemOrcamentoComposite;
import designerPatternsEstruturais.Composite.orcamento.OrcamentoComposite;

public class PrincipalPadraoComposite {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Design Patterns - Estruturais - Composite --- \n");

         String texto = """
            O padrão de projeto Composite (composto) é um padrão estrutural que permite que objetos sejam organizados em estruturas de árvore 
            ara representar hierarquias parte-todo. Ele permite que clientes tratem de forma uniforme tanto objetos individuais quanto composições de objetos. 

            Principais Pontos:
                * Propósito: Permitir que clientes tratem objetos individuais e composições de objetos de forma uniforme.
                * Como Funciona: Define uma interface comum para todos os elementos da estrutura, permitindo que clientes operem sobre os elementos de forma transparente.
                * Tipos:
                    - Componente: Interface comum para todos os elementos da estrutura.
                    - Folha: Elemento individual na estrutura.
                    - Composite: Elemento que pode conter outros elementos da estrutura.
                    - Uso Comum: Representação de árvores de diretórios, menus, formas geométricas, etc.""";   
        System.out.println(texto + "/n"); 


        OrcamentoComposite antigo = new OrcamentoComposite();
        antigo.adicionarItem(new ItemOrcamentoComposite(new BigDecimal("200")));

        OrcamentoComposite novo = new OrcamentoComposite();
        novo.adicionarItem(new ItemOrcamentoComposite(new BigDecimal("500")));

        novo.adicionarItem(antigo);

        System.out.println(novo.getValor());



        
    }
}








