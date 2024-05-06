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
            String realesBr = "BRL";
            String pesosCol = "COP";


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
                    System.out.println("Coloca el monto de dolares para convertir a pesos Argentinos");
                    cantidad = teclado.nextDouble();
                    Moneda moneda = apiRequest.ApiRequest(dolar, pesoArg);
                    System.out.println("La cantidad convertida es: $"+ moneda.getConvertionRate() * cantidad);
                    break;
                case 2:
                    System.out.println("Coloca el monto en pesos Argentinos para convertir a dolares");
                    cantidad = teclado.nextDouble();
                    moneda = apiRequest.ApiRequest(pesoArg, dolar);
                    System.out.println("La cantidad convertida es: $"+moneda.getConvertionRate() / cantidad);
                    break;
                case 3:
                    System.out.println("Coloca el monto en Reales para convertir a dolares");
                    cantidad = teclado.nextDouble();
                    moneda = apiRequest.ApiRequest(dolar, realesBr);
                    System.out.println("La cantidad convertida es: $"+moneda.getConvertionRate() * cantidad);
                    break;
                case 4:
                    System.out.println("Coloca el monto en dolares para convertir a Reales");
                    cantidad = teclado.nextDouble();
                    moneda = apiRequest.ApiRequest(realesBr, dolar);
                    System.out.println("La cantidad convertida es: $"+moneda.getConvertionRate() / cantidad);
                    break;
                case 5:
                    System.out.println("Coloca el monto en dolares para convertir a pesos Colombianos");
                    cantidad = teclado.nextDouble();
                    moneda = apiRequest.ApiRequest(dolar, pesosCol);
                    System.out.println("La cantidad convertida es: $"+moneda.getConvertionRate() * cantidad);
                    break;
                case 6:
                    System.out.println("Coloca el monto en pesos Colombianos para convertir a dolares");
                    cantidad = teclado.nextDouble();
                    moneda = apiRequest.ApiRequest(pesosCol, dolar);
                    System.out.println("La cantidad convertida es: $"+moneda.getConvertionRate() / cantidad);
                    break;
                default:
                    System.out.println("opcion no valida, coloque una opcion del 1 al 7");
            }
            }







    }





}
