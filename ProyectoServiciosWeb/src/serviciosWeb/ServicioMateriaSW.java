package serviciosWeb;

import conexion.Conexion;

import estructural.Materia;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import servicios.ServicioMateria;
import servicios.ServicioMatricula;

public class ServicioMateriaSW {
   
    public ServicioMateriaSW() {
        super();
    }
    
    public Materia darMateriaPorCodigo(int pCodigo) throws Exception {
        return ServicioMateria.darMateriaPorCodigo(pCodigo);
    }

    public ArrayList<Materia> darMateriasPorGrado(int pGrado) throws Exception {
        return ServicioMateria.darMateriasPorGrado(pGrado);
    }

    public ArrayList<Materia> darMaterias() throws Exception {
        return ServicioMateria.darMaterias();
    }
    
    public int cantidadMateriasRegistradas() throws Exception{
        return ServicioMateria.cantidadMateriasRegistradas();
    }
}
