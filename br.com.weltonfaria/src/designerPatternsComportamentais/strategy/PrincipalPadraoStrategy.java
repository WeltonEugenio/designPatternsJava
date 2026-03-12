package designerPatternsComportamentais.strategy;

import java.math.BigDecimal;
import impostos.CalculadoraDeImpostos;
import orcamento.Orcamento;

public class PrincipalPadraoStrategy {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Design Patterns - Comportamentais - Strategy --- \n");

         String texto = """
            O padrão de projeto Strategy é um padrão comportamental que define uma família de algoritmos, 
            encapsula cada um em uma classe separada e os torna intercambiáveis. Ele permite que o comportamento 
            de um objeto seja alterado em tempo de execução, eliminando condicionais complexos (if/else, switch) e 
            promovendo o uso de composição em vez de herança 
    
            Principais Características:
                * Encapsulamento: Algoritmos variados são isolados em classes próprias.
                * Intercambiabilidade: Estratégias podem ser trocadas em tempo de execução.
                * Princípio Aberto/Fechado: Novos comportamentos podem ser adicionados sem alterar o código existente""";   
        System.out.println(texto + "\n"); 
        
        Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new PIS()));


    }
}
