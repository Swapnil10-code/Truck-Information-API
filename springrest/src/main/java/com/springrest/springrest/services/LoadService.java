package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Load;

public interface LoadService {
     public List<Load> getLoad();
     
     public Load getLoads(String loadId);
    
     public Load addLoad(Load load);

	public void deleteLoad(String loadId);

	public Load adddet(String loadId);
}
