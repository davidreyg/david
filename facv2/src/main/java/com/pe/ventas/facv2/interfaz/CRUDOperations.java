package com.pe.ventas.facv2.interfaz;
import java.util.List;
import java.util.Map;

public interface CRUDOperations <E> {
	
	public List<Map<String, Object>> listar();

    public int crear(E ent);

    public int modificar(E ent);

    public int eliminar(E id);

    public List<Map<String, Object>> buscar(E id);
}
