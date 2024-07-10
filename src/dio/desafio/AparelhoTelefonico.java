package dio.desafio;

public class AparelhoTelefonico {
	public String numero;

	public AparelhoTelefonico() {
	}
	
	public void ligar(String numero) {
		System.out.println("LIGANDO PARA O NUMERO: "+ numero);
	}
	
	public void atender() {
		System.out.println("ATENDENDO TELEFONE");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}
}
