package celson;

public class Teste {
	public static void main(String[] args) {
		
		Empresa empresa1 = new Empresa("kabum",123,"não sei", "kabum.com.br");
		
		
		empresa1.CadastrarNovosProdutos(123, "ssd", 130.00, 10);//teste de cadastro de produtos
		empresa1.CadastrarNovosProdutos(222, "placa de video", 2340.00, 100);
		empresa1.CadastrarNovosClientes(123, "celson", "123");//teste de cadastro de clientes
		empresa1.ListarProdutos();//teste de lista de produtos
		empresa1.VenderProduto(123,"123",222, 100);//testes de venda de produtos
		empresa1.VenderProduto(123,"123",222, 100);
		empresa1.ReporEstoque(222, 82);
		empresa1.VenderProduto(123,"carlos",222, 80);
		empresa1.VenderProduto(123,"123",222, 80);
		empresa1.ListarProdutos();
		
	//estocar 
	//	empresa1.ReporEstoque(222, 14);
	//empresa1.ListarProdutos();
	//teste de exceptions personalizadas
		
		
		
		
		
	}
}
