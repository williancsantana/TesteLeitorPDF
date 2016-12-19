package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PedroLima
 */
public class ManipuladorArquivo {

    public static PDF_FILES readTemporaryFile(String fileName) {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(new File(fileName)));
            PDF_FILES files = (PDF_FILES) in.readObject();
            in.close();
            return files;
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                System.out.println("Erro: " + ex.getMessage());
            }
        }
        
        return null;
    }

    public static boolean generateTemporaryFile(String fileName, PDF_FILES pdfFiles) {
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(pdfFiles);
            oos.close();
            return true;

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        return false;
    }

}
