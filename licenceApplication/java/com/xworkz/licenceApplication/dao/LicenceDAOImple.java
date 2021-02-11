package com.xworkz.licenceApplication.dao;
import com.xworkz.licenceApplication.dao.LicenceDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;
import com.xworkz.licenceApplication.constants.VehicleType;
import com.xworkz.licenceApplication.dto.LicenceDTO;


public class LicenceDAOImple implements LicenceDAO {

	private List<LicenceDTO> database;

	public LicenceDAOImple() {
		this.database = new ArrayList<LicenceDTO>();
	}

	@Override
	public void save(LicenceDTO dto) {
		System.out.println("invoked save in license dao impl");
		System.out.println("dto to save" + dto);
		boolean saved = this.database.add(dto);
		if (saved)
			System.out.println("dto is saved");
		else
			System.out.println("dto is not saved");
	}

	@Override
	public LicenceDTO findByIdProofNo(String idProofNo) {
		System.out.println("invoked findByIdProofNo");
		System.out.println("idProofNo:" + idProofNo);
		for (LicenceDTO licencedto : this.database) {
			String idProofFromDTO =licencedto.getIdProof();
			if (idProofFromDTO.equals(idProofNo)) {
				System.out.println("license found");
				return licencedto;
			}
		}
		return null;
	}

	@Override
	public boolean updateVehicleTypeByIdProofNo(String idProof, VehicleType type) {
		System.out.println("invoked updateVehicleTypeByIdProofNo");
		System.out.println("idProof:" + idProof);
		System.out.println("type:" + type);
		LicenceDTO dtoFromDB = this.findByIdProofNo(idProof);
		if (dtoFromDB != null) {
			System.out.println("can update , license is found");
			dtoFromDB.setVehicleType(type);
			return true;
		} else {
			System.out.println("cannot update , license not found");
		}
		return false;
	}

	@Override
	public boolean deleteByIdProofNo(String idProof) {
		System.out.println("invoked delet by id proof");
		System.out.println("idProof"+idProof);
		LicenceDTO dto=this.findByIdProofNo(idProof);
		if(dto!=null) {
			this.database.remove(dto);
		}return false;
		
	
	}

	
}

