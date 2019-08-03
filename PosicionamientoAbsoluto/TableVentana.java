package PosicionamientoAbsoluto;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class TableVentana extends JFrame implements ActionListener {
   private JTable regis;
   private JButton cerrar;
   private JScrollPane barra;


   
   
   
   
   
public TableVentana(JTable r) throws HeadlessException {
	super("Resultados");
	  regis=r;
	  cerrar=new JButton("CERRAR");
	  
	  this.getContentPane().setLayout(null);
	  this.setBounds(250,280,700,800);
	  
	  cerrar.setBounds(50,8,100,27);
	  regis.setBounds(50,50,500,500);
	  cerrar.addActionListener(this);
	  
	  
	  this.add(cerrar);
      barra=new JScrollPane(regis);
	  barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	  barra.setBounds(50,50,500,500);
	  add(barra);
	  
	  setVisible(true);
	  
}







@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	this.dispose();
	
	
}
  
	
	
	
	
}
