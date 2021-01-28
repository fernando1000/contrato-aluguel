package br.com.extend.aluguel;

import java.util.HashMap;
import java.util.Map;

public class Casa {

	private String comodosDaCasa;
	private String logradouro;
	private String valorAluguel;
	private String logradouroAgua;
	private String numeroInstalacaoAgua;
	private String logradouroLuz;
	private String numeroInstalacaoLuz;
	
	private Map<Integer, Casa> casas;
	
	public Casa(String comodosDaCasa, String logradouro, String valorAluguel, String logradouroAgua, String numeroInstalacaoAgua, String logradouroLuz, String numeroInstalacaoLuz) {
		super();
		this.comodosDaCasa = comodosDaCasa;
		this.logradouro = logradouro;
		this.valorAluguel = valorAluguel;
		this.logradouroAgua = logradouroAgua;
		this.numeroInstalacaoAgua = numeroInstalacaoAgua;
		this.logradouroLuz = logradouroLuz;
		this.numeroInstalacaoLuz = numeroInstalacaoLuz;
	}

	public Casa() {
		casas = new HashMap<Integer, Casa>();
		adicionaCasas();
	}
	private void adicionaCasas() {
		casas.put(1, new Casa("cozinha, sala, quarto, banheiro e garagem", "na rua Augusta 196 casa 01", "R$750,00 (setecentos e cinquenta reais)", null, null, null, null)); 
		casas.put(2, new Casa("cozinha, sala, quarto, banheiro e garagem", "na rua Boa Esperança, 183 casa 02", "R$700,00 (setecentos reais)", null, null, null, null)); 
		casas.put(3, new Casa("cozinha, quarto e banheiro", "na rua Augusta, 196 casa 03", "R$450,00 (quatrocentos e cinquenta reais)", "rua Boa Esperança, 183", "08146241/70", null, null)); 
		casas.put(4, new Casa("cozinha, quarto e banheiro", "rua Augusta, 196 casa 04", "R$450,00 (quatrocentos e cinquenta reais)", null, null, null, null)); 
		casas.put(44, new Casa("cozinha, 2 quartos, lavanderia e banheiro", "rua Boa Esperança, 183 casa 04", "R$650,00 (seiscentos e cinquenta reais)", "rua Boa Esperança 183 casa 8", "08614511/80", "rua Boa Esperança 183 casa 4", "0203628868")); 
		casas.put(5, new Casa("cozinha, quarto e banheiro", "rua Augusta, 196 casa 05", "R$450,00 (quatrocentos e cinquenta reais)", "rua Boa Esperança, 183 casa 4", "08146259/08", "rua Augusta 196 casa 5", "202435470"));  
		casas.put(6, new Casa("cozinha, quarto e banheiro", "rua Augusta, 196 casa 06", "R$450,00 (quatrocentos e cinquenta reais)", "rua Boa Esperança, 183 casa 9", "08614512/60", "rua Augusta 196 casa 6", "202435471")); 
		casas.put(7, new Casa("cozinha, sala, quarto e banheiro", "rua Augusta, 196 casa 07", "R$600,00 (seiscentos reais)", null, null, null, null)); 
		casas.put(8, new Casa("cozinha, sala, quarto e banheiro", "na rua Augusta, 196 casa 08", "R$600,00 (seis centos reais)", "rua Boa Esperança, 183 casa 3", "08146234/41", "rua Augusta 196 casa 8", "0202435473"));
	}
	
	public Casa pegaCasa(int numero) {
		Casa casaX = casas.get(numero);
		return casaX;
	}

	public String getComodosDaCasa() {
		return comodosDaCasa;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getValorAluguel() {
		return valorAluguel;
	}

	public String getLogradouroAgua() {
		return logradouroAgua;
	}

	public String getNumeroInstalacaoAgua() {
		return numeroInstalacaoAgua;
	}

	public String getLogradouroLuz() {
		return logradouroLuz;
	}

	public String getNumeroInstalacaoLuz() {
		return numeroInstalacaoLuz;
	}

	public Map<Integer, Casa> getCasas() {
		return casas;
	}
	
	
}
