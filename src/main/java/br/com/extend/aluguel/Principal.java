package br.com.extend.aluguel;

public class Principal {

	public static void main(String[] args) throws Exception {
	
		Casa casaX = new Casa().pegaCasa(2);
		
		new Contrato()
			.nomeDoArquivo("Contrato Wesley Lucas")
			.comodosDaCasa(casaX.getComodosDaCasa())
			.logradouro(casaX.getLogradouro())
			.nomeRgCpfDoCasal("Wesley Lucas Alves RG 53.390.234-4 CPF 468.315.518-40")
			.dataInicioLocacao("05/02/2021")
			.dataTerminoLocacao("05/02/2022")
	 		.diaPagamento("5 (cinco)")
	 		.valorAluguel(casaX.getValorAluguel())
	 	 	.depositoPago(false)
			.logradouroAgua(casaX.getLogradouroAgua())
			.numeroInstalacaoAgua(casaX.getNumeroInstalacaoAgua()) 
			.logradouroLuz(casaX.getLogradouroLuz()) 
			.numeroInstalacaoLuz(casaX.getNumeroInstalacaoLuz())
			.dataAssinatura("28 de Janeiro de 2021.")
			.gera();
		
		System.out.println("gerou!");
	}
	
}
