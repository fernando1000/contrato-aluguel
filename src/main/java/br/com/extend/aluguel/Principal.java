package br.com.extend.aluguel;

public class Principal {

	public static void main(String[] args) throws Exception {
	
		Casa casaX = new Casa().pegaCasa(7);
		
		new Contrato()
			.nomeDoArquivo("Contrato Eneida Josefina")
			.comodosDaCasa(casaX.getComodosDaCasa())
			.logradouro(casaX.getLogradouro())
			.nomeRgCpfDoCasal("Eneida Josefina CPF: 707.619.432-50 RNM: F069563-E")
			.dataInicioLocacao("10/10/2021")
			.dataTerminoLocacao("10/10/2022")
	 		.diaPagamento("10 (dez)")
	 		.valorAluguel(casaX.getValorAluguel())
	 	 	.depositoPago(true)
			.logradouroAgua(casaX.getLogradouroAgua())
			.numeroInstalacaoAgua(casaX.getNumeroInstalacaoAgua()) 
			.logradouroLuz(casaX.getLogradouroLuz()) 
			.numeroInstalacaoLuz(casaX.getNumeroInstalacaoLuz())
			.dataAssinatura("27 de Setembro de 2021.")
			.gera();
		
		System.out.println("gerou!");
	}
	
}
