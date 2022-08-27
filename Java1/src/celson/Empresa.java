package celson;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nome;
	private int CNPJ;
	private String InsEstadual;
	private String dominio;
	List<Produtos> produtos; 
	List<Cliente> clientes; 
	public Empresa(String nome, int cnpj,String Ins,String dominio) {
		
		produtos = new ArrayList<Produtos>();
		clientes = new ArrayList<Cliente>();
		
		this.nome = nome;
		this.CNPJ=cnpj;
		this.InsEstadual=Ins;
		this.dominio=dominio;
		
	}
	
		public void CadastrarNovosProdutos(int codigo, String nome, double preco, int estoque){
			
			Produtos NovoProduto = new Produtos(codigo,nome,preco,estoque);
			produtos.add(NovoProduto);
			
		}
		
		public void ListarProdutos() {
			for(Produtos produto : produtos) {
				System.out.println(produto);
			}
		}
		
		 public void VenderProduto( int cpf, String senha, int codigo, int quantidade){
	
			 
			try { 
				if(Login(cpf,senha)==true) {
				
					 for(Produtos produto : produtos) {
							if(produto.getCodigo()==codigo){
								
								if(produto.getEstoque()>=quantidade) {
									System.out.println("---Venda de produto realizada com sucesso---");
									System.out.println("a quantidade vendida foi " + quantidade + " com um preço total de "+ quantidade*produto.getPreco()+ " reais" );
									produto.setEstoque(produto.getEstoque()-quantidade);
								
									
								
								}else {
									throw new SemEstoqueException();
								}
								
							
							}
							
						}
				
				}else {
					throw new SenhaIncorretaException();
				}
			 
			 
			
			}catch(Exception e){
				
					System.out.println("erro: " + e.getMessage());
			}
			 
			 
			 
			 
		 }
		 
			public boolean Login(int cpf,String senha) {
			
				 for(Cliente cliente : clientes) {
					
					 if(cliente.getCpf()==cpf && cliente.getSenha().equals(senha)) {
						
						return true;					 
					 }
					 
				 } return false;
			 }
			 
		 
		 
		 
		 public void ReporEstoque(int codigo, int quantidade){
			 for(Produtos produto : produtos) {
					if(produto.getCodigo()==codigo){
						produto.setEstoque(produto.getEstoque()+quantidade);
						System.out.println("Estoque do produto realizada com sucesso");
					}
				}
		 }
		 
		 
		 
		public void CadastrarNovosClientes(int cpf, String nome, String senha){
			
			Cliente NovoCliente = new Cliente(cpf,nome,senha);
			clientes.add(NovoCliente);
			
		}
	
	
	
	
	
}
