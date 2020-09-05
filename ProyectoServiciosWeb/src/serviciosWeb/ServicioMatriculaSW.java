package serviciosWeb;

import estructural.Matricula;
import java.util.ArrayList;
import java.util.Date;

import servicios.ServicioMatricula;

public class ServicioMatriculaSW {
    public ServicioMatriculaSW() {
        super();
    }
    
    
    public void matricularEstudiante(Matricula pMatricula) throws Exception {
        ServicioMatricula.matricularEstudiante(pMatricula);
    }

    public ArrayList<Matricula> darMatriculasEstudiante(String pDocumento) throws Exception {
        return ServicioMatricula.darMatriculasEstudiante(pDocumento);
    }

    public ArrayList<Matricula> darMatriculas() throws Exception {
        return ServicioMatricula.darMatriculas();
    }
    
    public ArrayList<Matricula> darMatriculasPorFecha(Date pFecha) throws Exception {
        return ServicioMatricula.darMatriculasPorFecha(pFecha);
    }

    public int[] darCantidadMateriasPorGradoCursando() throws Exception {
        return ServicioMatricula.darCantidadMateriasPorGradoCursando();
    }

    public void actualizarMatricula(Matricula pMatricula) throws Exception {
        ServicioMatricula.actualizarMatricula(pMatricula);
    }

    public boolean darPazYSalvoEstudiante(int pGrado, Matricula pMatricula) throws Exception {
        return ServicioMatricula.darPazYSalvoEstudiante(pGrado, pMatricula);
    }
    
    public void borrarMatriculaCodigo(int pCodigo) throws Exception {
        ServicioMatricula.borrarMatriculaCodigo(pCodigo);
    }

    public Matricula darMatriculaCodigo(int pCodigo) throws Exception {
        return ServicioMatricula.darMatriculaCodigo(pCodigo);
    }
    
    public double darPromedioEstudiante(Matricula pMatricula) throws Exception {
        return ServicioMatricula.darPromedioEstudiante(pMatricula);
    }

    public ArrayList<Matricula> darMatriculasEstudianteGrado(String pDocumento, int Grado) throws Exception {
        return ServicioMatricula.darMatriculasEstudianteGrado(pDocumento, Grado);
    }

    public int cantidadMatriculasRegistradas(){
        return ServicioMatricula.cantidadMatriculasRegistradas();
    }
    

    
}
