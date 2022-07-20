package OpcionValorParser;
//Implementaremos una serie de funciones que deben
//1º Permitirnos definir opciones en nuestro parser
//2º Permitirnos fijar su valor
//3º Permitirnos analizar y obtener su valor si la opción existe

import java.util.HashMap;

public class OptionParser {
    private HashMap<String, String> options = new  HashMap();
    private String []args;

    private OptionParser(){} //Porque vamos a crear otro constructor cuyo parámetro sea (String []args)
    public OptionParser(String []args){
        this.args = args;  //Le asignamos los valores que recibimos como parámetros de entrada en el main
    }


    public void registerOption(String optionName){
        options.put(optionName, ""); //añade una nueva opción
    }

    public String getOption(String optionName){
        return options.get(optionName);//Si el valor existe nos devolverá el valor de la opción y si no un string vacío
    }

    public void setOptionValue(String optionName, String optionValue){
        options.replace(optionName, optionValue); //modifica el valor asociado a esa opción
    }

    public void parse(){ //Implementamos la lógica importante de la clase:

        for (int i =0; i< args.length; i++) {//Va a ir leyendo todos los argumentos de entrada:
            // optionName almacenará nombre de la opción sin guiones
            String optionName = args[i].replace("-", "");
            //Ej: --loquesea (Entrada) -> loquesea (Salida)

            if(options.containsKey(optionName)){ //Si contiene alguna de las opciones registradas en el main lin:60,61,...
                setOptionValue(optionName, args[i+1]); //Modificará nuestro Hashmap con los parámetros que le correspondan
            }   // optionName=Clave de la opción(sin guiones), valor de la opción
        }
    }

    //Librerías que ya implementan el parse y sirven para lo mismo:
    //http://commons.apache.org/cli/ -Apache Commons CLI
    //http://www.martiansoftware.com/jsap/ -JSAP

}
