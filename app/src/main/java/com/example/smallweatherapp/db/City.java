package com.example.smallweatherapp.db;

public class City {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceID;
    public int getId(){
        return  id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCityName(){
        return  cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProvinceID(){
        return provinceID;
    }
    public void setProvinceID(){
        this.provinceID=provinceID;
    }
}
