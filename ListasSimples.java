package listassimples;

/**
 *
 * @author alexc
 */
public class ListasSimples{

    public static void main(String[] args){
        Lista lista = new Lista();

        lista.insertaPrimerNodo("H");
        lista.insertaAntesPrimerNodo("O");
        lista.insertaAlFinal("Y");
        lista.insertaEntreNodos("R", "A");
        lista.imprimir();
        System.out.print(lista);
        
        //////////////////////////////////////////////////////////////////
        // Ejemplo de uso de los nuevos métodos
        Node nodoEnPosicion2 = lista.buscarPorPosicion(2);
        System.out.println("Nodo en posición 2: " + nodoEnPosicion2.name);

        lista.insertarAntesUltimo("Nuevo");
        lista.imprimir();

        lista.intercambiarNodo("H", "Y");
        lista.imprimir();
}

}