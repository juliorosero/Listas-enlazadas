 class Aplicacion {

	public static void main(String[] args)
	{
				 
		SLinkedList libro = new SLinkedList(); 
		
		 if (libro.estaVacia())
			 System.out.println("Lista SIN llenar");
		 
		 libro.insertarFinal("El Anticristo");
		 libro.insertarFinal("Las venas abiertas de America Latina");
		 libro.insertarFinal("Una breve histotairia del cpital");
		 libro.insertarFinal("Manuela");
		 libro.insertarFinal("Mitos y Leyendas del Ecuador");
		 libro.insertarFinal("Breve Historia republicana del Ecuador");
		 libro.insertarFinal("El universo en una cascara de nuez");
		 libro.insertarFinal("Polvo de Estrella");
		 
		 libro.imprimirLista();
		 System.out.println("\nLa lista de libros esta compuesta de :  "+libro.tamaño()+" y los libros son:");
		 
		 libro.eliminarpos(3);
		 
		 
		 libro.imprimirLista();
		 System.out.println("\nLa lista de libros esta compuesta de :  "+libro.tamaño()+" y los libros son:");
		 
		 
		 libro.localizar(3);
		 
		 
		 libro.vaciar();
		 
		 if (libro.estaVacia())
			 System.out.println("\nLista sin llenar");
		 
		 System.out.println("La lista de libros esta compuesta de :  "+libro.tamaño()+" y los libros son:");

	}

}
