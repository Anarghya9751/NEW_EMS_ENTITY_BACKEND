package com.ems.service;

public class HierarchyImpl implements Hierarchy {
	
	@Autowired
	OrganizationRepo orRepo;
	
	@Autowired
	BranchRepo brRepo;
	
	@Autowired
	DepartmentRepo dtRepo;
	
	@Autowired
	DesignationRepo dnRepo;
	
	
	
	public  List<OrganizationDTO> getOrganisationsDetails() {
		
		List<Organization> orgList = orRepo.findAll();
		List<Brach> brList = brRepo.findAll();
		List<Department> dtList = dtRepo.findAll();
		List<Designation> dnList = dnRepo.findAll();

		List<OrganizationDTO> orgDTOList = new ArrayList<OrganizationDTO>();

		String orgName = "";
		for(Organization org : orgList) {
			OrganizationDTO orgDTO = new 	OrganizationDTO();
			orgName = org.getName();
			orgDTO.setName(orgName);
			
			for(Branch br : brList) {
				
				if(br.parentOrg == orgName) {
					BranchDTO brDTO = new BranchDTO();
					brDTO.setName(br.branchName);
					
					for(Department dt: dtList) {
						
						if(dt.parentBranch == br.branchName) {
							
							DepartmentDTO dtDTO = new DepartmentDTO();
							dtDTO.setName(dt.departmentName);
							
							for(Designation dn: dnList) {
								
								if(dn.parentDepartment == dt.departmentName) {
									
									DesignationDTO dnDTO = new DesignationDTO();
									dnDTO.setName(dn.designationName);
									dtDTO.getDesignations().add(dnDTO);
								}
								
							}
							
							brDTO.getDepartments().add(dtDTO);
							
							
						}
						
						
					}
					
					orgDTO.getBranches().add(brDTO);	
				}
			}
			orgDTOList.add(orgDTO);
		}
		return orgDTOList;
	}


}
