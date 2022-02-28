import java.io.BufferedReader;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;


public class lector {
	public void Escribir(String texto) {
		File f;
		FileWriter w;
		BufferedWriter bw;
		PrintWriter wr;
		
		try {
		f=new File("HT3");
		w=new FileWriter(f);
		bw= new BufferedWriter(w);
		wr= new PrintWriter(bw);
		
		wr.write(texto);
		
		wr.close();
		bw.close();
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "ocurrio un error");
		}
		
		
	}
	/**
	 * metodo para leer el archivoo
	 * @param direccion la direccion donde se encuentra el archivo con la operacion
	 * @return String con el resultado o eltexto del documento
	 */
	 public String Leer(String direccion){ //direccion del archivo
	        
	        String texto = "";
	        
	        try{
	            BufferedReader bf = new BufferedReader(new FileReader(direccion));
	            String temp = "";
	            String bfRead;
	            while((bfRead = bf.readLine()) != null){ 
	                //haz el ciclo, mientras bfRead tiene datos
	                temp = temp + bfRead; //guardado el texto del archivo
	            }
	            
	            texto = temp;
	            
	        }catch(Exception e){ 
	            System.err.println("No se encontro archivo");
	        }
	        
	        return texto;
	        
	    }
	    
	}

