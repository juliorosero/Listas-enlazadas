import javax.swing.JOptionPane;

class Aplicacion {

	public static void main(String[] args)
	{
				 
		SLinkedList libro = new SLinkedList(); 
		
		 if (libro.estaVacia())
			 System.out.println("Lista SIN llenar");
		 
		 	libro.insertarFinal("1.- El Anticristo");
		 	libro.insertarFinal("2.- Las venas abiertas de America Latina");
		 	libro.insertarFinal("3.- Una breve histotairia del cpital");
		 	libro.insertarFinal("4.- Manuela");
		 	libro.insertarFinal("5.- Mitos y Leyendas del Ecuador");
		 	libro.insertarFinal("6.- Breve Historia republicana del Ecuador");
		 	libro.insertarFinal("7.- El universo en una cascara de nuez");
		 	libro.insertarFinal("8.- Polvo de Estrella");
		 
		 	libro.imprimirLista();
		 	System.out.println("\nLa lista de libros esta compuesta de :  "+libro.tamaño());
		 
		 	int eli=Integer.parseInt(JOptionPane.showInputDialog("Ingrese libro a eliminar"));
		 	libro.eliminarpos(eli);	 
		 
		 	libro.imprimirLista();
		 	
		 	int busc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese libro a buscar"));
		 	System.out.println("\nLa lista de libros esta compuesta de :  "+libro.tamaño()+" y los libros son:");
		 	libro.buscar(busc);
		 
		 
		 	libro.vaciar();
		 
		 	if (libro.estaVacia())
		 		System.out.println("\nLista sin llenar");
		 
		 	System.out.println("La lista de libros esta compuesta de :  "+libro.tamaño()+" y los libros son:");

	}

}
