package br.com.extend.aluguel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException, DocumentException  {
	
		String nomeDoArquivo = "Contrato Reinaldo e Edna";
		String comodosDaCasa = "cozinha, sala, quarto, banheiro e garagem";
		String logradouro = "rua Augusta 196 casa 01";
		String nomeRgCpfDoCasal = "Edna Maria da Silva RG 22.525.082-2 CPF 132.979.678-03 e Reinaldo Ferreira RG 29.278.052-7 CPF 279.207.028-52";
 		String dataInicioLocacao = "08/09/2020";
 		String dataTerminoLocacao = "08/09/2021";
 	 	String diaPagamento = "8 (oito)";			
		String valorAluguel = "R$750,00 (sete centos e cinquenta reais)";
		boolean pagouDeposito = false;
		boolean precisaEscreverAguaLuz = false;
			String logradouroAgua = "rua augusta 196 casa 8"; 
			String numeroInstalacaoAgua = "0861451180"; 
			String logradouroLuz = "rua augusta 196 casa 4"; 
			String numeroInstalacaoLuz = "203628868";
		String dataAssinatura = "31 de Agosto de 2020.";
		
		geraContrato(nomeDoArquivo, comodosDaCasa, logradouro, nomeRgCpfDoCasal, dataInicioLocacao, dataTerminoLocacao, diaPagamento, valorAluguel, 
					 pagouDeposito, precisaEscreverAguaLuz, logradouroAgua, numeroInstalacaoAgua, logradouroLuz, numeroInstalacaoLuz, dataAssinatura);
	}
	
	private static void geraContrato(String nomeDoArquivo, 
									 String comodosDaCasa, 
									 String logradouro, 
									 String nomeRgCpfDoCasal, 
									 String dataInicioLocacao, 
									 String dataTerminoLocacao, 
									 String diaPagamento, 
									 String valorAluguel, 
									 boolean pagouDeposito,
									 boolean precisaEscreverAguaLuz,
									 String logradouroAgua, 
									 String numeroInstalacaoAgua, 
									 String logradouroLuz, 
									 String numeroInstalacaoLuz, 
									 String dataAssinatura) throws FileNotFoundException, DocumentException{
	
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(nomeDoArquivo+".pdf"));
		document.open();
		
		Font fontBoldTitulo = FontFactory.getFont(FontFactory.COURIER_BOLD, 16, BaseColor.BLACK);
		Font fontBoldConteudo = FontFactory.getFont(FontFactory.COURIER_BOLD, 12, BaseColor.BLACK);
		Font fontConteudo = FontFactory.getFont(FontFactory.COURIER, 12, BaseColor.BLACK);
		
	
		Paragraph p1 = new Paragraph();
		p1.setAlignment(Paragraph.ALIGN_CENTER);
		p1.add(new Chunk("CONTRATO DE LOCAÇÃO RESIDENCIAL", fontBoldTitulo));
		p1.add("\n\n");
		
		Paragraph p2 = new Paragraph();
		p2.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p2.add(new Chunk("IMÓVEL CONTRATADO: ", fontBoldConteudo));
		p2.add(new Chunk("Uma casa com "+comodosDaCasa+", situado na "+logradouro+", Parque Boa Esperança, 06653-590, Itapevi SP.", fontConteudo));
		p2.add("\n\n");
		
		Paragraph p3 = new Paragraph();
		p3.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p3.add(new Chunk("LOCADOR: ", fontBoldConteudo));
		p3.add(new Chunk("Quitéria Pereira Neves, Brasileira, Casada, portadora da cédula de identidade RG 36.841.743-8 e CPF 882.476.434-72", fontConteudo));
		p3.add("\n\n");
	
		Paragraph p4 = new Paragraph();
		p4.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p4.add(new Chunk("LOCATÁRIO: ", fontBoldConteudo));
		p4.add(new Chunk(nomeRgCpfDoCasal, fontConteudo));
		p4.add("\n\n");
	
		Paragraph p5 = new Paragraph();
		p5.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p5.add(new Chunk("CLÁUSULA PRIMEIRA: ", fontBoldConteudo));
		p5.add(new Chunk("O Prazo da locação é de 12 meses, iniciando em "+dataInicioLocacao+", com término em "+dataTerminoLocacao+", independentemente de aviso ou interpelação judicial ou mesmo extrajudicial.", fontConteudo));
		p5.add("\n\n");
	
		Paragraph p6 = new Paragraph();
		p6.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p6.add(new Chunk("CLÁUSULA SEGUNDA: ", fontBoldConteudo));
		p6.add(new Chunk("O aluguel mensal deverá ser pago todo dia "+diaPagamento+" e seu valor é de "+valorAluguel+" mensais reajustados anualmente em conformidade com a variação IGP-M. Sendo que no primeiro mês de aluguel o locatário deverá efetuar um depósito de um mês de aluguel antecipado.", fontConteudo));
		if(!pagouDeposito) {
			p6.add("\n");
			p6.add(new Chunk("•	Observação: o locatário não efetuou o pagamento do depósito.", fontConteudo));
		}
		p6.add("\n\n");

		Paragraph p7 = new Paragraph();
		p7.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p7.add(new Chunk("CLÁUSULA TERCEIRA: ", fontBoldConteudo));
		p7.add(new Chunk("O locatário será responsável por todos os incidentes que venham a ocorrer com o imóvel que foi alugado a partir de sua data de locação.", fontConteudo));
		p7.add("\n\n");

		Paragraph p8 = new Paragraph();
		p8.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p8.add(new Chunk("CLÁUSULA QUARTA: ", fontBoldConteudo));
		p8.add(new Chunk("O locatário será responsável por todas as despesas provenientes de sua utilização sejam elas: ligação ou consumo de luz, água e gás que serão pagas diretamente para as empresas fornecedoras dos referidos serviços.", fontConteudo));
		
		if(precisaEscreverAguaLuz) {
			p8.add("\n");
			p8.add(new Chunk("•	Observação: o endereço da água fica situado na "+logradouroAgua+", com a instalação numero "+numeroInstalacaoAgua+".", fontConteudo));
			p8.add("\n");
			p8.add(new Chunk("•	Observação: o endereço da luz  fica situado na "+logradouroLuz+", com a instalação numero "+numeroInstalacaoLuz+".", fontConteudo));			
		}
		p8.add("\n\n");

		Paragraph p9 = new Paragraph();
		p9.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p9.add(new Chunk("CLÁUSULA QUINTA: ", fontBoldConteudo));
		p9.add(new Chunk("Em caso de atraso no pagamento do aluguel, será aplicado uma multa de 2% (dois por centro) do montante devido.", fontConteudo));
		p9.add("\n\n");

		Paragraph p10 = new Paragraph();
		p10.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p10.add(new Chunk("CLÁUSULA SEXTA: ", fontBoldConteudo));
		p10.add(new Chunk("Fica ao locatário a responsabilidade em zelar pela conservação e limpeza do imóvel, efetuando as reformas necessárias para sua manutenção sendo que todos os gastos e pagamentos ocorrerão por conta do mesmo.", fontConteudo));
		p10.add("\n\n");

		Paragraph p11 = new Paragraph();
		p11.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p11.add(new Chunk("CLÁUSULA SÉTIMA: ", fontBoldConteudo));
		p11.add(new Chunk("O locatário fica obrigado a devolver o imóvel em perfeita condição de limpeza e conservação inclusive da pintura das paredes quando o mesmo deixar o imóvel.", fontConteudo));
		p11.add("\n\n");

		Paragraph p12 = new Paragraph();
		p12.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p12.add(new Chunk("CLÁUSULA OITAVA: ", fontBoldConteudo));
		p12.add(new Chunk("O locatário não poderá modificar a estrutura do imóvel alugado sem a prévia autorização por escrito do locador. No caso de realização de alguma obra, estas serão incorporadas ao imóvel sem que tenha o locatário qualquer indenização pelas obras realizadas. ", fontConteudo));
		p12.add("\n\n");

		Paragraph p13 = new Paragraph();
		p13.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p13.add(new Chunk("CLÁUSULA NONA: ", fontBoldConteudo));
		p13.add(new Chunk("O locatário declara receber o imóvel em perfeito estado de conservação e funcionamento observado isso no dia em que o imóvel foi alugado.", fontConteudo));
		p13.add("\n\n");

		Paragraph p14 = new Paragraph();
		p14.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p14.add(new Chunk("CLÁUSULA DÉCIMA: ", fontBoldConteudo));
		p14.add(new Chunk("O locatário declara que o imóvel alugado, será exclusivamente para uso residencial e de sua família.", fontConteudo));
		p14.add("\n\n");

		Paragraph p15 = new Paragraph();
		p15.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p15.add(new Chunk("CLÁUSULA DÉCIMA PRIMEIRA: ", fontBoldConteudo));
		p15.add(new Chunk("O locatário não poderá em hipótese alguma sublocar, transferir ou ceder o imóvel para terceiros, sem o consentimento prévio e por escrito do locador.", fontConteudo));
		p15.add("\n\n");

		Paragraph p16 = new Paragraph();
		p16.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p16.add(new Chunk("CLÁUSULA DÉCIMA SEGUNDA: ", fontBoldConteudo));
		p16.add(new Chunk("O locatário é o principal pagador responsável por todos os pagamentos descritos nesse contrato até a efetiva entrega da chave ao locador e o termo da vistoria do imóvel.", fontConteudo));
		p16.add("\n\n");

		Paragraph p17 = new Paragraph();
		p17.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p17.add(new Chunk("CLÁUSULA DÉCIMA TERCEIRA: ", fontBoldConteudo));
		p17.add(new Chunk("O locador tem o direito de vistoriar seus inquilinos sempre que achar conveniente para assegurar o cumprimento das obrigações assumidas neste contrato.", fontConteudo));
		p17.add("\n\n");

		Paragraph p18 = new Paragraph();
		p18.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p18.add(new Chunk("CLÁUSULA DÉCIMA QUARTA: ", fontBoldConteudo));
		p18.add(new Chunk("A infração de qualquer das cláusulas do presente contrato, sujeita o infrator a multa 02 vezes ao valor do aluguel tornando por base o ultimo aluguel vencido.", fontConteudo));
		p18.add("\n\n");

		Paragraph p19 = new Paragraph();
		p19.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p19.add(new Chunk("E, por assim estarem justos e contratados, mandaram extrair o presente instrumento em duas(02) vias, para que seja confirmado a aceitação de todos os termos mencionados neste contrato, serão assinados no indicador de locador e locatário.", fontConteudo));
		p19.add("\n\n");

		Paragraph p20 = new Paragraph();
		p20.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p20.add(new Chunk("Itapevi, "+dataAssinatura, fontConteudo));
		p20.add("\n\n\n\n\n");

		Paragraph pUnderline = new Paragraph();
		pUnderline.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		pUnderline.add(new Chunk("___________________________", fontConteudo));
		//pUnderline.add("\n\n");

		Paragraph p22 = new Paragraph();
		p22.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p22.add(new Chunk("LOCADOR", fontConteudo));
		p22.add("\n\n\n\n\n");

		Paragraph p23 = new Paragraph();
		p23.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p23.add(new Chunk("LOCATÁRIO", fontConteudo));

		
		document.add(p1);		
		document.add(p2);
		document.add(p3);
		document.add(p4);
		document.add(p5);
		document.add(p6);
		document.add(p7);
		document.add(p8);
		document.add(p9);
		document.add(p10);
		document.add(p11);
		document.add(p12);
		document.add(p13);
		document.add(p14);
		document.add(p15);
		document.add(p16);
		document.add(p17);
		document.add(p18);
		document.add(p19);
		document.add(p20);
		document.add(pUnderline);
		document.add(p22);
		document.add(pUnderline);
		document.add(p23);
		
		document.close();
		System.out.println("gerou!");
		
	}
	
}
