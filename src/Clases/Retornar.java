
package Clases;

public class Retornar {
    Cuestionario cuestionario;
    Respuesta respuesta;
    
    public Retornar(Cuestionario cuestionario, Respuesta respuesta){
    this.cuestionario = cuestionario;
    this.respuesta = respuesta;
    
    }
    
    public String retonarResultadoFinal(){
    int total = 0; 
    
    String resultadoFrase =""; 
    
    total = cuestionario.getTotal();
    
    if(total >= 0 && total <=20){
        
        resultadoFrase = respuesta.getMuyBajo();
    
    }
    else if(total >= 21 && total <=35){
        resultadoFrase = respuesta.getBajo();
    
    }
    else if (total >= 36 && total <=45){
        resultadoFrase = respuesta.getMedioBajo();
    
    }
    else if(total >= 46 && total <=79){
         resultadoFrase = respuesta.getMedioAlto();
    
    }
    else if(total >= 80 && total <=90){
        resultadoFrase = respuesta.getMuyAlto();
    
    }
    
    return resultadoFrase;
    
    }
    
}
