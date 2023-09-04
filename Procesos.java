import javax.swing.JOptionPane;

public class Procesos {
	Object taller;
	String tallerDos,resp;
	
	public void inicar() {
		do {
			 taller =JOptionPane.showInputDialog(null,"Ejercicios Practicos","TALLER #1", JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Seleccione un numero","1","2","3","4","5","Salir"},"Seleccione un numero");
			 tallerDos=String.valueOf(taller);
			 
		switch (tallerDos) {
		
		case "1":
			numeroUno();
			break;
			
		case "2":
			Integer nu=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
			numeroDos(nu);
			break;
			
		case "3":
			System.out.println("El numero es: "+ numeroTres());
			break;
			
		case "4":
			Integer cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
			System.out.println("El numero mayor es: "+numeroCuatro(cant));
			break;
			
		case "5":
			Integer tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo 1 y 2"));
			System.out.println( numeroCinco(tam));
			break;
			
		case "Salir":
			break;
			
		default:
			break;
			
		}
		} while (tallerDos!="Salir");
	}

	private Integer numeroCinco(Integer tam) {
		int array[]=new int [tam];
		int array2[]=new int [tam];
		int acumuladora=0;
		for (int i = 0; i < tam; i++) {
			array[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "+(i+1)+" del primer arreglo"));
			array2[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "+(i+1)+" del segundo arreglo"));
			for (int j = 0; j < tam; j++) {
				acumuladora=array[i]+array2[i];
			}
			System.out.println( "La suma del arreglo "+i+" es: "+acumuladora);
		}
		
		return null;
	}

	private Integer numeroCuatro(Integer cant) {
		Integer arreglo[]=new Integer [cant];
		for (int i = 0; i < cant; i++) {
			arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)));
		}
		Integer numeroM=arreglo[0];
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i]>numeroM) {
				numeroM=arreglo[i];
			}
		}
		return numeroM;
	}

	private int numeroTres() {
		int n = (int) (Math.random() * (1 - 100)) + 100;
		return n;
	}

	private void numeroDos(Integer nu) {
		if (nu>10) 
			JOptionPane.showMessageDialog(null, "El numero "+nu+" es mayor a 10","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "El numero "+nu+" es menor a 10","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
	}

	private void numeroUno() {
		System.out.println("Ingreso de nombre");
		System.out.println(JOptionPane.showInputDialog("Ingrese su nombre Completo"));
	}
}
