package ApiRest.JavaAvsesion27ArquitecturaLimpia.Repositories;

public class UsuariosDBFactory {
    private String tipoDeBBDD = "";

    public UsuariosDBFactory(String tipoDeBBDD){
        this.tipoDeBBDD = tipoDeBBDD;
    }

    public  UsuariosDB getDatabaseInstance(){
        if(tipoDeBBDD.equalsIgnoreCase("memoria")){
            return new UsuariosDBMemoria();
        }else if (tipoDeBBDD.equalsIgnoreCase("fichero")){
            return new UsuariosDBFichero();
        }else{
            //Para cuando no coincide el tipo de UsuariosDB, creamos UsuariosDBNullable que no sirve de nada
            return new UsuariosDBNullable();
        }
    }
}
