package br.com.extend.aluguel;

public class Principal {

	public static void main(String[] args) throws Exception {
	
		Casa casa = new Casa();
		
		Casa casaX = casa.pegaCasa(2);
		
		new Contrato()
			.nomeDoArquivo("Contrato Maria Enedina")
			.comodosDaCasa(casaX.getComodosDaCasa())
			.logradouro(casaX.getLogradouro())
			.nomeRgCpfDoCasal("Maria Enedian de Araujo Santos RG 49.900.878-9 CPF 347.221.438-46")
			.dataInicioLocacao("10/02/2021")
			.dataTerminoLocacao("10/02/2022")
	 		.diaPagamento("10 (dez)")
	 		.valorAluguel(casaX.getValorAluguel())
	 	 	.depositoPago(true)
	 	 	
			//.nessarioEscreverAgua(true)
			.logradouroAgua(casaX.getLogradouroAgua())
			.numeroInstalacaoAgua(casaX.getNumeroInstalacaoAgua()) 
			
			//.necessarioEscreverLuz(true)
			.logradouroLuz(casaX.getLogradouroLuz()) 
			.numeroInstalacaoLuz(casaX.getNumeroInstalacaoLuz())
			
			.dataAssinatura("28 de Janeiro de 2021.")
			.gera();
		
		System.out.println("gerou!");
	}
	
}
