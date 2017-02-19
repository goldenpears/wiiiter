package com.locovna.wiiiter.controller;

import android.support.v4.app.Fragment;

public class WeatherActivity extends SingleFragmentActivity {
  @Override
  protected Fragment createFragment() {
    return new WeatherNowFragment();
  }
}
