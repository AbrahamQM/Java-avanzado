package DirectivaMenorConocimiento;
//(Ley de Demeter) es la ley de menor conocimiento:
//--Los objetos deben estar POCO ACOPLADOS (Loosely Coupled)
//PRINCIPIOS DE LA LEY DE DEMETER:
//--Dentro de un método yo puedo tener 4 tipos de relaciones:
//1º: Puedo relacionarme con mi propio objeto (modificando sus propias variables por ejemplo)
//2º: Puedo relacionarme con un argumento de mis funciones. (modificando los elementos que me pasen como parámetros)
//3º: Puedo relacionarme con un objeto generado dentro de mi propio objeto.
//4º: Puedo Invocarme a mi mismo. Creando un objeto del mismo tipo dentro del propio objeto
//--Que no podemos hacer
//Crear objetos de nuestro objeto y usar sus funciones que a su vez dependen de otras funciones
public class Main {

}
