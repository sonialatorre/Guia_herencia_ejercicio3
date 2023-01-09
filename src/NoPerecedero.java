import java.util.Scanner;

public class NoPerecedero extends Alimento {
    public NoPerecedero (){

    }

    public NoPerecedero(String nombre, String marca, String rangoPrecio) {
        super(nombre, marca, rangoPrecio);
    }

    @Override
    public void TipoAlimento(){
        Scanner input =new Scanner(System.in);
        System.out.println ("Alimentos NO Perecederos");
        System.out.println ("¿Cuál es el nombre de su producto?");
        nombre=input.nextLine();
        System.out.println ("¿Cuál es la marca de su producto?");
        marca=input.nextLine();
        System.out.println ("¿El rango de precio de éste producto es alto, medio o bajo?");
        RangoPrecio=input.nextLine();
    }
}


