package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class LeitorPDF{
  private PDDocument document = null;
  private String fileName;

  public LeitorPDF(File pdfFile) throws IOException{
//	  	FileInputStream fileInputStream = new FileInputStream(pdfFile);
//	  	PDFParser parser = new PDFParser(fileInputStream);
//	  	parser.parse();
//        document = parser.getPDDocument();
	  	document = PDDocument.load(pdfFile);//carrega o arquivo PDF
        fileName = pdfFile.getName();        
    }
  
  public String getConteudoPDF() throws IOException{
	  String conteudo = "";
	  PDFTextStripper stripper = new PDFTextStripper();
	  stripper.setLineSeparator("\n");
	  stripper.setStartPage(1);
	  stripper.setEndPage(document.getNumberOfPages());
	  //stripper.setEndPage(document.getNumberOfPages());
	  //conteudo = stripper.getText(document);
	  return stripper.getText(document);
	  
	  //return conteudo;
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