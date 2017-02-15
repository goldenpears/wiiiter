package com.locovna.wiiiter.widgets;


import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import android.widget.TextView;

import com.locovna.wiiiter.R;

import butterknife.BindView;

public class WidgetDataProvider implements RemoteViewsService.RemoteViewsFactory {

  public static final String TAG = WidgetDataProvider.class.getSimpleName();

  @BindView(R.id.weather_degree_view) TextView degreeView;
  @BindView(R.id.weather_state_view) TextView stateView;

  Context mContext = null;

  public WidgetDataProvider(Context context, Intent intent) {
    mContext = context;
  }

  @Override
  public void onCreate() {
    initData();
  }

  @Override
  public void onDataSetChanged() {
    initData();
  }

  @Override
  public void onDestroy() {

  }

  @Override
  public int getCount() {
    return 0;
  }

  @Override
  public RemoteViews getViewAt(int position) {
    RemoteViews view = new RemoteViews(mContext.getPackageName(),
        R.layout.weather_now_widget);
    view.setTextViewText(R.id.weather_degree_view, "set test view");
    return view;
  }

  @Override
  public RemoteViews getLoadingView() {
    return null;
  }

  @Override
  public int getViewTypeCount() {
    return 1;
  }

  @Override
  public long getItemId(int position) {
    return position;
  }

  @Override
  public boolean hasStableIds() {
    return true;
  }

  private void initData() {
    degreeView.setText("init degree");
    stateView.setText("init state");
  }

}
