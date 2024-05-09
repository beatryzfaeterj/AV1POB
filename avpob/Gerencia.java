package avpob;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class Gerencia {
    private List<Produto> produtos;

    public Gerencia() {
        this.produtos = new ArrayList<>();
    }

    // 1. Incluir Produto
    public void incluirProduto() {
        Scanner scanner = new Scanner(System.in);
        // ... (Solicitar ao usuário os dados do produto: id, codigoBarras, sku, etc.) ... 
        try {
            Produto produto = new Produto(id, codigoBarras, sku, nome, descricao, categoria, preco, peso, fabricante);
            produtos.add(produto);
            System.out.println("Produto incluído com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // 2. Alterar Produto
    public void alterarProduto(int id) {
        // ... (Lógica para buscar o produto com base no ID) ...
        if (produtoEncontrado != null) {
            Scanner scanner = new Scanner(System.in);
            // ... (Solicitar ao usuário os novos dados do produto) ...
            try {
                produtoEncontrado.setCodigoBarras(novoCodigoBarras);
                // ... (Atualizar outros atributos) ...
                System.out.println("Produto alterado com sucesso!");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    // 3. Excluir Produto
    public void excluirProduto(int id) {
        boolean removido = produtos.removeIf(p -> p.getId() == id);
        if (removido) {
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    // 4. Listar Todos os Produtos
    public void listarTodosProdutos() {
        for (Produto produto : produtos) {
            // ... (Imprimir os detalhes do produto) ...
        }
    }

    // 5. Listar um Produto
    public void listarProduto(int id) {
        // ... (Lógica para buscar o produto com base no ID) ...
        if (produtoEncontrado != null) {
            // ... (Imprimir os detalhes do produto) ...
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}