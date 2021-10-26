package br.com.extend.aluguel;

public class Principal {

	public static void main(String[] args) throws Exception {
	
		Casa casaX = new Casa().pegaCasa(1);
		
		new Contrato()
			.nomeDoArquivo("Contrato Ezaquiane e Thiago")
			.comodosDaCasa(casaX.getComodosDaCasa())
			.logradouro(casaX.getLogradouro())
			.nomeRgCpfDoCasal("Ezaquiane Marques da Silva CPF 230.188.318-37 RG 40149733 e Thiago de Almeida Tiburcio CPF 096.779.444-79 RG 34339230")
			.dataInicioLocacao("02/11/2021")
			.dataTerminoLocacao("02/11/2023")
	 		.diaPagamento("2 (dois)")
	 		.valorAluguel(casaX.getValorAluguel())
	 	 	.depositoPago(true)
			.logradouroAgua(casaX.getLogradouroAgua())
			.numeroInstalacaoAgua(casaX.getNumeroInstalacaoAgua()) 
			.logradouroLuz(casaX.getLogradouroLuz()) 
			.numeroInstalacaoLuz(casaX.getNumeroInstalacaoLuz())
			.dataAssinatura("29 de Outubro de 2021.")
			.gera();
		
		System.out.println("gerou!");
		//teste
	}
	
}
