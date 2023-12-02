package listassimples;

/**
 *
 * @author alexc
 */
public class Lista{
	Node top;

//Métodos para los casos de inserción de nodos
public boolean insertaPrimerNodo(String dato){
    if (top == null) { //La lista no está vacía
        top = new Node();
        top.name = dato;
        top.next = null;
        return true;
    }else {
        return false;
    }
}

public void insertaAntesPrimerNodo(String nombre){
    Node temp; 
    temp = new Node ();
    temp.name = nombre;
    temp.next = this.top;
    this.top = temp;
    temp = null;
}

public void insertaAlFinal(String nombre){
    Node temp = new Node ();
    temp.name = nombre;
    temp.next = null;
    //Node temp2;
    Node temp2 = this.top;
    while (temp2.next != null)
        temp2 = temp2.next;
        temp2.next = temp;
        temp = null;
        temp2 = null;
}

public boolean insertaEntreNodos(String nombre, String buscado){
    Node temp = new Node();
    temp.name = nombre;
    Node temp2 = this.top;
    //boolean NodoNoEncontrado = true;
    while ( (temp2 != null) && temp2.name.equals(buscado) == false ) {	
        temp2 = temp2.next;
    }
    if (temp2 != null){  //Nodo buscado se encontró
        temp.next = temp2.next;
        temp2.next = temp;
        temp = null;
        temp2 = null;
        return true;
    }else return false;
} 

public void imprimir(){
    for (Node temp = this.top; temp != null; temp = temp.next){
        System.out.print("[ " + temp.name + " ] -> ");
    }
    System.out.print("[X]\n"); 
}

public String toString(){
    String cadAux = "";
    for (Node temp = this.top; temp != null; temp = temp.next){
        cadAux += "[ " + temp.name + " ] -> ";
    }
    cadAux += "[X]\n"; 
    return cadAux;
}
	
//Métodos de borrado
public void borrarPrimerNodo(){
    this.top = this.top.next;
}

//Borrar cualquier nodo que no sea el primero
public boolean borrarCualquierNodo(String buscado){
    Node temp = this.top;
    while ( (temp != null) && temp.name.equals(buscado) == false ) {	
        temp = temp.next;
    }
    if (temp != null){  //Nodo buscado se encontró
        temp.next = temp.next.next;
        temp = null;
        return true;
    }else return false;
}
/////////////////////////////////////////////////////////////////////////////////////////////
// Método para buscar un nodo por su posición
    public Node buscarPorPosicion(int posicion) {
        Node temp = this.top;
        int contador = 0;

        while (temp != null && contador < posicion) {
            temp = temp.next;
            contador++;
        }

        return temp;
    }

    // Método para insertar un nuevo nodo antes del último
    public void insertarAntesUltimo(String nombre) {
        Node temp = new Node();
        temp.name = nombre;
        temp.next = null;

        if (top == null) {
            top = temp; // Si la lista está vacía, el nuevo nodo se convierte en el primer nodo
        } else {
            Node temp2 = this.top;
            while (temp2.next != null) {
                temp2 = temp2.next;
            }
            temp2.next = temp; // Conecta el nuevo nodo al final de la lista
        }
    }

    // Metodo para intercambiar nodos
    public void intercambiarNodos(String nombre1, String nombre2) {
    // Buscar nodos con los nombres dados
    Node nodo1 = null;
    Node nodo2 = null;
    Node temp = this.top;

    while (temp != null) {
        if (temp.name.equals(nombre1)) {
            nodo1 = temp;
        } else if (temp.name.equals(nombre2)) {
            nodo2 = temp;
        }

        temp = temp.next;
    }

    // Verificar si se encontraron ambos nodos
    if (nodo1 != null && nodo2 != null) {
        // Intercambiar nodos
        String tempName = nodo1.name;
        nodo1.name = nodo2.name;
        nodo2.name = tempName;
    } else {
        System.out.println("Uno o ambos nodos no encontrados.");
    }
}


}
