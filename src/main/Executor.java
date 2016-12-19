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
		LeitorPDF leitorPDF;
		arquivo = new File("C:\\Users\\03777454133\\Downloads\\main.pdf");
		System.out.println("Arquivo: "+arquivo.getPath());
		try{
			leitorPDF = new LeitorPDF(arquivo);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			System.out.println("Finalização do programa.");
		}
		
	}

}
