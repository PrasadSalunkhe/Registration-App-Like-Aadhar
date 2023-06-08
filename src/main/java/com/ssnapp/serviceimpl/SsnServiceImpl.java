package com.ssnapp.serviceimpl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssnapp.bindingobject.UserRequestBo;
import com.ssnapp.bindingobject.UserResponceBo;
import com.ssnapp.entity.CitizenDataEntity;
import com.ssnapp.repository.SsnRepository;
import com.ssnapp.service.SsnService;

@Service
public class SsnServiceImpl implements SsnService{
	@Autowired
	private SsnRepository ssnRepo;

	@Override
	public String generateSsnNumber(UserRequestBo user) {
		CitizenDataEntity entity=new CitizenDataEntity();
		BeanUtils.copyProperties(user, entity);
		CitizenDataEntity savedEntity = ssnRepo.save(entity);
		if(savedEntity!=null) {
			//generate ssn no;
		}
		return null;
	}

	@Override
	public UserResponceBo verifyCitizenBySSN(Long ssn) {
		Optional<CitizenDataEntity> entity = ssnRepo.findById(ssn);
		UserResponceBo responceObj=new UserResponceBo();
		BeanUtils.copyProperties(entity,responceObj);
		return responceObj;
	}

}
