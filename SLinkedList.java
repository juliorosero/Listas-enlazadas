public class SLinkedList 
{
	protected Node head;
	protected long size;
	
	
	public void SLinkedlist() {
	head = null;
	size= 0; 
	}
	
	
	 public boolean estaVacia(){
		 
		 return head==null;	 
	 }

	 public void insertarAlInicio(String a){
		 
		 if (estaVacia()) 
			  head= new Node(a);
		 else 
			  head = new Node(a,head); 
	 }
	 
	 public void insertarAlFinal(String a){

	     Node aux = new Node(a);
	     Node inicio;

	     if (estaVacia()) {
	         insertarAlInicio(a);
	         
	     }else {
	         inicio = head;         
	         while(inicio.getNext() != null){
	             inicio=inicio.getNext();
	         }              
	         inicio.setNext(aux);
	     }
	 }
	 
	 
	 public  void vaciar(){
		  head=null;
	 }
	 
	 
	 public int tamaño() {
	     Node aux;
	     size=0;
	     aux = head;

	     while(aux != null)
	     {
	         size++;
	         aux = aux.getNext();
	     }
	     return (int) size;

	 }
	 
	 
	public void buscar(int posicion){
		 
	     Node aux= head;
	     int cont=1;

	     if(posicion<1 || posicion>=tamaño()){
	         System.out.println("Posicion NO encontrada");
	     }
	     
	     else{
	         while(aux!=null){
	             if (posicion ==  cont){
	                 System.out.println("el elemento es : "+aux.getElement()  +": en la posicion "+ posicion);
	                 aux=null;
	                 }
	                 
	             else{                 
	                 aux=aux.getNext();
	                 cont++;
	             }
	         }
	     }
	 }
	
	
	 public void eliminarpos(int posicion){
		 
	     Node aux= head;
	     Node anterior=null;
	     int cont=1;

	     if(posicion<1 || posicion>=tamaño()){
	         System.out.println("posicion no encontrada");
	     }
	     else{
	         while(aux!=null){
	             if (posicion == cont){
	                 if (anterior==null){
	                     head = head.getNext();
	                 }
	                 else {
	                     anterior.setNext(aux.getNext());
	                 }
	                 aux=null;
	             }
	             else{
	                 anterior=aux;
	                 aux=aux.getNext();
	                 cont++;
	             }
	         }
	     }
	 }
	 
	 
	 public void imprimirLista(){
	     System.out.println("La lista es:  "); 
	     Node aux= head;
	     
	     
	     while(aux!=null){
	         System.out.println(aux.getElement());
	         aux=aux.getNext();
	     }
	     
	 }

	
	
}
