package com.locovna.wiiiter.widgets;

import android.annotation.TargetApi;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.widget.RemoteViews;

import com.locovna.wiiiter.R;

public class WeatherNowWidget extends AppWidgetProvider{

  static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                              int appWidgetId) {
    RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.weather_now_widget);

  }

  @Override
  public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    for (int appWidgetId : appWidgetIds) {
      updateAppWidget(context, appWidgetManager, appWidgetId);
    }
    super.onUpdate(context, appWidgetManager, appWidgetIds);
  }

  @Override
  public void onEnabled(Context context) {
  }

  @Override
  public void onDisabled(Context context) {
  }

  @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
  private static void setRemoteAdapter(Context context, @NonNull final RemoteViews views) {
    views.setRemoteAdapter(R.id.weather_degree_view,
        new Intent(context, WidgetService.class));
  }

  @SuppressWarnings("deprecation")
  private static void setRemoteAdapterV11(Context context, @NonNull final RemoteViews views) {
    views.setRemoteAdapter(0, R.id.weather_degree_view,
        new Intent(context, WidgetService.class));
  }

}
