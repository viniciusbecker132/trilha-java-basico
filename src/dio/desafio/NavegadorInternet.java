package dio.desafio;

public class NavegadorInternet {
	public String url;

	public NavegadorInternet() {
	}
	
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO PAGINA");
	}
	
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA");
	}
	
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA");
		exibirPagina("");
	}
	
	
}
