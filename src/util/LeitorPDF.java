package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class LeitorPDF{
	private PDDocument document = null;
	private String fileName;

	public LeitorPDF(File pdfFile) throws IOException{
		document = PDDocument.load(pdfFile);//carrega o arquivo PDF
		fileName = pdfFile.getName();        
	}

	public String getConteudoPDF() throws IOException{
		PDFTextStripper stripper = new PDFTextStripper();
		stripper.setLineSeparator("\n");
		stripper.setStartPage(1);
		stripper.setEndPage(document.getNumberOfPages());
		//stripper.setEndPage(document.getNumberOfPages());
		return stripper.getText(document);

	}

	public Boolean buscaTermoConteudoPDF(String conteudoPDF, String busca){				
		if(conteudoPDF.contains(busca)){
			return true;
		}		
		return false;		
	}
	
	public Boolean buscaTermoConteudoPDF(File arquivoPDF, String busca){
		
		
		return false;
	}

	public PDDocument getDocument() {
		return document;
	}

	public void setDocument(PDDocument document) {
		this.document = document;
	}

	public String getFileName(){
		return fileName;
	}

	public void setFileName(String fileName){
		this.fileName = fileName;
	}
  
  

}