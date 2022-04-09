package com.company;

public enum Country {
    POLAND("Polish", "612", 1525.0),
    ALBANIA("Albanian", "008", 42.594),
    ANGOLA("Portuguese", "024", 213.034),
    COLOMBIA("Spanish", "170", 827.662),
    USA("English","111",24800.0);

    final String language;
    final String countryCode;
    final Double GDPinUSD;

    private Country(String language, String countryCode, Double GDPinUSD) {
        this.language = language;
        this.countryCode = countryCode;
        this.GDPinUSD = GDPinUSD;
    }
    public Double getGDPinPLN(){
        return this.GDPinUSD*4.27;
    }
}
