
package boletin3;


public class Boletin3 {

    public static void main(String[] args) {
        Consumo objC1 = new Consumo();
        objC1.amosar();
        objC1.setLitros(50f);
        objC1.setpGas(1.57f);
        objC1.amosar();
        Consumo objC2= new Consumo(400f,100f,95f,5.4f);
        float valor= objC2.consuMedio();
       System.out.println("ConsumoMed= " + valor);
       objC2.setLitros(20f);
       objC2.amosar();
       float var= objC2.getvMed();
       System.out.println("VelocidadMed= " + var);
        float v= objC2.consuEuro();
       System.out.println("ConsuEuro= " + v);
        
    }    
}
