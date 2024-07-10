package dio.desafio;

public class ReprodutorMusical {
	public String musica;

	public ReprodutorMusical() {
		
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("MUSICA SELECIONADA: "+ musica);
		tocar();
	}
	 
	public void tocar() {
		System.out.println("TOCANDO MUSICA");
	}
	
	public void pararMusica() {
		System.out.println("PARANDO MUSICA");
	}
}
