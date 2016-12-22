package downloader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader {

	public static void main(String[] args) {
        try{
			File file;
			String uri;
			uri = "http://diariooficial.to.gov.br/sistema/diario/3214/download";
			URL url = new URL(uri);
			//file = new File("google.gif");
			file = new File("diario.pdf");
			OutputStream out = new FileOutputStream(file, false);
			//uri = "http://www.google.com.br/intl/pt-BR_br/images/logo.gif";
			URLConnection conn = url.openConnection();
			InputStream in = conn.getInputStream();
			int i=0;
			while ((i = in.read()) != -1){
				out.write(i);
		}
		in.close();
		out.close();
		System.out.println("Gravação efetuada com sucesso");
		}
		catch (FileNotFoundException e){
			System.out.println("Arquivo não encontrado. Causa: " + e.getMessage());
		}
		catch (MalformedURLException e){
			System.out.println("Erro na formação da URL. Causa: " + e.getMessage()); 
		}
		catch (IOException e){
			System.out.println("Erro de entrada/saida de dados. Causa: " + e.getMessage());
		}	
	}
	
}
