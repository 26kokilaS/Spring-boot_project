package com.example.RpDatabase.RpController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RpDatabase.Entity.Studata;
import com.example.RpDatabase.Service.servicedb;

@RequestMapping("/welcome")
@RestController("/rpcollege")
public class ControllerRp {
    @Autowired
	servicedb  sr;
    @PostMapping("/postdata")
public Studata method1(@RequestBody Studata ed) {
	return sr.methodservice1(ed);
	}
	
	@GetMapping("/getss")
	public List<Studata> method2(){
		return sr.methodservice2();
	}
	 @GetMapping("gets/{ids}")
	 public Optional<Studata> getDataById(@PathVariable("ids")int ids){
		return sr.methodservice3(ids);
	 }
	 @DeleteMapping("/delete/{del}")
	 public String method4 (@PathVariable(value="del")int id){
		 return sr.methodservice5(id);
	 }
	 @PutMapping("/update/{data}")
	 public Studata method3( @RequestBody Studata edd,@PathVariable(value="data")int id) {
		 return sr.methodservice4(edd,id);
}
	 }