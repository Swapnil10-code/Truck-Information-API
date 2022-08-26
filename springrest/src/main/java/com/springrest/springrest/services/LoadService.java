package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Load;

public interface LoadService {
     public List<Load> getLoad();
     
     public Load getLoads(long loadId);
    
     public Load addLoad(Load load);

	public void deleteLoad(long loadId);

	public Load updateLoad(Load load);
}
