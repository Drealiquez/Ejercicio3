

package com.mycompany.ejercicio_3;

public class Ejercicio_3 {

 private int cuenta_1;
 private int cuenta_2;

 
  public static void menu1() {
      System.out.println("____________________________");
      System.out.println("| Selecciona la cuenta     |");
      System.out.println("| que deseas afectar       |");
      System.out.println("|         ----             |");
      System.out.println("| 1. Cuenta 1              |");
      System.out.println("| 2. Cuenta 2              |");
      System.out.println("| 3. Salir                 |");
      System.out.println("|         ----             |");
      System.out.println("____________________________");
}
  public static void menu2() {
      System.out.println("____________________________");
      System.out.println("| Selecciona la operacion  |");
      System.out.println("| que deseas Realizar      |");
      System.out.println("|         ----             |");
      System.out.println("| 1. Mostrar saldo         |");
      System.out.println("| 2. Sumar saldo           |");
      System.out.println("| 3. Resatar saldo         |");
      System.out.println("| 4. Salir                 |");
      System.out.println("|         ----             |");
      System.out.println("____________________________");
}

    public int getCuenta_1() {
        return cuenta_1;
    }

    public void setCuenta_1(int cuenta_1) {
        this.cuenta_1 = cuenta_1;
    }

    public int getCuenta_2() {
        return cuenta_2;
    }

    public void setCuenta_2(int cuenta_2) {
        this.cuenta_2 = cuenta_2;
    }




        

        
    
}
