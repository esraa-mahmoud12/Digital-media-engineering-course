package assignment1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
	
	private String path;
	int numberOfLines;
	
	public ReadFile(String file_path){ //constructor
	path=file_path;
	}
	
	public String[] OpenFile() throws IOException{ 
		FileReader fr = new FileReader(path); 
		BufferedReader textReader = new BufferedReader(fr);
		numberOfLines = readLines();
		String[] textData = new String[numberOfLines];
		int i;
		for(i=0;i<numberOfLines;i++){
		textData[i] = textReader.readLine();
		}
		textReader.close();
		return textData;
		}
	
	int readLines() throws IOException{
		FileReader file_to_read = new FileReader(path);
		BufferedReader bf = new BufferedReader(file_to_read);
		
		@SuppressWarnings("unused")
		
		String aLine;
		numberOfLines = 0;
		while((aLine = bf.readLine()) != null){
		numberOfLines++;
		}
		bf.close();	
		return numberOfLines;}
	
	 /*public static int CountWords (String[] v){
	     int count = 0 ;
	     int noOfLines =  file.readLines();
		 ReadFile file = new ReadFile(file_name);
	     String[] aryLines = file.OpenFile();
		   for(int i = 0 ; i < noOfLines ; i++){
			   
	      
	      
	      
	      
	      return count ;
		    }
		 
		}}*/
	
	//to draw a histogram
	public static void histogram(String[] x){
		String[] array = new String[x.length];
		int j = 0 ;
		for(int k = 0 ; k < array.length ; k++ ){
			array[k] = " " ;
		}
		for( int i = 65 ; i <= 90 ; i++ ){
			char v = (char) i ;
			System.out.print(v);
			for( j = 0 ; j < x.length ; j++){
				for(int k = 0 ; k < x[j].length() ; k++){
				if (x[j].charAt(k) == v ){
					System.out.print( "*");
				}
				}
				
			}			
			
			System.out.println();
		}
			}
		
		
	

			
		
		
		
		
	

	
	public static void main(String[ ] args) throws IOException {
	 
	String file_name = "C:/Users/Esraamahmoud/Desktop/cs cods/assignment1/input.txt";
	FileWriter fileWriter =
	new FileWriter("C:/Users/Esraamahmoud/Desktop/cs cods/assignment1/input2.txt");
	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	

	
	
	
	
	
	try{
	ReadFile file = new ReadFile(file_name);
	String[] aryLines = file.OpenFile();
	
	
	
	String[] v = new String[aryLines.length];
	
	
	int count = 0 ;
	for(int k = 0 ; k < aryLines.length ; k++ ){
		v[k] = " " ;
	}	
	for(int i=0;i<aryLines.length;i++){
	  for(int j = 0 ; j < aryLines[i].length() ; j++){
		  char c =aryLines[i].charAt(j);
		 
		  if ( (int ) c >= 97 && (int) c <= 122){
	            c = (char) (((int)c-97)+65) ;
	        }   
		  if( (int ) c == 32){
			  count++;
		  }
		  v[i] += c ;
	  }
	 
		//String upper = aryLines[i].toUpperCase();
		//bufferedWriter.write(v);
		//bufferedWriter.newLine();
	  System.out.println(v[i]);
	}
	
		  count = count + aryLines.length;
	  
	 System.out.println(count);
	
	 histogram(v);
	bufferedWriter.close();

	} catch(IOException e){
	System.out.println(e.getMessage());
	}
	}
	}

	
