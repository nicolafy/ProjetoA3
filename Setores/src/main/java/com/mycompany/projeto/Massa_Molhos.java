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

public class Massa_Molhos {
    private List<Produto> produtos;

    public Massa_Molhos() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto de massa e molhos adicionado com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto de massa e molhos cadastrado.");
        } else {
            System.out.println("Produtos de massa e molhos:");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }
}
