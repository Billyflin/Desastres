package interfaz;

import modelo.Desastre;

import java.util.ArrayList;
import java.util.List;

public interface CRUD<T> {

    boolean crear();

    ArrayList<T> leer(String ruta);

    boolean actualizar(String nuevaData);
    boolean borrar();
}
