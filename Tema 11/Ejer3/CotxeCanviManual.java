package Ejer3;

public class CotxeCanviManual extends Coche {

   public CotxeCanviManual(String matricula){
       super(matricula);
   }

   @Override
   public void canviarMarcha(int marcha){
        mActual=marcha;
}
    
}
