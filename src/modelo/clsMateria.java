package modelo;
import java.util.ArrayList;
public class clsMateria {
    /*ATRIBUTOS*/
    //Atributos de clase
    private String nombre;
    //Referencias
    private ArrayList<clsEstudiante> lstEstudiantes;
    /*METODOS*/
    //Constructores
    public clsMateria(){
        this.lstEstudiantes= new ArrayList<clsEstudiante>();
    }
    public clsMateria(String nombre) {
        this.nombre = nombre;
        this.lstEstudiantes= new ArrayList<clsEstudiante>();
    }
    //Metodos de acceso y modificación
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<clsEstudiante> getLstEstudiantes() {
        return lstEstudiantes;
    }
    public void setLstEstudiantes(ArrayList<clsEstudiante> lstEstudiantes) {
        this.lstEstudiantes = lstEstudiantes;
    }
    //Metodos generales o acciones
} //cierre de clase

