package Neum;

import javax.swing.JTextField;

public class Code {
   private String a;
   private String b;
    Code(){
    }
    /**
     * @return the a
     */
    public String getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(String a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public String getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(String b) {
        this.b = b;
    }
     public String instruccion(String a, String b){
      String c = null;
         if("LDA".equals(a) && "A".equals(b) ){
             c = "LDA csada";
        }
        else if("LDA".equals(a) && "I".equals(b) ){
             c = "LDAdasd ";
        }
         else if("LDA".equals(a) && "D".equals(b) ){
             c = "LDAdsad";
        }
         else if("LDA".equals(a) && "R".equals(b) ){
             c = "LDAdasda"+" jijijiji";
        }
         
         return c;
     }
    
    
}
