package app.organicmaps.sdk.routing;

import androidx.annotation.DrawableRes;
import app.organicmaps.sdk.R;

public enum TransitStepType
{
  // The order MUST match the native enum transit::TransitType
  // (libs/map/transit/transit_display.hpp): TransitStepInfo maps the native type to this enum via
  // values()[ordinal]. Bus/tram/etc. routes used to crash here because these entries were missing
  // (ArrayIndexOutOfBoundsException). RULER is Java-only, never produced from a native ordinal, so
  // it stays last.
  // A specific icon for different intermediate points is calculated dynamically in TransitStepView.
  INTERMEDIATE_POINT(R.drawable.ic_20px_route_planning_walk),
  PEDESTRIAN(R.drawable.ic_20px_route_planning_walk),
  SUBWAY(R.drawable.ic_20px_route_planning_metro),
  TRAIN(R.drawable.ic_20px_route_planning_train),
  LIGHT_RAIL(R.drawable.ic_20px_route_planning_lightrail),
  MONORAIL(R.drawable.ic_20px_route_planning_monorail),
  // Reuse existing sdk-module drawables (the app-module ic_category_* are not visible here).
  TRAM(R.drawable.ic_20px_route_planning_lightrail),
  BUS(R.drawable.ic_20px_route_planning_train),
  FERRY(R.drawable.ic_20px_route_planning_train),
  CABLE_TRAM(R.drawable.ic_20px_route_planning_lightrail),
  AERIAL_LIFT(R.drawable.ic_20px_route_planning_train),
  FUNICULAR(R.drawable.ic_20px_route_planning_train),
  TROLLEYBUS(R.drawable.ic_20px_route_planning_train),
  AIR_SERVICE(R.drawable.ic_20px_route_planning_train),
  WATER_SERVICE(R.drawable.ic_20px_route_planning_train),
  RULER(R.drawable.ic_ruler_route);

  @DrawableRes
  private final int mDrawable;

  TransitStepType(@DrawableRes int drawable)
  {
    mDrawable = drawable;
  }

  @DrawableRes
  public int getDrawable()
  {
    return mDrawable;
  }
}
