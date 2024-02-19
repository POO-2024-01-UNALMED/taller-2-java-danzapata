package test;
public class Auto {
    
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public int registro;
    public Motor motor;
    public static int cantidadCreados;

    public int cantidadAsientos(){
        int Oky = 0;
        for (Asiento i:asientos) {
            if (i!=null){
                Oky++;               
            }
        }
        return Oky;

    }

    public String verificarIntegridad(){
        
        if (motor.registro!=registro){
            return "Las piezas no son originales";
        }
        for (Asiento i:asientos) {
            if (i!=null){
                if (i.registro!=registro){
                    return "Las piezas no son originales";
                }
            }
        }
        return "Auto original";
 



    }

    
}
