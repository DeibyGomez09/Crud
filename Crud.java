package crud;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Deiby Gomez
 */
public class Crud {

     ArrayList<String> listaStrings;
     
    public static void main(String[] args) {
    Crud inst = new Crud();
    inst.listaStrings = new ArrayList(); 
    inst.leerOpcion(); 
    }
    public void leerOpcion(){
    Scanner teclado = new Scanner (System.in);
    int opc;
    do{
        System.out.println("\nSeleccione opción");
        System.out.println("[1] Crear elemento");
        System.out.println("[2] Leer elementos");
        System.out.println("[3] Modificar elemento");
        System.out.println("[4] Eliminar elemento");
        System.out.println("[5] Salir");
        opc = teclado.nextInt();
    
    switch(opc){
        case 1:
            crear();
            break;
        case 2:
            leer();
            break;
        case 3:
            modificar();
            break;
        case 4:
            eliminar();
            break;
        case 5:
            
    }     
    }while(opc != 5);        
    }
    
    public void crear(){
    Scanner teclado = new Scanner(System.in);
    String elemento;
        System.out.println("Digite elemento a ingresar: ");
        elemento = teclado.nextLine();
    listaStrings.add(elemento);
    }
    
    public void leer(){
    if(!listaStrings.isEmpty()){
        System.out.println("Elementos de la lista: ");
        for (int i = 0; i < listaStrings.size(); i++){
            System.out.println(listaStrings.get(i));
        }
    }else{
        System.out.println("La lista no tiene nada");
    }
    }
    
    public void modificar(){
    Scanner teclado = new Scanner(System.in);
    String elemento;
    String elementoNuevo;
    int indice = 0;
     System.out.println("Elemento a modificar: ");
        elemento = teclado.nextLine();
        indice = listaStrings.indexOf(elemento);
        if(indice != -1){
            System.out.println("Nuevo elemento: ");
            elementoNuevo = teclado.nextLine();
            listaStrings.set(indice,elementoNuevo);
        }else{
            System.out.println("Elemento no esta en la lista.");
        }
    }
    
    public void eliminar(){
    Scanner teclado = new Scanner(System.in);
    String elemento;
    int indice = 0;
        System.out.println("Elemento a eliminar: ");
        elemento = teclado.nextLine();
        indice = listaStrings.indexOf(elemento);
        if(indice != -1){
        listaStrings.remove(indice);
            System.out.println("Elemento eliminado.");
        }else{
            System.out.println("Elemento no encontrado");
        }
    }
    
}
