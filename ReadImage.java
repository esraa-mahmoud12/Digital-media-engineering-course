package assignment1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReadImage {
   public static void main(String[] args){
	 File OriginalImage = new File ("C:/Users/Esraamahmoud/Desktop/cs cods/assignment1/image.jpg");
	 BufferedImage img = null ;
	 try{
		 img = ImageIO.read(OriginalImage);
	     BufferedImage grayscaleImage = new BufferedImage(img.getWidth(),img.getHeight(),BufferedImage.TYPE_INT_ARGB);
	 	
	     JFrame frame=new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setSize(img.getWidth(),img.getHeight());
		@SuppressWarnings("unused")
		JLabel lbl=new JLabel("Output Image");
		frame.getContentPane().add(new JLabel(new ImageIcon(img)));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	     
	     
	     
	     
	    for(int i = 0 ; i < img.getWidth() ; i++){
	    	for(int j = 0 ; j < img.getHeight() ; j++){
	    		Color c = new Color(img.getRGB(i , j));
	    		int r = c.getRed();
	    		int g = c.getGreen();
	    		int b = c.getBlue();
	    		int a = c.getAlpha();
	    		int gr = ( r + g + b )/3 ;
	    		
	    		Color gColor = new Color(gr , gr , gr , a);
	    		grayscaleImage.setRGB( i , j , gColor.getRGB());
	    		
	    		
	    	}
	    }
	   // ImageIO.write(grayscaleImage ,"png" , new File("C:/Users/Esraamahmoud/Desktop/cs cods/assignment1/grayscale.jpg"));
	    

	    JFrame frame2=new JFrame();
		frame2.setLayout(new FlowLayout());
		frame2.setSize(img.getWidth(),img.getHeight());
		@SuppressWarnings("unused")
		JLabel lbl2=new JLabel("Output Image");
		frame2.getContentPane().add(new JLabel(new ImageIcon(grayscaleImage)));
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	     
	 
	 
	 
	 
	 
	 
	 
	 
	 }catch(IOException e){
		 e.printStackTrace();
	 }
	 
 }
}
 




