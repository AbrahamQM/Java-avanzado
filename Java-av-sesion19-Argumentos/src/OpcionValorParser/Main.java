package OpcionValorParser;

public class Main {
    public static void main(String[] args) {
        /* Nos pasarán un array de String ej:
        +-----------+---------+----------+------+
        | --minval  |   10    | --maxval | 100  | ...
        +-----------+---------+----------+------+
        | pos 0     |   pos 1 | pos 2    | pos3 | ...

         */
//Esta forma no es práctica por que si no nos pasan los valores en el orden determinado, no funcionaría bien
//        String opcionMinVal = args[0];
//        int valorMinVal = Integer.valueOf(args[1]);
//
//        System.out.println("Opción: " + opcionMinVal + " valor: " + valorMinVal);
//
//        String opcionMaxVal = args[2];
//        int valorMaxVal = Integer.valueOf(args[3]);
//
//        System.out.println("Opción: " + opcionMaxVal + " valor: " + valorMaxVal);


//Para acceder correctamente a los valores, lo ideal sería hacerlo de otra forma

//        int opcionMinVal = 0;
//        int opcionMaxVal = 0;
//        String opcionNombre = null;
//
//        //Obtener valores con in bucle
//        for (int i=0; i<args.length; i++){
//            switch(args[i]){
//                case "--minval":
//                    opcionMinVal = Integer.valueOf(args[i+1]);
//                    //también valdría = Integer.parseInt(args[i+1]);
//                    i++;//Para saltarnos el valor después de comprobarlo y asignarlo
//                    break;
//
//                case "--maxval":
//                    opcionMaxVal = Integer.valueOf(args[i+1]);
//                    i++;//Para saltarnos el valor después de comprobarlo y asignarlo
//                    break;
//
//                case "--nombre":
//                    opcionNombre = args[i+1];
//                    i++;//Para saltarnos el valor después de comprobarlo y asignarlo
//                    break;
//            }
//
//        }
//        System.out.println("Minval: " + opcionMinVal + " Maxval: " + opcionMaxVal + " Nombre: " + opcionNombre);
//    }
//
//    ----------------QUEDA COMENTADO PARA PODER PROBAR OTROS MÉTODOS----------------

        //Obtener valores con un parse Implementando una clase ej: OptionParser
        OptionParser optionParser = new OptionParser(args);

        //Creamos una función auxiliar "registerOption()" para registrar las opciones que nosotros queremos registrar
        // (dentro de un HashMap) OptionParser Lin:19
        optionParser.registerOption("minval");
        optionParser.registerOption("maxval");//Si comentamos u obviamos alguna, esa opción la ignorará
 //       optionParser.registerOption("nombre"); en este caso será null por haberlo comentado

        //Invocamos la función parse() para que compruebe si los valores que le hemos pasado al crear el objeto
        // OptionParser(args) existen entre los parámetros registrados Lin:61y62 que queremos obtener
        optionParser.parse(); //OptionParser Lin:31

        //Métodos para obtener valores de esas opciones en OptionParser Lin:23
        int minVal = Integer.valueOf( optionParser.getOption("minval"));
        System.out.println("MinVal es: " + minVal);

        int maxVal = Integer.valueOf(optionParser.getOption("maxval"));
        System.out.println("MaxVal es: " + maxVal);

        String nombre = optionParser.getOption("nombre");
        System.out.println("El nombre es: " + nombre);

        //Para imprimir los números que están entre el minVal y el maxVal
        for (int i=minVal; i<=maxVal; i++){
            System.out.print(i+ " ");
        }

        //Librerías que ya implementan el parse y sirven para lo mismo:
        //http://commons.apache.org/cli/ -Apache Commons CLI
        //http://www.martiansoftware.com/jsap/ -JSAP
    }
//    Ejemplo usando Apache Commons CLI
//    public static demoACCLI(String []args){
//        Options options = new Options(); //Creamos un objeto del tipo Options "parser de opciones"
//
//        Option maxVal = new Option("m", "maxval", true, "valor máximo"); //Creamos las opciones que nos interesen
//        maxVal.setRequired(true); //Hacemos que la opción sea obligatoria
//
//        options.addOption(maxval); //registramos la opción
//
//        //Invocamos a los parsers:
//        CommandLineParser parser = new CommandLineParser();
//        HelpFormatter helpFormatter = new HelpFormatter(); //Esto le dará formato a la ayuda usando -h por ejemplo
//
//        //Creamos una instancia de linea de comandos
//        CommandLine cmd = null; //no debería estar inicializada a null salvo que sea necesario
//
//        //Creamos el try-catch
//        try{
//            cmd = parser.parse(options, args);//A nuestro parser le decimos que parsee las opciones que hemos
//            // registrado en options y, que están contenidas en args
//        }catch(Exception e){
//
//        }
//
//        //Para obtener alguno de los valores:
//        int miMaxVal = Integer.parseInt(cmd.getOptionValue("maxval"));
//        System.out.println("Mi max val es: " + miMaxVal);
//
//    }
}
