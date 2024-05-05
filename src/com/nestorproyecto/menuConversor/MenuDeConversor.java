package com.nestorproyecto.menuConversor;

import com.nestorproyecto.consumoDeApi.ApiRequest;

import java.io.IOException;
import java.util.Scanner;

public class MenuDeConversor {
        public static void main(String[] args) throws IOException, InterruptedException {
            Scanner teclado = new Scanner(System.in);
            double cantidad;
            int opcion = 0;
            String dolar = "USD";
            String pesoArg = "ARS";


            ApiRequest apiRequest = new ApiRequest();


            String menu = """
                    ****************************************************
                    Sea bienvenido/a al conversor de monedas

                    1) Dólar => Peso Argentino
                    2) Peso Argentino => Dólar
                    3) Dólar => Real Brasileño
                    4) Real Brasileño => Dólar
                    5) Dólar => Peso Colombiano
                    6) Peso Colombiano => Dólar
                    7) Salir

                    Elija una opcion válida:
                    """;
//            realizo un loop para que el menu aparezca si no le doy salir

            while (opcion != 7){
                System.out.println(menu);
                opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("que cantidad deseas convertir");
                    cantidad = teclado.nextDouble();
                    Moneda moneda = apiRequest.ApiRequest(dolar, pesoArg);
                    System.out.println(moneda.getConvertionRate() * cantidad);

            }
            }







    }





}
