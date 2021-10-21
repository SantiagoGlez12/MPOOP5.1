public class Coche{
  //Seccion de atributos
  String color;
  String marca;
  int numPuertas;
  int anio;
  int potencia;
  boolean automatico;
  Persona chofer;
  Persona copiloto;
  Persona pasajero1;
  Persona pasajero2;

  //Seccion de constructores
  public Coche(){

  }
  public Coche(String marca, int anio, String color, int numPuertas, boolean automatico, int potencia, Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2){
    this.marca = marca;
    this.anio = anio;
    this.color = color;
    this.numPuertas =  numPuertas;
    this.automatico = automatico;
    this.potencia = potencia;
    this.chofer = chofer;
    this.copiloto = copiloto;
    this.pasajero1 = pasajero1;
    this.pasajero2 = pasajero2;
    
  }
  //Sets y Gets de Personas

  public Persona getChofer(){
    return chofer;
  }

  public void setChofer(Persona chofer){
    this.chofer = chofer;
  }

  public Persona getCopiloto(){
    return copiloto;
  }

  public void setCopiloto(Persona copiloto){
    this.copiloto = copiloto;
  }

  public Persona getPasajero1(){
    return pasajero1;
  }

  public void setPasajero1(Persona pasajero1){
    this.pasajero1 = pasajero1;
  }

  public Persona getPasajero2(){
    return pasajero2;
  }

  public void setPasajero2(Persona pasajero2){
    this.pasajero2 = pasajero2;
  }


  //Seccion de metodos
  public void encender(){
    System.out.println("Soy el coche de la marca "+marca+" y estoy encendiendo");
  }

  public void avanzar(boolean avanza){
    if(avanza){
      System.out.println("Estoy avanzando a 10 km/h");
    }else{
      System.out.println("Voy a 0 km/h");
    }
  }

  public void apagar(){
    System.out.println("Soy el coche de la marca "+marca+" y estoy apagadome");
  }

  public void frenar(boolean frena){
    if (frena){
      System.out.println("Estoy frenando");
    }else{
      System.out.println("No estoy frenando");
    }
  }

  public void abrirPuertas(int numPuertasAAbrir){
    if(numPuertasAAbrir > numPuertas){
      System.out.println("El numero de puertas a abrir es mayor al numero de puertas del coche");
    }else{
      System.out.println("Abriendo "+numPuertasAAbrir+" puertas");
    }
  }

  @Override
  public String toString(){
    return "Coche{"+"marca="+marca+" anio="+anio+" color="+color+" numPuertas="+numPuertas+" automatico"+automatico+" potencia="+potencia+" el chofer es ="+chofer+" el copiloto es="+copiloto+" el pasajero 1 es ="+pasajero1+" el pasajero 2 es ="+pasajero2+"}";
  }
}