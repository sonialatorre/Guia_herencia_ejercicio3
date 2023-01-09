import java.util.Scanner;

public class Perecedero  extends Alimento{

    public Perecedero (){

    }

    public Perecedero(String nombre, String marca, String rangoPrecio) {
        super(nombre, marca, rangoPrecio);
    }

    @Override
    public void TipoAlimento(){
        Scanner input =new Scanner(System.in);
        System.out.println ("Alimentos Perecederos");
        System.out.println ("¿Cuál es el nombre de su producto?");
        nombre=input.nextLine();
        System.out.println ("¿Cuál es la marca de su producto?");
        marca=input.nextLine();
        System.out.println ("¿El rango de precio de éste producto es alto, medio o bajo?");
        RangoPrecio=input.nextLine();
    }
}
