package main;

import java.io.File;
import java.io.IOException;

import util.LeitorPDF;

import java.util.Scanner;
import java.util.logging.Logger;

public class Executor {

		
	public static void main(String[] args) throws IOException {
		File arquivo;
		String filePath,conteudo="";
		String busca;
		Scanner sc = new Scanner(System.in);
		filePath = "C:\\Users\\03777454133\\Downloads\\RelatorioIRA.pdf";
		//filePath = "C:\\Users\\03777454133\\Downloads\\main.pdf";
		LeitorPDF leitorPDF = null;
		arquivo = new File(filePath);
		System.out.println("Arquivo: "+arquivo.getPath());
		try{
			leitorPDF = new LeitorPDF(arquivo);
			System.out.println("Arquivo PDF aberto com sucesso! \nConteudo do arquivo PDF: ");
			System.out.println(conteudo = leitorPDF.getConteudoPDF());
			
			
			System.out.println("Digite o termo a ser buscado: ");
			busca = sc.nextLine();
			if(leitorPDF.buscaTermoConteudoPDF(conteudo,busca)){
				System.out.println("O termo "+busca+" foi encontrado!");
			}
			else{
				System.out.println("A pesquisa não retornou resultado.");
			}
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
