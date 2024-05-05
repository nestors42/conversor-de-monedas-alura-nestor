package com.nestorproyecto.consumoDeApi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nestorproyecto.menuConversor.Moneda;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRequest {
    public Moneda ApiRequest(String monedaPrincipal, String monedaAconvertir) throws IOException, InterruptedException {

        String direccion = "https://v6.exchangerate-api.com/v6/fc38d7ba5a6e0467786db380/pair/"+ monedaPrincipal + "/"+ monedaAconvertir;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());



        Gson gson = new GsonBuilder().create();
        return gson.fromJson(response.body(), Moneda.class);
    }
}
