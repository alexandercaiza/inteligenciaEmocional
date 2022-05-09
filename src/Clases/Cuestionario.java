
package Clases;


public class Cuestionario {
   private int total;
   private int subTotal;
   private int valorPreguntaUno;
   private int valorPreguntaDos;
   private int valorPreguntaTres;
   
   public Cuestionario(){
   
   }
   public Cuestionario(int total){
       
   this.total = total;
   this.subTotal = 0;
   
   }
   
   public int getTotal(){
       
   return this.total;
   
   }
   
  public int asignarValorNunca(){
  int valor = 0;
  return valor;
  }
  
  public int asignarValorAlgunasVeces(){
  int valor = 1;
  return valor;
  }
  
  public int asignarValorSiempre(){
  int valor = 2;
  return valor;
  }
  
  public int retornarSubtotal(){
  int suma = this.valorPreguntaUno + this.valorPreguntaDos + this.valorPreguntaTres;
  return suma;
  }
  
  public int retornarTotal(){
  int suma =this.total + this.valorPreguntaUno + this.valorPreguntaDos + this.valorPreguntaTres;
  return suma;
  
  }

    public int getValorPreguntaUno() {
        return valorPreguntaUno;
    }

    public int getValorPreguntaDos() {
        return valorPreguntaDos;
    }

    public int getValorPreguntaTres() {
        return valorPreguntaTres;
    }

    public void setValorPreguntaUno(int valorPreguntaUno) {
        this.valorPreguntaUno = valorPreguntaUno;
    }

    public void setValorPreguntaDos(int valorPreguntaDos) {
        this.valorPreguntaDos = valorPreguntaDos;
    }

    public void setValorPreguntaTres(int valorPreguntaTres) {
        this.valorPreguntaTres = valorPreguntaTres;
    }
   
   
    
    
    
}
