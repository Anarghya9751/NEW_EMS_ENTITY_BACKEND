package com.ems.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dto.BranchDTO;
import com.ems.dto.DepartmentDTO;
import com.ems.dto.DesignationDTO;
import com.ems.dto.OrganizationDTO;

@Service
public class HierarchyImpl implements Hierarchy {

	@Autowired
	OrganizationRepo orRepo;

	@Autowired
	BranchRepo brRepo;

	@Autowired
	DepartmentRepo dtRepo;

	@Autowired
	DesignationRepo dnRepo;

	@Override
	public OrganizationDTO getOrganisationDetails(Long id) {
		Organization org = orRepo.findById(id).get();
		List<Brach> brList = brRepo.findAll();
		List<Department> dtList = dtRepo.findAll();
		List<Designation> dnList = dnRepo.findAll();

		OrganizationDTO orgDTO = new OrganizationDTO();
		orgDTO.setName(org.getName());

		for (Branch br : brList) {
			if (br.getParentOrg().equals(org.getName())) {
				BranchDTO brDTO = new BranchDTO();
				brDTO.setName(br.getBranchName());
				for (Department dt : dtList) {
					if (dt.getParentBranch().equals(br.getBranchName())) {
						DepartmentDTO dtDTO = new DepartmentDTO();
						dtDTO.setName(dt.getDepartmentName());
						for (Designation dn : dnList) {
							if (dn.getParentDepartment().equals(dt.getDepartmentName())) {
								DesignationDTO dnDTO = new DesignationDTO();
								dnDTO.setName(dn.getDesignationName());
								dtDTO.getRoles().add(dnDTO);
							}
						}
						brDTO.getDepartments().add(dtDTO);
					}
				}
				orgDTO.getBranches().add(brDTO);
			}
		}
		return orgDTO;
	}
}
