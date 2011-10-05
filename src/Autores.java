
public class Autores {

	public static String formata(String nomeAutor) {
		String[] separandoPalavras = nomeAutor.split(" ");
		int tamanho = separandoPalavras.length;
		
		String nome = separandoPalavras[0];
		String primeiraLetraNome = nome.substring(0,1); 
		String restoNome = nome.substring(1,nome.length());
		String maiusculaNome = "";		
		maiusculaNome  = primeiraLetraNome.toUpperCase();
				
		String sobrenome = separandoPalavras[tamanho -1];
		String maiusculaSobrenome  = "";
		maiusculaSobrenome  = sobrenome.toUpperCase();
		
		String nomesDoMeio = "";
		
		for(int i = 1; i < tamanho -1; i++){
		 nomesDoMeio = nomesDoMeio+" "+separandoPalavras[i];
		}

		return maiusculaSobrenome+", "+ maiusculaNome + restoNome + nomesDoMeio;
	}
}
