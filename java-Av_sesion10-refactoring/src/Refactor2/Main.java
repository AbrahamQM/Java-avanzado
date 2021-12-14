package Refactor2;
/**
 * Técnica inLining y técnica extraerVariables
 */
public class Main {
    public static void main(String[] args) {
//Probar la función hoyEsDomingo()   TÉCNICA inLining
        hoyEsDomingo(7);
        hoyEsDomingo(5);
//Probar la función   TÉCNICA extraerVariables
        System.out.println(esOracleJavaEnMacOS());
    }

/**
 ***********Ejemplo sin usar la técnica inLining********************************
 */
//    public void hoyEsDomingo(int numero){
//        boolean isDomingo = hoyEsDiaNumero(numero);
//            System.out.println(isDomingo);
//    }
//    public static boolean hoyEsDiaNumero(int numero){
//        if (numero ==7){
//            return true;
//        }
//        return false;
//    }

/**
 * *************Usamos inLining******************************************************
 */
    public static void hoyEsDomingo(int numero) {
        boolean isDomingo = (numero == 7 ? true : false);

        System.out.println(isDomingo);
    }
/**
 *-------------- Sin usar extraerVariables--------------------------------------------------
 */
//    public boolean esOracleJavaEnMacOS(){
//      if(System.getProperty("java.runtime.name").contains("Oracle")  //Es un ejemplo para un ordenador Mac
//              && System.getProperty("os.version").compareTo("11.6") ==0 ){ //compareTo devuelve 0 cuando es cierto
//          return true;
//      }
//      return false;
//    }

/**
 * --------------Extraemos las variables---------------------------------------------------
 */
    public static boolean esOracleJavaEnMacOS() {
        boolean runtimeOracle = System.getProperty("java.runtime.name").contains("Oracle");
        boolean osVersion =System.getProperty("os.version").compareTo("11.6") == 0 ? true:false;
        if(runtimeOracle && osVersion) {
            return true;
        }
        return false;
    }

}
