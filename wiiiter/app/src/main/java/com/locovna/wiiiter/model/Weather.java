package com.locovna.wiiiter.model;

/**
 * Created by Darina Locovna on 2/5/17
 */

public class Weather {
  private String mWeather;

  public Weather(String weather){
    mWeather = weather;
  }

  public String getWeather() {
    return mWeather;
  }

  public void setWeather(String weather) {
    mWeather = weather;
  }
}
