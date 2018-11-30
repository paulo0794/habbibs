
package br.com.habbibs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args){
        System.out.println("Sistema inciado com sucesso");
        
        List<Produto> produtos;
        produtos = new ArrayList<>();
        
        Produto kibe = new Produto("kibe", 4,0);
        Produto esfirra = new Produto("Esfirra", 5,0);
        
        produtos.add(kibe);
        produtos.add(esfirra);
        
        produtos.forEach((produto) -> {
            System.out.println(produto.getNome());
        });
    }
}
