// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

package Project_N2;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author santi
 */
public class Project_N2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Persona> pila=new Stack<Persona>();
        Iterator<Persona> iterador = pila.iterator();
        int opcion=0;

        do{
            try{
                System.out.println("Ingrese que desea hacer");
                System.out.println("1 = Agregar persona");
                System.out.println("2 = Eliminar personas con dni < 10 000 000");
                System.out.println("3 = Mostrar metodo recursivo");
                System.out.println("4 = Cerrar");
                opcion=sc.nextInt();
                sc.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Debe ingresar un numero");
                sc.nextLine();
            }
            switch(opcion){
                case 1: int dni;
                        String nombre;
                        System.out.println("Ingrese nombre");
                        nombre=sc.nextLine();
                        System.out.println("Ingrese DNI");
                        dni=sc.nextInt();
                        pila.add(new Persona(nombre, dni));
                    break;
                case 2: int mayor=10000000;
                        for (int i = 0; i < pila.size(); i++) {
                            if (mayor<pila.get(i).getDni()) {
                                System.out.println(pila.get(i).getNombre());
                                System.out.println(pila.get(i).getDni());
                            }
                        }
                    break;
                case 3:System.out.println("Metodo recursivo");
                        int resultado;
                        int num=9;
                        resultado=metodoRecursivo(num);
                        System.out.println(resultado);

                    break;
                case 4: System.out.println("Saliendo");
                    break;
            }
        }while(opcion!=4);

    }

    public static int metodoRecursivo(int num){
        int res;
        if (num==1) {
            return 1;
        }else{
            res=num + metodoRecursivo(num-1);

        }
        return res;
    }

}