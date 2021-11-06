package modelo;

public class clsPromedio {
    /*ATRIBUTOS*/
    //Atributos de clase
    private float promedio;
    //Referencias
    private clsEstudiante objEstudiante;
    /*METODOS*/
    //Constructores
    public clsPromedio(){}
    public clsPromedio(float promedio){
        this.promedio=promedio;
    }
    //Metodos de acceso y modificación
    public float getPromedio() {
        return promedio;
    }
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }    
    
    public clsEstudiante getObjEstudiante() {
        return objEstudiante;
    }

    public void setObjEstudiante(clsEstudiante objEstudiante) {
        this.objEstudiante = objEstudiante;
    }
    
    //Metodos generales o acciones

} //cierre de clase
