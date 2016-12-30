import java.awt.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.*;
public class DosyaOkuyucu extends JFrame {	
	public static String uzanti;
	
	public DosyaOkuyucu()
	  {
	    setLocation(300,200);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    JTextArea ta = new JTextArea(20,40);
	    getContentPane().add(new JScrollPane(ta));
	    pack();
	    try{ta.read(new FileReader(uzanti),null);}catch(IOException ioe){}
	  }
	
	public static void main(String[] args) {
		
		 JFileChooser chooser = new JFileChooser();

		    int returnVal = chooser.showOpenDialog(null);
		   if(returnVal == JFileChooser.APPROVE_OPTION) {
		       uzanti=chooser.getSelectedFile().getAbsolutePath().toString();
		    }
		
		
		new DosyaOkuyucu().setVisible(true);
	}

}
