package main;

import java.io.File;
import java.io.IOException;

import util.LeitorPDF;
import java.util.logging.Logger;

public class Executor {

	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Olá mundo");
		File arquivo;
		String filePath;
		//filePath = "C:\\Users\\03777454133\\Downloads\\RelatorioIRA.pdf";
		filePath = "C:\\Users\\03777454133\\Downloads\\main.pdf";
		LeitorPDF leitorPDF = null;
		arquivo = new File(filePath);
		System.out.println("Arquivo: "+arquivo.getPath());
		try{
			leitorPDF = new LeitorPDF(arquivo);
			System.out.println("Arquivo PDF aberto com sucesso! \nConteudo do arquivo PDF: ");
			System.out.println(leitorPDF.getConteudoPDF());
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			leitorPDF.getDocument().close();
			System.out.println("Finalização do programa.");
		}
		
	}

}
