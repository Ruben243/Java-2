package baseDatos;

import java.awt.FlowLayout;
import java.awt.Font;
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

public class MenuAsata  extends JFrame implements ActionListener{

	  private JLabel h3;
	  private JMenuBar bMenu;
	  private JMenu mOperaciones,mSalir;
	  private JMenuItem smInsertar,smBuscarProfe,smBuscarCod,smBorrar,smCerrar;
	  
	  
	public MenuAsata() throws HeadlessException {
		super("Ventana Menu");
		h3=new JLabel("BASES DE DATOS ASATA");
		h3.setFont(new Font("Verdana",Font.BOLD,20));
		smInsertar=new JMenuItem("INSERTAR");
		smBuscarProfe=new JMenuItem("BUSCAR PROFESION");
		smBuscarCod=new JMenuItem("BUSCAR CODIGO");
		smBorrar=new JMenuItem("BORRAR-CODIGO");
		smCerrar=new JMenuItem("Cerrar");
		bMenu=new JMenuBar();
		mOperaciones=new JMenu("Operaciones");
		mOperaciones.setMnemonic('o');
		mSalir=new JMenu("Salir");
		mSalir.setMnemonic('s');
		  
		mOperaciones.add(smInsertar);
		mOperaciones.add(smBuscarCod);
		mOperaciones.add(smBuscarProfe);
		mOperaciones.add(smBorrar);
		mSalir.add(smCerrar);
		
		bMenu.add(mOperaciones);
		bMenu.add(mSalir);
		
		this.getContentPane().setLayout(new FlowLayout());
		this.setJMenuBar(bMenu);
		this.add(h3);
		
		smInsertar.addActionListener(this);
		smBuscarProfe.addActionListener(this);
		smBuscarCod.addActionListener(this);
		smBorrar.addActionListener(this);
		smCerrar.addActionListener(this);
		
		
		
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	String eventoComando =e.getActionCommand();
		
		if(e.getSource() instanceof JButton){
			
			
			
			
		}else if(e.getSource()instanceof JMenuItem){
			if(eventoComando.equals("INSERTAR")){
				VentanaInsertar v2=new VentanaInsertar();
				
				
			}else if(eventoComando.equals("BUSCAR PROFESION")){
				this.setVisible(false);
				VentanabuscarPro v4=new VentanabuscarPro(this);
				
			}else if(eventoComando.equals("BUSCAR CODIGO")){
				VentanaBuscarCodigo v3=new VentanaBuscarCodigo();
				
				
			}else if(eventoComando.equals("BORRAR-CODIGO")){
			
				
			}else if(eventoComando.equals("Cerrar")){
				System.exit(0);
				
				
			}
			
			
		}
		
		
		
		
	}
	
	
		
		
	}
	  
	  
	
	
	
	
