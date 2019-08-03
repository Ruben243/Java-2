package EjemploMenu;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaMenu extends JFrame implements ActionListener {
	
	private JLabel num1,num2,resul;
    private JTextField Tnum1,Tnum2,Tres;
    private JMenuBar bMenu;
    private JMenu mOperaciones,mSalir;
    private JMenuItem smSumar,smrestar,smMultiplicar,smDividir,smCerrar,smPotencia;

	
	
	
	public VentanaMenu() throws HeadlessException {
		super("calculadora");
		//creo label
		num1=new JLabel("Numero 1");
		num2=new JLabel("Numero 2");
		resul=new JLabel("Resultado");
	
		//crear menu
		bMenu=new JMenuBar();
		mOperaciones=new JMenu("Operaciones");
		mOperaciones.setMnemonic('o');
		mSalir=new JMenu("Salir");
		mSalir.setMnemonic('s');

		//creo las cajas de texto
		Tnum1=new JTextField(15);
		Tnum2=new JTextField(15);
		Tres=new JTextField(15);
		Tres.setEditable(false);
		
		//creamos submenu
		smSumar=new JMenuItem("Sumar",'s');
		smrestar=new JMenuItem("Restar",'r');
		smMultiplicar=new JMenuItem("Multiplicacion",'m');
		smDividir=new JMenuItem("Division",'d');
		smCerrar=new JMenuItem("Cerrar",'c');
		smPotencia=new JMenuItem("Potencia",'p');
	   
		bMenu.add(mOperaciones);
	    add(num1);
		add(Tnum1);
		add(num2);
		add(Tnum2);
		add(resul);
		add(Tres);
		mOperaciones.add(smSumar);
		mOperaciones.add(smrestar);
		mOperaciones.add(smMultiplicar);
		mOperaciones.add(smDividir);
		mOperaciones.add(smPotencia);
		mSalir.add(smCerrar);
		bMenu.add(mSalir);
		
		
		
		smSumar.addActionListener(this);
		smrestar.addActionListener(this);
		smMultiplicar.addActionListener(this);
		smDividir.addActionListener(this);
		smCerrar.addActionListener(this);
		smPotencia.addActionListener(this);
		
		 getContentPane().setLayout(new GridLayout(3,2));
		 this.setJMenuBar(bMenu);
		
		
		this.setSize(300,180);
		this.setVisible(true);
		
		
		
		
	}















	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String eventoComando =e.getActionCommand();
		
		if(e.getSource() instanceof JButton){
			
			
			
			
		}else if(e.getSource()instanceof JMenuItem){
			if(eventoComando.equals("Sumar")){
				calcular("+");
				
				
			}else if(eventoComando.equals("Restar")){
				calcular("-");
				
				
			}else if(eventoComando.equals("Multiplicacion")){
				calcular("*");
				
				
			}else if(eventoComando.equals("Division")){
				calcular("/");
				
				
			}else if(eventoComando.equals("Cerrar")){
				System.exit(0);
				
				
			}else if(eventoComando.equals("Potencia")){
			     
				calcular("**");
				
			}
			
			
			
		}
		
		
		
		
	}
	
	
	public void calcular(String operador){
		int dato1=(Integer.parseInt(Tnum1.getText().toString()));
		int dato2=(Integer.parseInt(Tnum2.getText().toString()));
		int resultado=0;
		
		switch(operador){
		
			case "+":  resultado=dato1+dato2;
			          break;
			          
			          
			case "-": resultado=dato1-dato2;
	                   break;
			
			case "*": resultado=dato1*dato2;
	                  break;
			
			case "/": resultado=dato1/dato2;
	                  break;
	                       
			case "**": resultado=(int) Math.pow(dato1,dato2);
			           break;
		
		}
		
		Tres.setText(""+resultado);
		
	}
	
	
	

}
