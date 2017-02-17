package com.locovna.wiiiter.controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.locovna.wiiiter.R;
import com.locovna.wiiiter.model.Weather;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Darina Locovna on 2/5/17
 */

public class WeatherNowFragment extends Fragment {
  private Weather weather;

  @BindView(R.id.weather) TextView weatherNow;

  @Override
  public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    weather = new Weather("Today is hot wiiiter!");
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState){
    View v = inflater.inflate(R.layout.fragment_weather_now, container, false);
    ButterKnife.bind(this, v);
    weatherNow.setText(weather.getWeather());
    return v;
  }
}
