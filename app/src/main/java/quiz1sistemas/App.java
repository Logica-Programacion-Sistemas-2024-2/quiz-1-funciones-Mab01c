package quiz1sistemas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int ValorCombo1 = 40000;
        int ValorCombo2 = 30000;
        int ValorCombo3 = 42000;
        
        int CostoBoletaGeneral = 10000;
        int CostoBoletaVip = 15000;
        int CantidadBoletas = 0;
        int CantidadCombos = 0;
        int BoletaSeleccionada = 0;

        Scanner sc = new Scanner(System.in);

     System.out.println("Combos Disponibles:   1. Combo #1: Hamburguesa y Perro caliente - Valor $ 40.000" + 
        "2. Combo #2: Crispetas con dos Gaseosas - Valor $ 30.000" + 
        "3. Combo #3: Dos Perros calientes con Dos Gaseosas - Valor $ 42.000"); 
       


    System.out.println("Ingrese el numero de Combo seleccionado (1,2,3): ");
        int ComboSeleccionado = sc.nextInt();

        System.out.println("Combo seleccionado: " + ComboSeleccionado);

    System.out.println("Ingrese la cantidad de Combos: ");
         CantidadCombos = sc.nextInt();

    System.out.println("Numero de Combos " + CantidadCombos);

    int ValorNetoCombo = calcularValorNetoCombo(ComboSeleccionado, ValorCombo1, ValorCombo2, ValorCombo3, CantidadCombos);
    System.out.println("Valor de Combo Neto: " + calcularValorNetoCombo(ComboSeleccionado, ValorCombo1, ValorCombo2, ValorCombo3, CantidadCombos));

         



System.out.println("Boletas Disponibles: G: General- Valor $ 10.000 ------------- V: VIP - Valor $ 15.000" );
System.out.println("Ingrese el Tipo de Boleta (1:G o 2:V): ");

BoletaSeleccionada = sc.nextInt();

System.out.println("Boleta seleccionada: " + BoletaSeleccionada);

System.out.println("Ingrese la cantidad de Boletas: ");
         CantidadBoletas = sc.nextInt();

        System.out.println("Numero de Boletas " + CantidadBoletas);

System.out.println("Valor de Boletas: " + calcularValorBoleta(BoletaSeleccionada, CostoBoletaGeneral, CostoBoletaVip, CantidadBoletas));

    


    
        
    }

    public static int calcularValorBoleta( int BoletaSeleccionada, int CostoBoletaGeneral, int CostoBoletaVip,int CantidadBoletas ){
        try {
            int ValorBoleta = 0;

            switch (BoletaSeleccionada){
                case 1:
                    ValorBoleta = (int)(CostoBoletaGeneral * CantidadBoletas);
                    break;
                case 2:
                    ValorBoleta = (int)(CostoBoletaVip * CantidadBoletas);
                    break;
                
            }

            return ValorBoleta;

        } catch (Exception e) {
            return -1;
        }
    }

    public static int calcularValorNetoCombo( int ComboSeleccionado, int ValorCombo1, int ValorCombo2, int ValorCombo3,int CantidadCombos ){
        try {
            int calcularValorNetoCombo = 0;

            switch (ComboSeleccionado){
                case 1:
                calcularValorNetoCombo = (int)(ValorCombo1 * CantidadCombos);
                    break;
                case 2:
                calcularValorNetoCombo = (int)(ValorCombo2 * CantidadCombos);
                    break;
                case 3:
                calcularValorNetoCombo = (int)(ValorCombo3 * CantidadCombos);
                    break;
                
            }

            return calcularValorNetoCombo;

        } catch (Exception e) {
            return -1;
        }
    }

    public static int calcularDescuentoCombo( int ValorNetoCombo, int BoletaSeleccionada, int ComboSeleccionado){
        try {
            int calcularDescuentoCombo = 0;
            if (BoletaSeleccionada=2) {

                switch (ComboSeleccionado){
                    case 1:
                    calcularDescuentoCombo = (float)(ValorNetoCombo * 0.5);
                        break;
                    case 2:
                    calcularDescuentoCombo = (float)(ValorNetoCombo * 0.6);
                        break;
                    case 3:
                    calcularDescuentoCombo = (float)(ValorNetoCombo * 0.3);
                        break;
                    
                }
                
            } else {
                
            }

            

            return calcularDescuentoCombo;

        } catch (Exception e) {
            return -1;
        }
    }



    /*  Implemente una funcion llamada calcularValorBoleta que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero que representa la cantidad de boletas compradas
        * Retorna:
            - Un entero representando el valor total de las boletas
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorNetoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el numero de combo selecciondo
            - Un entero representando la cantidad de combos comprados
        * Retorna:
            - Un entero representando el valor neto del combo
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularDescuentoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero representando el valor neto del combo
        * Retorna:
            - Un entero representando el valor del descuento
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor neto del combo
            - Un entero representando el valor de las boletas
            - Un entero representando el valor del descuento del combo
        * Retorna:
            - Un entero representando el valor total de la factura
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------
}
