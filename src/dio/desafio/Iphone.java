package dio.desafio;

import java.util.Random;

public class Iphone {

	public static void main(String[] args) {
		AparelhoTelefonico aparelho =  new AparelhoTelefonico();
		ReprodutorMusical reprodutor =  new ReprodutorMusical();
		NavegadorInternet navegador =  new NavegadorInternet();
		
		/*aparelho telefonico*/
		aparelho.ligar("00 1234-5678");
		
		Random random = new Random();
		boolean atendeu =  true;
		for(int tentativa=0; tentativa < 5; tentativa ++) {
			int x = random.nextInt(10);
			if(x == 3) {
				aparelho.atender();
				atendeu = true;
			}
			else atendeu = false;
			
		}
			if(!atendeu)
			aparelho.iniciarCorreioVoz();
		
		/*reprodutor musical*/
		reprodutor.selecionarMusica("musica 1");
		reprodutor.pararMusica();
		
		/*navegador de internet*/
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		
	}

}
