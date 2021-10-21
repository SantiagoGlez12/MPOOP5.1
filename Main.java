public class Main {
  public static void main(String[] args) {
    Circulo cir = new Circulo();
    System.out.println(cir);
    cir.setRadio(5.6f);
    System.out.println(cir);
    cir.setRadio((float)7.33);
    System.out.println(cir);
    System.out.println("+++++++++++Composicion+++++++++++++");
    Persona persona1 = new Persona();
    System.out.println(persona1);
    persona1.setNombre("Susana");
    persona1.setApellido("Vazquez");
    Fecha fecha = new Fecha(2,1,2021);
    persona1.setFNacimiento(fecha);
    System.out.println(persona1);
    System.out.println(persona1.getFNacimiento().getAnio());
    System.out.println("+++++++++++Composicion 2+++++++++++++");
    Persona persona2 = new Persona("Juan","Perez",5,6,2000);
    System.out.println(persona2);


    System.out.println("+++++++++++Composicion Extra+++++++++++++");
    Coche coche1 = new Coche();
    System.out.println(coche1);
    coche1.anio = 2021;
    coche1.automatico = true;
    coche1.color = "gris";
    coche1.marca = "Nissan";
    coche1.numPuertas = 5;
    coche1.potencia = 150;
    Persona chofer = new Persona("Juan","Perez",2,1,1998);
    coche1.setChofer(chofer);
    Persona copiloto = new Persona("Miguel","Perez",3,7,2000);
    coche1.setCopiloto(copiloto);
    Persona pasajero1 = new Persona("Luisa","Ramirez",12,5,1980);
    coche1.setPasajero1(pasajero1);
    Persona pasajero2 = new Persona("Oscar","Lopez",11,3,2005);
    coche1.setPasajero2(pasajero2);
    System.out.println(coche1);
  }
}