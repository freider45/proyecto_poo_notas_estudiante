package mundo;
import java.util.ArrayList;
import modelo.*;
public class clsPrincipal {
    
    public static void main(String[] args) {
       ArrayList<clsEstudiante> lstEstudiantes = new ArrayList<clsEstudiante>();
      /*CREACION OBJETOS*/
      //Objeto Estudiante
      clsEstudiante objE1 = new clsEstudiante("Erika");
      clsEstudiante objE2 = new clsEstudiante("Carlos");
      clsEstudiante objE3 = new clsEstudiante("Karen");
      clsEstudiante objE4 = new clsEstudiante("Kenslly");
      clsEstudiante objE5 = new clsEstudiante("Vanesa");
      lstEstudiantes.add(objE1);
      lstEstudiantes.add(objE2);
      lstEstudiantes.add(objE3);
      lstEstudiantes.add(objE4);
      lstEstudiantes.add(objE5);
      //Objetos Materias
      clsMateria objM1 = new clsMateria("poo");
      clsMateria objM2 = new clsMateria("Calculo");
      //Objetos promedios
      clsPromedio objP1 = new clsPromedio(4.2f);
      clsPromedio objP2 = new clsPromedio(3.8f);
      clsPromedio objP3 = new clsPromedio(3.5f);
      clsPromedio objP4 = new clsPromedio(4.0f);
      clsPromedio objP5 = new clsPromedio(3.2f);
      clsPromedio objP6 = new clsPromedio(3.8f);
      clsPromedio objP7 = new clsPromedio(4.8f);
      clsPromedio objP8 = new clsPromedio(4.5f);
      clsPromedio objP9 = new clsPromedio(4.2f);
      clsPromedio objP10 = new clsPromedio(5.0f);
      /*ASOCIACION OBJETOS*/
      //De estudiante a materia
      objE1.getLstMaterias().add(objM1);
      objE2.getLstMaterias().add(objM1);
      objE3.getLstMaterias().add(objM1);
      objE3.getLstMaterias().add(objM2);
      
      objE4.getLstMaterias().add(objM2);
      objE5.getLstMaterias().add(objM2);
      //De materia a estudiante
      objM1.getLstEstudiantes().add(objE1);
      objM1.getLstEstudiantes().add(objE2);
      objM1.getLstEstudiantes().add(objE3);
      
      objM2.getLstEstudiantes().add(objE4);
      objM2.getLstEstudiantes().add(objE5);
      objM2.getLstEstudiantes().add(objE3);
      
      //Se agregan los promedios a los estudiantes
      objE1.getLstPromedios().add(objP1);
      objE1.getLstPromedios().add(objP2);
      
      objE2.getLstPromedios().add(objP3);
      objE2.getLstPromedios().add(objP4);
      
      objE3.getLstPromedios().add(objP5);
      objE3.getLstPromedios().add(objP6);
      
      objE4.getLstPromedios().add(objP7);
      objE4.getLstPromedios().add(objP8);
      
      objE5.getLstPromedios().add(objP9);
      objE5.getLstPromedios().add(objP10);
      
      //Los promedios ya se le asigna su estudiante
      objP1.setObjEstudiante(objE1);
      objP2.setObjEstudiante(objE1);
      
      objP3.setObjEstudiante(objE2);
      objP4.setObjEstudiante(objE2);
      
      objP5.setObjEstudiante(objE3);
      objP6.setObjEstudiante(objE3);
      
      objP7.setObjEstudiante(objE4);
      objP8.setObjEstudiante(objE4);
      
      objP9.setObjEstudiante(objE5);
      objP10.setObjEstudiante(objE5);
      
      imprimirEstMaterias(lstEstudiantes);
      imprimirMatEstudiantesPro(objM1);
      imprimirMatEstudiantesPro(objM2);
      imprimirEstudiantePromGral(lstEstudiantes);
      
    }
    public static void imprimir(String vTexto){
        System.out.println(vTexto);
    }
    public static void imprimirEstMaterias(ArrayList<clsEstudiante> lstEstudiantes){
        imprimir("======SEGUNDO PUNTO=======");
        clsEstudiante auxE;
        
        for(int i=0; i<lstEstudiantes.size();i++){
            imprimir("ESTUDIANTE: "+lstEstudiantes.get(i).getNombre());
            auxE=lstEstudiantes.get(i);
            for(int j=0;j<auxE.getLstMaterias().size();j++){
                imprimir("Materia: "+auxE.getLstMaterias().get(j).getNombre());
            }
            imprimir("");
        }//FIN FOR 1
        
    }//FIN METODO
    
    public static void imprimirMatEstudiantesPro(clsMateria objM){
        imprimir("======TERCER PUNTO=========");
        imprimir("Materia: "+objM.getNombre());
        for(int i=0;i<objM.getLstEstudiantes().size();i++){
            imprimir("Estudiante: "+objM.getLstEstudiantes().get(i).getNombre());
        }
        imprimir("");
    }
    
    public static void imprimirEstudiantePromGral(ArrayList<clsEstudiante> lstEstudiante){
        imprimir("========CUARTO PUNTO========");
        float sum=0, prom=0;
        int tam=0; 
        for(int i=0;i<lstEstudiante.size();i++){
            imprimir("Estudiante: "+lstEstudiante.get(i).getNombre());
            tam =lstEstudiante.get(i).getLstPromedios().size();
            for(int j=0;j<tam;j++){
                sum = sum+lstEstudiante.get(i).getLstPromedios().get(j).getPromedio();
            }
            prom = sum / tam;
            sum=0;
            imprimir("Promedio General: "+prom);
            imprimir("");
        }
    }
    
}//FIN CLSE
