package com.example.dhwani_android.google_directions;

import java.util.List;

/**
 * Created by DHWANI-ANDROID on 24-05-17.
 */

public interface Parser {
    List<Route> parse() throws RouteException;
}