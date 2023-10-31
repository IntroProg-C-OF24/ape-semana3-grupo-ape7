
package ejercicio.pkg08;
public class Ejercicio08 {
    public static void main(String[] args) {
                int val= 10;
        int val1= 9;
        int val2= 20;
        int val3= 500;
        int val4= 2;
        int val5= 3;
        int val6= 200;
        int val7= 50;
        int val8= 51;
        boolean op1;
        boolean op2;
        boolean rta=false;
        op1= (val*val1)+val2-val3/val4 + (Math.pow(val5, val4))>=val6;
        op2= val7>=val7-val7+val8;
        System.out.println("La respuesta de la primera operacion es: " + op1);
        System.out.println("La respuesta de la segunda operacion es: " + op2);
        System.out.println("La respuesta total de este ejercicio es: " + rta );
    }
}
