package util;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class LeitorPDF{
  private PDDocument document = null;
  private String fileName;

  public LeitorPDF(File pdfFile) throws IOException{
        document = PDDocument.load(pdfFile);//carrega o arquivo PDF
        fileName = pdfFile.getName();        
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