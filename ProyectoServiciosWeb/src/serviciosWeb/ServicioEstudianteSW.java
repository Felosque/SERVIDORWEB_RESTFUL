package serviciosWeb;

import estructural.Estudiante;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import servicios.ServicioEstudiante;


@Path("servicioWebEstudiante")
public class ServicioEstudianteSW {
    
    public ServicioEstudianteSW() {
        super();
    }

    @POST
    @Consumes("application/json")
    @Path("insertarEstudiante")
    public void insertarEstudiante(Estudiante pEstudiante) throws Exception {
        ServicioEstudiante.insertarEstudiante(pEstudiante);
    }

    @DELETE
    @Path("eliminarEstudiante")
    public boolean eliminarEstudiante(@QueryParam("documento") String pDocumento) throws Exception{
        return ServicioEstudiante.eliminarEstudiante(pDocumento);
    }

    @PUT
    @Consumes("application/json")
    @Path("actualizarEstudiante")
    public boolean actualizarEstudiante(Estudiante pEstudiante) throws Exception{
        return ServicioEstudiante.actualizarEstudiante(pEstudiante);
    }

    @GET
    @Produces("application/json")
    @Path("buscarEstudiante")
    public Estudiante buscarEstudiante(@QueryParam("documento") String pDocumento) throws Exception {
        return ServicioEstudiante.buscarEstudiante(pDocumento);
    }

    @GET
    @Produces("application/json")
    @Path("darEstudiantes")
    public ArrayList<Estudiante> darEstudiantes() throws Exception {
        return ServicioEstudiante.darEstudiantes();
    }
    
    //En la posición 0 devuelve la cantidad de hombres, en la 1 la cantidad de mujeres
    @GET
    @Produces("application/json")
    @Path("cantidadEstudiantesPorGenero")
    public int[] cantidadEstudiantesPorGenero() throws Exception {
        return ServicioEstudiante.cantidadEstudiantesPorGenero();
    }

    @GET
    @Produces("application/json")
    @Path("darEstudiantesPorNombre")
    public ArrayList<Estudiante> darEstudiantesPorNombre(@QueryParam("nombre") String pNombre) throws Exception {
        return ServicioEstudiante.darEstudiantesPorNombre(pNombre);
    }

    @GET
    @Produces("application/json")
    @Path("darGradoEstudiante")
    public int darGradoEstudiante(@QueryParam("documento") String pDocumento) throws Exception {
        return ServicioEstudiante.darGradoEstudiante(pDocumento);
    }

    @GET
    @Produces("application/json")
    @Path("cantidadEstudiantesRegistrados")
    public int cantidadEstudiantesRegistrados(){
        return ServicioEstudiante.cantidadEstudiantesRegistrados();
            
    }
    
}
