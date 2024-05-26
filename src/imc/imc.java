package imc;

import javax.swing.JTextField;


public class imc {

    String a, b;
    float x, y;
    private float imc;

    public boolean getCheckEmpty(String a, String b) {
        if (a.equals("") || b.equals("") || a.equals("") && b.equals("")) {
            return true;
        } else {
            this.a = a;
            this.b = b;
            return false;
        }

        
    }

    public boolean getCheckIsNumber() {
        try {
            Float.parseFloat(a);
            Float.parseFloat(b);
            setConvertir();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    public void setConvertir() {
        this.x = Float.parseFloat(a);
        this.y = Float.parseFloat(b);

    }   
    public Float getIMC() {
        float imc;
        imc = x / (y * y);
        this.imc = imc;
        return imc;
    }
    
    
    public String getStatus() {
        String status = "";
        if (imc <= 18.4) {
            status = "Insuficiencia Ponderal";
        } else if (imc >= 18.5 && imc <= 24.9) {
            status = "Peso normal";            
        }else if(imc>=25 && imc <=29.9){
            status = "Sobrepeso";
        }else if(imc>=30 && imc<=34.9){
            status = "  Obesidad I";
        }else if(imc>=35 && imc<= 39.9){
            status = "Obesidad II";
        }else if(imc>=40){
            status = "Obesidad III";
        }         
        return status;
        
        
    }
    
    
    public String getTip(){
        String tip = "";
        if (imc <= 18.4) {
            tip = "Alimentate sanamente";
        } else if (imc >= 18.5 && imc <= 24.9) {
            tip = "Sigue así";            
        }else if(imc>=25 && imc <=29.9){
            tip = "Baja la dosis de comida.";
        }else if(imc>=30 && imc<=34.9){
            tip = "Haz ejercicio";
        }else if(imc>=35 && imc<= 39.9){
            tip = "Haz ejercicio y come bien.";
        }else if(imc>=40){
            tip = "Acude al nutriologo.";
        }         
        return tip;
    }
    
    
    
}
