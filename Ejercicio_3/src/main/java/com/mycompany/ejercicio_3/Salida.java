
package com.mycompany.ejercicio_3;

import java.util.Scanner;


public class Salida extends Ejercicio_3 {
    
    
    public static void operaciones(){
        Ejercicio_3 cuenta1 = new Ejercicio_3();
        Ejercicio_3 cuenta2 = new Ejercicio_3();
        
        Scanner result = new Scanner(System.in);
        menu1();
        int no_cuenta=result.nextInt();
        
        switch (no_cuenta) {
            case 1:
                while (true){
                    menu2();
                    int no_operacion = result.nextInt();
                    
                    switch ( no_operacion){
                        case 1:
                            System.out.println("El saldo de la Cuenta 1 es: ");
                            System.out.println(cuenta1.getCuenta_1());
                            break;
                        case 2:
                            System.out.println("Digite el valor a acreditar: ");
                            int acreditar=result.nextInt();
                            cuenta1.setCuenta_1(cuenta1.getCuenta_1()+acreditar);
                            break;
                        case 3:
                            System.out.println("Digite el valor a debitar: ");
                            int debitar=result.nextInt();
                            cuenta1.setCuenta_1(cuenta1.getCuenta_1()-debitar);
                        case 4:
                            menu1();
                            break;
                    }
                    
                    break;
                }   
            case 2:
                while (true){
                    menu2();
                    int no_operacion = result.nextInt();
                    
                    switch ( no_operacion){
                        case 1:
                            System.out.println("El saldo de la Cuenta 2 es: ");
                            System.out.println(cuenta2.getCuenta_2());
                            break;
                        case 2:
                            System.out.println("Digite el valor a acreditar: ");
                            int acreditar=result.nextInt();
                            cuenta1.setCuenta_2(cuenta2.getCuenta_2()+acreditar);
                            break;
                        case 3:
                            System.out.println("Digite el valor a debitar: ");
                            int debitar=result.nextInt();
                            cuenta1.setCuenta_2(cuenta2.getCuenta_2()-debitar);
                        case 4:
                            menu1();
                            break;
                    }
                    break;
                }    
            case 3:
                System.exit(0);
            
        }
    
    }
    public static void main(String[] args) {
        operaciones();
    }

}
