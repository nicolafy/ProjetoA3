/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

/**
 *
 * @author ffnic
 */
import java.util.ArrayList;
import java.util.List;

public class Bebidas {
    private List<Produto> produtos;

    public Bebidas() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto de adegas e bebidas adicionado com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto de adegas e bebidas cadastrado.");
        } else {
            System.out.println("Produtos de adegas e bebidas:");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }
}
