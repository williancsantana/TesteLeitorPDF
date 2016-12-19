package util;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PedroLima
 */
public class PDF_FILES  implements Serializable{
    private List<File> files;
    private int index;
    private int size;
    private String outputFolder;
    
    public PDF_FILES(){
        this.files = new ArrayList<>();
        this.index =0;
        this.size = files.size();
        this.outputFolder = "Arquivos Modificados";
    }
    
    public void recursiveSearch(File file){
        if(file.isDirectory()){
           if(file.listFiles()!=null)
                for(File singleFile: file.listFiles())
                    recursiveSearch(singleFile);
        }
        if(file.getName().contains(".pdf") || file.getName().contains(".PDF"))
            files.add(file);
        this.size = files.size();
    }

    public List<File> getFiles() {
        return files;
    }

    public String getOutputFolder() {
        return outputFolder;
    }

    public void setOutputFolder(String outputFolder) {
        this.outputFolder = outputFolder;
    }
    

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String returnFilePath(File file) {
        return file.getPath().replace(file.getName(), "");
    }
    
    
    
}