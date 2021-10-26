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

public class Contrato {

	private String nomeDoArquivo;
	private String comodosDaCasa;
	private String logradouro;
	private String nomeRgCpfDoCasal;
	private String dataInicioLocacao;
	private String dataTerminoLocacao;
	private String diaPagamento;
	private String valorAluguel;
	private boolean isDepositoPago;
	private String logradouroAgua;
	private String numeroInstalacaoAgua;
	private String logradouroLuz;
	private String numeroInstalacaoLuz;
	private String dataAssinatura;

	public Contrato nomeDoArquivo(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
		return this;
	}
	public Contrato comodosDaCasa(String comodosDaCasa) {
		this.comodosDaCasa = comodosDaCasa;
		return this;
	}
	public Contrato logradouro(String logradouro) {
		this.logradouro = logradouro;
		return this;
	}
	public Contrato nomeRgCpfDoCasal(String nomeRgCpfDoCasal) {
		this.nomeRgCpfDoCasal = nomeRgCpfDoCasal;
		return this;
	}
	public Contrato dataInicioLocacao(String dataInicioLocacao) {
		this.dataInicioLocacao = dataInicioLocacao;
		return this;
	}
	public Contrato dataTerminoLocacao(String dataTerminoLocacao) {
		this.dataTerminoLocacao = dataTerminoLocacao;
		return this;
	}
	public Contrato diaPagamento(String diaPagamento) {
		this.diaPagamento = diaPagamento;
		return this;
	}
	public Contrato valorAluguel(String valorAluguel) {
		this.valorAluguel = valorAluguel;
		return this;
	}
	public Contrato depositoPago(boolean depositoPago) {
		this.isDepositoPago = depositoPago;
		return this;
	}
	public Contrato logradouroAgua(String logradouroAgua) {
		this.logradouroAgua = logradouroAgua;
		return this;
	}
	public Contrato numeroInstalacaoAgua(String numeroInstalacaoAgua) {
		this.numeroInstalacaoAgua = numeroInstalacaoAgua;
		return this;
	}
	public Contrato logradouroLuz(String logradouroLuz) {
		this.logradouroLuz = logradouroLuz;
		return this;
	}
	public Contrato numeroInstalacaoLuz(String numeroInstalacaoLuz) {
		this.numeroInstalacaoLuz = numeroInstalacaoLuz;
		return this;
	}
	public Contrato dataAssinatura(String dataAssinatura) {
		this.dataAssinatura = dataAssinatura;
		return this;
	}
	
	public void gera() throws FileNotFoundException, DocumentException {
		
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(this.nomeDoArquivo+".pdf"));
		document.open();
		
		Font fontBoldTitulo = FontFactory.getFont(FontFactory.COURIER_BOLD, 16, BaseColor.BLACK);
		Font fontBoldConteudo = FontFactory.getFont(FontFactory.COURIER_BOLD, 12, BaseColor.BLACK);
		Font fontConteudo = FontFactory.getFont(FontFactory.COURIER, 12, BaseColor.BLACK);
		
	
		Paragraph p1 = new Paragraph();
		p1.setAlignment(Paragraph.ALIGN_CENTER);
		p1.add(new Chunk("CONTRATO DE LOCA��O RESIDENCIAL", fontBoldTitulo));
		p1.add("\n\n");
		
		Paragraph p2 = new Paragraph();
		p2.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p2.add(new Chunk("IM�VEL CONTRATADO: ", fontBoldConteudo));
		p2.add(new Chunk("Uma casa com "+this.comodosDaCasa+", situado na "+this.logradouro+", Parque Boa Esperan�a, 06653-590, Itapevi SP.", fontConteudo));
		p2.add("\n\n");
		
		Paragraph p3 = new Paragraph();
		p3.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p3.add(new Chunk("LOCADOR: ", fontBoldConteudo));
		p3.add(new Chunk("Quit�ria Pereira Neves, Brasileira, Casada, portadora da c�dula de identidade RG 36.841.743-8 e CPF 882.476.434-72", fontConteudo));
		p3.add("\n\n");
	
