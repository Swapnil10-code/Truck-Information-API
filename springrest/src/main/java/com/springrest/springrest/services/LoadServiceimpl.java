package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Load;

@Service
public class LoadServiceimpl implements LoadService {

	List<Load> list;
	List<Load> listdel;
	public LoadServiceimpl() {
		list=new ArrayList<>();
		list.add(new Load("Delhi","Jaipur","Chemicals","Canter",1,100,"Should reach","shipper:UU42","14-03-2022"));
		list.add(new Load("Goa","Jaipur","Chemicals","Canter",2,120,"Can reach","shipper:UU77","14-03-2021"));
	}
	
	@Override
	public List<Load> getLoad() {
	
		return list;
	}

	@Override
	public Load getLoads(String loadId) {
		Load c=null;
		for(Load load:list) {
			if(load.getShipperId()==loadId) {
				c=load;
				break;
			}
		}
		return c;
	}

	@Override
	public Load addLoad(Load load) {
		list.add(load);
		return load;
	}

	@Override
	public void deleteLoad(String loadId) {
		for(Load load:list) {
			if(load.getShipperId()!=loadId) {
				listdel.add(load);
			}
		}
		this.list=listdel;
	}
	
	public Load adddet(String loadId) {
		Load c=null;
		for(Load load:list) {
			if(load.getShipperId()==loadId) {
				load.setLoadingPoint("Alwar");
				load.setUnloadingPoint("Jaipur");
				load.setProductType("Chemicals");
				load.setTruckType("Canter");
				load.setNoOfTrucks(1);
				load.setWeight(100);
				load.setDate("14-03-2022");
				
			}
		
	}
		return c;
	}
	

}
