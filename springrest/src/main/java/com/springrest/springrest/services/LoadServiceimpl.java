package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Load;

@Service
public class LoadServiceimpl implements LoadService {

	List<Load> list;
	List<Load> listdel;
	public LoadServiceimpl() {
		list=new ArrayList<>();
		list.add(new Load("Delhi","Jaipur","Chemicals","Canter",1,100,"Should reach",16,"26-08-2022"));
		list.add(new Load("Goa","Jaipur","Soap","Tow Truck",2,120,"Can reach",77,"14-09-2022"));
		list.add(new Load("Chennai","Kanpur","Spices","Pickup",1,100,"Should reach",42,"24-09-2022"));
		list.add(new Load("Kolkata","Delhi","Chemicals","Canter",2,120,"Can reach",102,"5-09-2022"));
			
	}
	
	@Override
	public List<Load> getLoad() {
	
		return list;
	}

	@Override
	public Load getLoads(long loadId) {
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

	
	
	public Load updateLoad(Load load) {
		list.forEach(e ->{
			if (e.getShipperId()==load.getShipperId()) {
				e.setLoadingPoint(e.getLoadingPoint());
				e.setUnloadingPoint(e.getUnloadingPoint());
				e.setProductType(e.getProductType());
				e.setTruckType(e.getTruckType());
				e.setWeight(e.getWeight());
				e.setNoOfTrucks(e.getNoOfTrucks());
				e.setComment(e.getComment());
				e.setDate(e.getDate());
		}
	});
		return load;
	}

	@Override
	public void deleteLoad(long parseLong) {
		list=this.list.stream().filter(e->e.getShipperId()!=parseLong).collect(Collectors.toList());
		
	}

	
	

}