		Paragraph p4 = new Paragraph();
		p4.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p4.add(new Chunk("LOCAT�RIO: ", fontBoldConteudo));
		p4.add(new Chunk(this.nomeRgCpfDoCasal, fontConteudo));
		p4.add("\n\n");
	
		Paragraph p5 = new Paragraph();
		p5.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p5.add(new Chunk("CL�USULA PRIMEIRA: ", fontBoldConteudo));
		p5.add(new Chunk("O Prazo da loca��o � de 24 meses, iniciando em "+this.dataInicioLocacao+", com t�rmino em "+this.dataTerminoLocacao+", independentemente de aviso ou interpela��o judicial ou mesmo extrajudicial.", fontConteudo));
		p5.add("\n\n");
	
		Paragraph p6 = new Paragraph();
		p6.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p6.add(new Chunk("CL�USULA SEGUNDA: ", fontBoldConteudo));
		p6.add(new Chunk("O aluguel mensal dever� ser pago todo dia "+this.diaPagamento+" e seu valor � de "+this.valorAluguel+" mensais reajustados anualmente em conformidade com a varia��o IGP-M. Sendo que no primeiro m�s de aluguel o locat�rio dever� efetuar um dep�sito de um m�s de aluguel antecipado.", fontConteudo));
		if(!this.isDepositoPago) {
			p6.add("\n");
			p6.add(new Chunk("�	Observa��o: o locat�rio n�o efetuou o pagamento do dep�sito.", fontConteudo));
		}
		p6.add("\n\n");

		Paragraph p7 = new Paragraph();
		p7.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p7.add(new Chunk("CL�USULA TERCEIRA: ", fontBoldConteudo));
		p7.add(new Chunk("O locat�rio ser� respons�vel por todos os incidentes que venham a ocorrer com o im�vel que foi alugado a partir de sua data de loca��o.", fontConteudo));
		p7.add("\n\n");

		Paragraph p8 = new Paragraph();
		p8.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p8.add(new Chunk("CL�USULA QUARTA: ", fontBoldConteudo));
		p8.add(new Chunk("O locat�rio ser� respons�vel por todas as despesas provenientes de sua utiliza��o sejam elas: liga��o ou consumo de luz, �gua e g�s que ser�o pagas diretamente para as empresas fornecedoras dos referidos servi�os.", fontConteudo));
		
		if(this.logradouroAgua != null) {
			p8.add("\n");
			p8.add(new Chunk("�	Observa��o: o endere�o da �gua fica situado na "+this.logradouroAgua+", com a instala��o numero "+this.numeroInstalacaoAgua+".", fontConteudo));
		}
		if(this.logradouroLuz != null) {
			p8.add("\n");
			p8.add(new Chunk("�	Observa��o: o endere�o da luz  fica situado na "+this.logradouroLuz+", com a instala��o numero "+this.numeroInstalacaoLuz+".", fontConteudo));			
		}
		p8.add("\n\n");

		Paragraph p9 = new Paragraph();
		p9.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p9.add(new Chunk("CL�USULA QUINTA: ", fontBoldConteudo));
		p9.add(new Chunk("Em caso de atraso no pagamento do aluguel, ser� aplicado uma multa de 2% (dois por centro) do montante devido.", fontConteudo));
		p9.add("\n\n");

		Paragraph p10 = new Paragraph();
		p10.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p10.add(new Chunk("CL�USULA SEXTA: ", fontBoldConteudo));
		p10.add(new Chunk("Fica ao locat�rio a responsabilidade em zelar pela conserva��o e limpeza do im�vel, efetuando as reformas necess�rias para sua manuten��o sendo que todos os gastos e pagamentos ocorrer�o por conta do mesmo.", fontConteudo));
		p10.add("\n\n");

