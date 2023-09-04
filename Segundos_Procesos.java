import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Segundos_Procesos {
	Object taller;
	String tallerDos,resp;
	
	public void iniciarDos() {
	do {
			 taller =JOptionPane.showInputDialog(null,"Ejercicios Practicos","TALLER #2", JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Seleccione Uno","1","2","3","4","5","6","7","8","Salir"},"Seleccione Uno");
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
			Integer cants=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
			System.out.println("El numero mayor es: "+numeroCinco(cants));
			break;
		case "6":
			Integer tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo 1 y 2"));
			System.out.println( numeroSeis(tam));
			break;
		case "7":
			String palabra=JOptionPane.showInputDialog("Ingrese la palabra la cual desea buscar");
			System.out.println(numeroSiete(palabra));
			break;
		case "8":
			Integer numo=Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes desea registrar"));
			System.out.println(numeroOcho(numo));
			break;
		case "Salir":
			break;
		default:
			break;
		}
		} while (tallerDos!="Salir");
	}

	private String numeroOcho(Integer numo) {
		String nombres,pedido,cadena="",todos;
		Float calificaciones;
		Integer cantidadNotas;
		ArrayList<String>estudiantes=new ArrayList<>();
		Map<String, List<Float>> notasDeTodos=new HashMap<>();
		List<Float> notasEstudiantes = null;
		for (int i = 0; i < numo; i++) {
			nombres=JOptionPane.showInputDialog("Ingrese el nombre del estudiante "+(i+1));
			cantidadNotas=Integer.parseInt(JOptionPane.showInputDialog("Cuantas notas son las del estudiante "+nombres));
			estudiantes.add(nombres);
			notasEstudiantes=new ArrayList<>();
			for (int j = 0; j < cantidadNotas; j++) {
				calificaciones=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota #"+(j+1)));
				notasEstudiantes.add(new Float(calificaciones) );
			}
			notasDeTodos.put(nombres, notasEstudiantes);
		}
		Object pedidos=JOptionPane.showInputDialog(null,"Desea ver las notas de algun estudiante","Anexo",JOptionPane.QUESTION_MESSAGE,null, new Object[] {"Seleccione","Si","No"},"Seleccione");
		pedido=String.valueOf(pedidos);
		switch (pedido) {
		
		case "Si":
			todos=JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
			if (notasDeTodos.containsKey(todos)) {
				cadena="El estudiante "+todos+" y sus notas son: "+notasDeTodos.get(todos);

			}else 
				JOptionPane.showMessageDialog(null, "El estudiante "+todos+" no esta registrado") ;
			break;
			
		case "No":
			JOptionPane.showMessageDialog(null, "Gracias");
			break;
			
		default:
			break;
			
		}
		return cadena;
	}

	private String numeroSiete(String palabra) {
		Hashtable<String, String> diccionario = new Hashtable<String, String>();
		
		String cadena="";
		String valor;

		
		diccionario.put("Apple", "Manzana");
		diccionario.put("Animal", "Animal");
		diccionario.put("Airplane", "Avión");
		diccionario.put("America" , "América");
		diccionario.put("Artist", "Artista");
		diccionario.put("Alligator", "Caimán");
		diccionario.put("Apartment", "Apartamento");
		diccionario.put("Alone", "Solo");
		diccionario.put("Answer", "Respuesta");
		diccionario.put("Ant", "Hormiga");

		
		diccionario.put("Baby", "Bebé");
		diccionario.put("Banana", "Plátano");
		diccionario.put("Book", "Libro");
		diccionario.put("Bicycle" , "Bicicleta");
		diccionario.put("Beach", "Playa");
		diccionario.put("Brother", "Hermano");
		diccionario.put("Beautiful", "Hermoso/a");
		diccionario.put("Bag", "Bolsa");
		diccionario.put("Breakfast", "Desayuno");
		diccionario.put("Butterfly", "Mariposa");

		
		diccionario.put("Cat", "Gato");
		diccionario.put("Car", "Coche");
		diccionario.put("Chocolate", "Chocolate");
		diccionario.put("Computer" , "Computadora");
		diccionario.put("Coffee", "Café");
		diccionario.put("City", "Ciudad");
		diccionario.put("Child", "Niño/a");
		diccionario.put("Camera", "Cámara");
		diccionario.put("Cloud", "Nube");
		diccionario.put("Cake", "Pastel");

		
		diccionario.put("Dog", "Perro");
		diccionario.put("Day", "Día");
		diccionario.put("Dance", "Bailar");
		diccionario.put("Dream" , "Sueño");
		diccionario.put("Diamond", "Diamante");
		diccionario.put("Duck", "Pato");
		diccionario.put("Delicious", "Delicioso/a");
		diccionario.put("Door", "Puerta");
		diccionario.put("Doctor", "Doctor/a");
		diccionario.put("Dark", "Oscuro/a");
		
		
		if (diccionario.containsKey(palabra)) {
			cadena+="Ingles: "+palabra+"\nEspañol: "+diccionario.get(palabra);
		}else 
			JOptionPane.showMessageDialog(null, "La palabra no exisite en el diccionario","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
		
		
			return cadena;
	}

	private Integer numeroSeis(Integer tam) {
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
	private Integer numeroCinco(Integer cants) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < cants; i++) {
			Integer arreglo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)));
			array.add(arreglo);
		}
		String sino=JOptionPane.showInputDialog(null, "Desea agregar un numero mas? \n Si= 1 \n No= 2");
		switch (sino) {
		case "1":
			Integer arreglo2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "));
			array.add(arreglo2);
			break;
		case "2":
			break;
		default:
			JOptionPane.showMessageDialog(null, "Dato ingresado invalido","ERROR",JOptionPane.ERROR_MESSAGE);
			break;
		}
		Integer numeroM=array.get(0);
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i)>numeroM) {
				numeroM=array.get(i) ;
			}
		}
		return numeroM;
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
