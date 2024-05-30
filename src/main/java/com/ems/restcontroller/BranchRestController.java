package com.ems.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.BranchEntity;
import com.ems.services.BranchServices;

@RestController
public class BranchRestController {

			
		@Autowired
		
		private BranchServices services;
		
		@PostMapping("/save")
		public ResponseEntity<String>   saveBranchData (@RequestBody BranchEntity entity){
			Boolean  status = services.saveBranch(entity);
			
			
			if(status) {
				return new ResponseEntity<String>("Branch  save successfully",HttpStatus.CREATED);
			}
		     return new ResponseEntity<String>("Branch is not save successfully",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		@PutMapping("/update/{branchId}")
		public ResponseEntity<String> updateBranchData(@RequestBody BranchEntity branch ,@PathVariable Long branchId){
			Boolean  status = services.updateBranch(branch, branchId);
			if(status) {
				return new ResponseEntity<String>("Branch updated successfully" , HttpStatus.CREATED);
			}
			return new ResponseEntity<String>("Branch not updated successfully", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		  
	      
		
	

}
