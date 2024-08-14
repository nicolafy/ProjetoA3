/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

/**
 *
 * @author Nicko
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
    class Mercado {
        private List<Produto>produtos;
        
     public Mercado() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto disponivel.");
        } else {
            System.out.println("Produtos disponiveis:");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    public void procurarProduto(String nomeProduto) {
        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                System.out.println("Produto encontrado: " + produto);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto nao encontrado.");
        }
    }

    public void removerProduto(String nomeProduto, int quantidade) {
        Produto produtoRemover = null;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                produtoRemover = produto;
                break;
            }
        }
        if (produtoRemover != null) {
            if (quantidade >= produtoRemover.getQuantidade()) {
                produtos.remove(produtoRemover);
                System.out.println("Produto removido com sucesso.");
            } else {
                produtoRemover.setQuantidade(produtoRemover.getQuantidade() - quantidade);
                System.out.println("Removida quantidade especificada do produto.");
            }
        } else {
            System.out.println("Produto nao encontrado para remocao.");
        }
    }
}