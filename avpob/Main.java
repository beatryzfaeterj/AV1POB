package avpob;

 import java.util.ArrayList;
 import java.util.Scanner;

            public class Main {

                ArrayList<Produto> produtos = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);

                public static void main(String[] args) {
                    Main main = new Main();
                    main.run();
                }

                public void run() {
                    int opcFinal = 0;
                    while (opcFinal != 5) {
                        optionMenu();
                        opcFinal = scanner.nextInt();
                        switch (opcFinal) {
                            case 1:
                                listarTodosProdutos();
                                break;
                            case 2:
                                incluirProduto();
                                break;
                            case 3:
                                excluirProduto();
                                break;
                            case 4:
                                alterarProduto();
                                break;
                            case 5:
                                System.out.println("Até mais!");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    scanner.close();
                }

                public static void optionMenu() {
                    System.out.println("1 - Listar todos os produtos");
                    System.out.println("2 - Incluir um produto");
                    System.out.println("3 - Excluir um produto");
                    System.out.println("4 - Alterar um produto");
                    System.out.println("5 - Sair");
                }

                public void listarTodosProdutos() {
                    for (Produto produto : produtos) {
                        System.out.println("ID: " + produto.getId());
                        System.out.println("Código de Barras: " + produto.getCodigoBarras());
                        System.out.println("SKU: " + produto.getSku());
                        System.out.println("Nome: " + produto.getNome());
                        System.out.println("Descrição: " + produto.getDescricao());
                        System.out.println("Categoria: " + produto.getCategoria());
                        System.out.println("Preço: " + produto.getPreco());
                        System.out.println("Peso: " + produto.getPeso());
                        System.out.println("Fabricante: " + produto.getFabricante());
                    }
                }

                public void incluirProduto() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Digite o id do produto:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    System.out.println("Digite o codigo de barras do produto:");
                    String codigoBarras = scanner.nextLine();
                    System.out.println("Digite o sku do produto:");
                    String sku = scanner.nextLine();
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a descrição do produto:");
                    String descricao = scanner.nextLine();
                    System.out.println("Digite o categoria do produto:");
                    String categoria = scanner.nextLine();
                    System.out.println("Digite o preço do produto:");
                    Double preco = scanner.nextDouble();
                    System.out.println("Digite o peso do produto:");
                    Double peso = scanner.nextDouble();
                    System.out.println("Digite o fabricante do produto:");
                    String fabricante = scanner.nextLine();

                    Produto produto = new Produto(id, codigoBarras, sku, nome, descricao, categoria, preco, peso, fabricante);
                    produtos.add(produto);
                    System.out.println("Produto adicionado!");
                }

                public void excluirProduto() {
                    System.out.println("Digite o ID do produto a ser excluído: ");
                    int id = scanner.nextInt();
                    boolean removido = produtos.removeIf(p -> p.getId() == id);
                    if (removido) {
                        System.out.println("Produto excluído.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                }

                public void alterarProduto() {
                    System.out.println("Digite o ID do produto a ser alterado: ");
                    int idAlterar = scanner.nextInt();

                    for (Produto produto : produtos) { 
                        if (produto.getId() == idAlterar) {
                            System.out.println("1 - Nome");
                            System.out.println("2 - Descrição");
                            System.out.println("3 - Categoria");
                            System.out.println("4 - Preço");
                            System.out.println("5 - Peso");
                            System.out.println("6 - Fabricante");
                            System.out.println("7 - Codigo de Barras");
                            System.out.println("8 - SKU");

                            int opcaoAlteracao = scanner.nextInt();
                    

                            switch (opcaoAlteracao) {
                                case 1:
                                    System.out.println("Insira o novo nome: ");
                                    produto.setNome(scanner.nextLine());
                                    break;
                                case 2:
                                    System.out.println("Insira a nova descrição: ");
                                    produto.setDescricao(scanner.next());
                                    break;
                                case 3:
                                    System.out.println("Insira a nova categoria: ");
                                    produto.setCategoria(scanner.next());
                                    break;
                                case 4:
                                    System.out.println("Insira o novo preço: ");
                                    while (!scanner.hasNextDouble()) {
                                        System.out.println("Por favor, insira um preço válido: ");
                                        scanner.next();
                                    }
                                    produto.setPreco(scanner.nextDouble());
                                    break;
                                case 5:
                                    System.out.println("Insira o novo peso: ");
                                    while (!scanner.hasNextDouble()) {
                                        System.out.println("Por favor, insira um peso válido: ");
                                        scanner.next();
                                    }
                                    produto.setPeso(scanner.nextDouble());
                                    break;
                                case 6:
                                    System.out.println("Insira o novo fabricante: ");
                                    produto.setFabricante(scanner.next());
                                    break;
                                case 7:
                                    System.out.println("Insira o novo código de barras: ");
                                    produto.setCodigoBarras(scanner.nextLine());
                                    break;
                                case 8:
                                    System.out.println("Insira o novo SKU: ");
                                    produto.setSku(scanner.next());
                                    break;
                            }
                            System.out.println("Deu green!");
                            return; 
                        }
                    }
                    System.out.println("Deu red.");
                }
            }
     
           
