package com.ems.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.BranchEntity;
import com.ems.service.BranchService;

@RestController
public class BranchRestControll {
	
	@Autowired
	private BranchService Service;
	
	@PostMapping("/come")
	public ResponseEntity<String> SaveEms(@RequestBody BranchEntity entity){
		Boolean Status = Service.SaveEms(entity);
		if(Status) {
			return new ResponseEntity<String>("Data saved successfully",HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("user not save successfully",HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@GetMapping("/gett/{BranchId}")
	public ResponseEntity<BranchEntity>getBranchbyId(@PathVariable Long BranchId){
		BranchEntity branch = Service.getBranchbyId(BranchId);
		return new ResponseEntity<BranchEntity>(branch,HttpStatus.OK);
	}
	
	@DeleteMapping("/went/{BranchId}")
	public ResponseEntity<String>deleteById(@PathVariable Long BranchId){
		String deleteById = Service.deleteById(BranchId);
		if(deleteById.equals("delete")) {
			return new ResponseEntity<String>("deleted successfully",HttpStatus.OK);
		}else if(deleteById.equals(" not deleted")) {
		return new ResponseEntity<String>("Not deleted successfully",HttpStatus.OK);
	}
	
	return new ResponseEntity<String>("User not found",HttpStatus.OK);
	}
}
