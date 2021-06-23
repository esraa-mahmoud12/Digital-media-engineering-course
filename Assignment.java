package assignment1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
@SuppressWarnings("unused")

public class TestImageManipulation {

	public static BufferedImage myReadImage (String filepath) throws IOException
{
BufferedImage originalImage = null;
try{
originalImage = ImageIO.read(new File(filepath));
System.out.println("Image Height:" + originalImage.getHeight() );
System.out.println("Image Width:" + originalImage.getWidth() );
BufferedImage newImage = new
BufferedImage(originalImage.getHeight(),originalImage.getWidth(),originalImage.getType());

newImage.setData(originalImage.getRaster());
}catch (IOException e){
System.out.println(e.getMessage());
}
return originalImage;
}
	public static  ArrayList<Image> video (){
	 ArrayList<Image> array = new ArrayList<Image>();
	 File OriginalImage = new File ("C:/Users/Esraamahmoud/Desktop/cs cods/assignment1/image.jpg");
	 BufferedImage img = ImageIO.read(OriginalImage);
	 BufferedImage grayscaleImage = new BufferedImage(img.getWidth(),img.getHeight(),BufferedImage.TYPE_INT_ARGB);
	 for(int i = 0 ; i < 5 ; i++){
	 array.add(img);
	
	}
	 return array ;
	}
	
	

	    /*public void init() {

	       Image[] clubs = new Image[13];
	       for (int i = 0; i < clubs.length; i++ ) {
	            clubs[i] = getImage( getDocumentBase(), "c" + (i + 1) + ".gif");
	        }*/
	        
	    
	
	
	
	
	
	public static BufferedImage myDownSampling (BufferedImage img) throws IOException
	{
	BufferedImage result_img = new
	BufferedImage(img.getHeight(),img.getWidth(),img.getType());
	result_img.setData(img.getRaster());
	for (int i = 0; i<img.getWidth(); i+=2)
	for (int j = 0; j<img.getHeight(); j+=2)
	img.setRGB(i, j, 0);
	return img;
	}
	public static void printImage(BufferedImage img){
	JFrame frame=new JFrame();
	frame.setLayout(new FlowLayout());
	frame.setSize(img.getWidth(),img.getHeight());
	JLabel lbl=new JLabel("Output Image");
	frame.getContentPane().add(new JLabel(new ImageIcon(img)));
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
      ArrayList<Image> c = video();
		
		
	String input_file = "D:/tutor2/tut2/Desert.jpg";
	String output_file = "D:/tutor2/tut2/Desert2.jpg";
	BufferedImage read_img = null;
	BufferedImage undersampled_img = null;
	try {
	 //originalImage = ImageIO.read(new File(inFilePath));
	 //System.out.println("Image Height:" + originalImage.getHeight() );
	 //System.out.println("Image Width:" + originalImage.getWidth() );
	 //BufferedImage newImage = newBufferedImage(originalImage.getHeight(),originalImage.getWidth(),originalImage.getType());

	
	// newImage.setData(originalImage.getRaster());
	read_img = myReadImage(input_file);
	undersampled_img = myDownSampling(read_img);
	printImage(undersampled_img);
	//Write new file
	ImageIO.write(undersampled_img, "png", new File(output_file));
	} catch (IOException e) {
	System.out.println(e.getMessage());
	}
	}
	}
