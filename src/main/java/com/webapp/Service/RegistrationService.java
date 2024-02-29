package com.webapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.entity.Registration;
import com.webapp.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;
	
	public void saveRegistration(Registration registration) {
		registrationRepository.save(registration);
	}

	
	public List<Registration> getAllregistrations() {
		List<Registration> regs = registrationRepository.findAll();
		return regs;
	}


	public void deletebyId(long id) {
		
		registrationRepository.deleteById(id);
	}
	
}
