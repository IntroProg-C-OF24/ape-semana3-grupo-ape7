package ejercicio07;
public class Ejercicio07 {
    public static void main(String[] args) {
    int var1 = 81;
    int var2 = 9;
    int var3 = 3;
    int var4 = 10;
    int var5 = 1;
    int var6 = 100;
    int var7 = 25;
    boolean op1;
    boolean op2;
    boolean rta = true;
 
    op1 = ((Math.sqrt(var1) + var2)/var3)== var2;
    op2 = (var4 > var5);
    double resultado  =  ((var6/var7) + (Math.sqrt(var6)));
        System.out.println("Respuesta Op1 = " + op1);
        System.out.println("Respuesta Op2 = " + op2);
        System.out.println("Respuesta de Op1 y Op2 = " + rta);
        System.out.println("Respuesta Op3 = " + resultado);
        // Este ejercicio no se le puede dar solución, porque la ultima operación tiene un valor numerico y no una proposicion de verdadero o falso como las anteriores
    }
    
}
