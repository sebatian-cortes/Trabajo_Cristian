import javax.swing.JOptionPane;

public class Constructor_T {
	
	public Constructor_T() {
		
		Procesos miproceso = new Procesos();
		Segundos_Procesos miDos=new  Segundos_Procesos();
		 Object desicion;
		 String renombrar;
		 
		 do {
		 desicion = JOptionPane.showInputDialog(null,"Desea.. ","Plan de trabajo",JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Seleccione","Bloque-A","Bloque-B","Salir"},"Seleccione");
		 renombrar=String.valueOf(desicion);
		 switch (renombrar) {
		case "Bloque-A":
			miproceso.inicar();
			break;
		case "Bloque-B":
			miDos.iniciarDos();
			break;
		case "Salir":
			JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
			break;
		default:
			break;
		}
			} while (renombrar!="Salir");
		 
	}
}
