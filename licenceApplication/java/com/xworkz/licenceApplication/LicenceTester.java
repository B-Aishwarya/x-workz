package com.xworkz.licenceApplication;

import java.sql.DatabaseMetaData;
import java.util.Date;

import com.xworkz.licenceApplication.constants.BloodGroup;
import com.xworkz.licenceApplication.constants.Gender;
import com.xworkz.licenceApplication.constants.IdProof;
import com.xworkz.licenceApplication.constants.VehicleType;
import com.xworkz.licenceApplication.dao.LicenceDAO;
import com.xworkz.licenceApplication.dao.LicenceDAOImple;
import com.xworkz.licenceApplication.dto.AddressDTO;
import com.xworkz.licenceApplication.dto.CommonDTO;
import com.xworkz.licenceApplication.dto.LicenceDTO;


public class LicenceTester {

	public static void main(String[] args) {
		Date date = new Date();
		AddressDTO addressDTO = new AddressDTO("jalajashree", "petabana", "laxmeshwar", 582116);
		CommonDTO dto = new CommonDTO(22, date, addressDTO, BloodGroup.B_POSITIVE, Gender.MALE);
		LicenceDTO licenceDTO = new LicenceDTO("6756 9876 6784", VehicleType.TWO_WHEELER, date);
		System.out.println("Address of licence applicant is  " + addressDTO);
		System.out.println("detailes of applicant is " + dto);
		System.out.println("licence in fo applicant is " + licenceDTO);

		LicenceDAO dao = new LicenceDAOImple();
		dao.save(licenceDTO);
		LicenceDTO dtoFound = dao.findByIdProofNo("6756 9876 6784");
		System.out.println(dtoFound);

		boolean updated = dao.updateVehicleTypeByIdProofNo("6756 9876 6784", VehicleType.FOUR_WHEELER);
		System.out.println("updated " + updated);

		LicenceDTO dtoafterUpdate = dao.findByIdProofNo("6756 9876 6784");
		System.out.println(dtoafterUpdate);
		
		LicenceDTO deleted=dao.findByIdProofNo("6756 9876 6784");
		System.out.println("deleted"+deleted);
		dao.deleteByIdProofNo("6756 9876 6784");
		

	}

}
