package eva3_proyecto_final_team_donut;

/**
 *
 * @author Team Donut
 */
public class Nodo {

    private int dato; //VALOR
    private Nodo siguiente; //REFERENCIA

//CONSTRUCTORES
    public Nodo() {//DEFAULT
        this.siguiente = null;

    }

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
