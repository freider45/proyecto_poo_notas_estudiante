package modelo;

import java.util.ArrayList;

public class clsEstudiante {
    /*ATRIBUTOS*/
    //Atributos de clase
    private String nombre;
    //Referencias
    private ArrayList<clsMateria> lstMaterias;
    private ArrayList<clsPromedio> lstPromedios;
    /*METODOS*/
    //Constructores
    public clsEstudiante(){
        this.lstMaterias=new ArrayList<clsMateria>();
        this.lstPromedios=new ArrayList<clsPromedio>();
    }
    public clsEstudiante(String nombre) {
        this.nombre = nombre;
        this.lstMaterias=new ArrayList<clsMateria>();
        this.lstPromedios=new ArrayList<clsPromedio>();
    }
    //Metodos de acceso y modificación
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<clsMateria> getLstMaterias() {
        return lstMaterias;
    }
    public void setLstMaterias(ArrayList<clsMateria> lstMaterias) {
        this.lstMaterias = lstMaterias;
    }
    public ArrayList<clsPromedio> getLstPromedios() {
        return lstPromedios;
    }
    public void setLstPromedios(ArrayList<clsPromedio> lstPromedios) {
        this.lstPromedios = lstPromedios;
    }
    
    //Metodos generales o acciones

   
    
} //cierre de clase
