package test;
public class Asiento {

    public String color;
    public int precio;
    public int registro;

    public void cambiarColor(String color){
        
        if (color.equals("amarillo")){ 
          this.color = color;
        }else if(color.equals("rojo")){
            this.color = color;
        }else if(color.equals("verde")){
            this.color = color;            
        }else if(color.equals("negro")){
            this.color = color;           
        }else if(color.equals("blanco")){
            this.color = color;          
        }

    }

}
