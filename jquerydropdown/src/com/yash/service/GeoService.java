package com.yash.service;



import java.util.Set;

import com.yash.form.City;
import com.yash.form.State;

public interface GeoService {

	public Set<State> findAllStates();

	public Set<City> findCitiesForState(String state);

}
