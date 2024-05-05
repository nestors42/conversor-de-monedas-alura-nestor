package com.nestorproyecto.menuConversor;

import com.google.gson.annotations.SerializedName;

public class Moneda {
//  creo las propiedades que tiene una moneda
    @SerializedName("base_code")
    private String baseCode;
    @SerializedName("target_code")
    private String targetCode;
    @SerializedName("conversion_rate")
    private double convertionRate;


// creo el constructor


    public Moneda(String baseCode, String targetCode, double convertionRate) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.convertionRate = convertionRate;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public double getConvertionRate() {
        return convertionRate;
    }
}
