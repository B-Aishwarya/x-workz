package com.xworkz.licenceApplication.dao;

import com.xworkz.licenceApplication.constants.VehicleType;
import com.xworkz.licenceApplication.dto.LicenceDTO;

public interface LicenceDAO {
void save(LicenceDTO dto);
	
LicenceDTO findByIdProofNo(String idProofNo);
	
	boolean updateVehicleTypeByIdProofNo(String idProof,VehicleType type);
	
	boolean deleteByIdProofNo(String idPrrof);

}
