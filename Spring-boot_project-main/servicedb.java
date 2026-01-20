package com.example.RpDatabase.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RpDatabase.Entity.Studata;
import com.example.RpDatabase.Repository.Respo;

@Service
public class servicedb {
	@Autowired
	Respo rd;
	
	public Studata methodservice1(Studata ed) {
		return rd.save(ed);
		
	}
	public List<Studata>methodservice2 (){
		return rd.findAll();
	}
	public Optional<Studata> methodservice3(int s_no){
		return rd.findById(s_no);
	}
	
	public Studata methodservice4(Studata newdata,int id) {
		Studata Olddata= rd.findById(id).orElseThrow(()->new NullPointerException("Id not found"));
		Olddata.setName(newdata.getName());
		Olddata.setDepartment(newdata.getDepartment());
		Olddata.setEmail(newdata.getEmail());
		
		return rd.save(Olddata);
	}
	public String methodservice5(int id) {
		if(rd.existsById(id)) {
			rd.deleteById(id);
			return "Deleted successfully";
			
		}
		else {
			return "id is not found";
		}
	}

}