		Paragraph p11 = new Paragraph();
		p11.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p11.add(new Chunk("CL�USULA S�TIMA: ", fontBoldConteudo));
		p11.add(new Chunk("O locat�rio fica obrigado a devolver o im�vel em perfeita condi��o de limpeza e conserva��o inclusive da pintura das paredes quando o mesmo deixar o im�vel.", fontConteudo));
		p11.add("\n\n");

		Paragraph p12 = new Paragraph();
		p12.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p12.add(new Chunk("CL�USULA OITAVA: ", fontBoldConteudo));
		p12.add(new Chunk("O locat�rio n�o poder� modificar a estrutura do im�vel alugado sem a pr�via autoriza��o por escrito do locador. No caso de realiza��o de alguma obra, estas ser�o incorporadas ao im�vel sem que tenha o locat�rio qualquer indeniza��o pelas obras realizadas. ", fontConteudo));
		p12.add("\n\n");

		Paragraph p13 = new Paragraph();
		p13.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p13.add(new Chunk("CL�USULA NONA: ", fontBoldConteudo));
		p13.add(new Chunk("O locat�rio declara receber o im�vel em perfeito estado de conserva��o e funcionamento observado isso no dia em que o im�vel foi alugado.", fontConteudo));
		p13.add("\n\n");

		Paragraph p14 = new Paragraph();
		p14.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p14.add(new Chunk("CL�USULA D�CIMA: ", fontBoldConteudo));
		p14.add(new Chunk("O locat�rio declara que o im�vel alugado, ser� exclusivamente para uso residencial e de sua fam�lia.", fontConteudo));
		p14.add("\n\n");

		Paragraph p15 = new Paragraph();
		p15.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p15.add(new Chunk("CL�USULA D�CIMA PRIMEIRA: ", fontBoldConteudo));
		p15.add(new Chunk("O locat�rio n�o poder� em hip�tese alguma sublocar, transferir ou ceder o im�vel para terceiros, sem o consentimento pr�vio e por escrito do locador.", fontConteudo));
		p15.add("\n\n");

		Paragraph p16 = new Paragraph();
		p16.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p16.add(new Chunk("CL�USULA D�CIMA SEGUNDA: ", fontBoldConteudo));
		p16.add(new Chunk("O locat�rio � o principal pagador respons�vel por todos os pagamentos descritos nesse contrato at� a efetiva entrega da chave ao locador e o termo da vistoria do im�vel.", fontConteudo));
		p16.add("\n\n");

		Paragraph p17 = new Paragraph();
		p17.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p17.add(new Chunk("CL�USULA D�CIMA TERCEIRA: ", fontBoldConteudo));
		p17.add(new Chunk("O locador tem o direito de vistoriar seus inquilinos sempre que achar conveniente para assegurar o cumprimento das obriga��es assumidas neste contrato.", fontConteudo));
		p17.add("\n\n");

		Paragraph p18 = new Paragraph();
		p18.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p18.add(new Chunk("CL�USULA D�CIMA QUARTA: ", fontBoldConteudo));
		p18.add(new Chunk("A infra��o de qualquer das cl�usulas do presente contrato, sujeita o infrator a multa 02 vezes ao valor do aluguel tornando por base o ultimo aluguel vencido.", fontConteudo));
		p18.add("\n\n");

		Paragraph p19 = new Paragraph();
		p19.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p19.add(new Chunk("E, por assim estarem justos e contratados, mandaram extrair o presente instrumento em duas(02) vias, para que seja confirmado a aceita��o de todos os termos mencionados neste contrato, ser�o assinados no indicador de locador e locat�rio.", fontConteudo));
		p19.add("\n\n");

		Paragraph p20 = new Paragraph();
		p20.setAlignment(Paragraph.ALIGN_JUSTIFIED);
		p20.add(new Chunk("Itapevi, "+this.dataAssinatura, fontConteudo));
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
		p23.add(new Chunk("LOCAT�RIO", fontConteudo));

		
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
	}

}
