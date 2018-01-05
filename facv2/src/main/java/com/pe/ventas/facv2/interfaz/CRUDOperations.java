package com.pe.ventas.facv2.interfaz;
import java.util.ArrayList;
import java.util.Map;

public interface CRUDOperations <E> {
	
	public ArrayList<Map<String, Object>> listar();

    public int crear(E ent);

    public int modificar(E id);

    public int eliminar(E id);

    public ArrayList<Map<String, Object>> buscar(E id);
}
