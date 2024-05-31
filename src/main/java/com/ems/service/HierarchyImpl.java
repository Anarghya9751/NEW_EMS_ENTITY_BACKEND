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
	public List<OrganizationDTO> getOrganisationsDetails() {

		List<Organization> orgList = orRepo.findAll();
		List<Brach> brList = brRepo.findAll();
		List<Department> dtList = dtRepo.findAll();
		List<Designation> dnList = dnRepo.findAll();

		List<OrganizationDTO> orgDTOList = new ArrayList<OrganizationDTO>();

		for (Organization org : orgList) {
			OrganizationDTO orgDTO = new OrganizationDTO();
			orgDTO.setName(org.getName());

			for (Branch br : brList) {

				if (br.parentOrg == org.getName()) {
					BranchDTO brDTO = new BranchDTO();
					brDTO.setName(br.branchName);

					for (Department dt : dtList) {

						if (dt.parentBranch == br.branchName) {

							DepartmentDTO dtDTO = new DepartmentDTO();
							dtDTO.setName(dt.departmentName);

							for (Designation dn : dnList) {

								if (dn.parentDepartment == dt.departmentName) {

									DesignationDTO dnDTO = new DesignationDTO();
									dnDTO.setName(dn.designationName);
									dtDTO.getRoles().add(dnDTO);
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
