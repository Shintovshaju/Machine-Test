package com.finalmt.app.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.finalmt.app.model.Vender;
import com.finalmt.app.repository.IVenderRepository;


@Service
public class VenderServiceImp implements IVenderService {
	
	@Autowired
	private IVenderRepository venderRepository;

	@Override
	public List<Vender> getAllVenders() {
		return (List<Vender>) venderRepository.findAll();
	}

	@Override
	public Optional<Vender> getVenderByVenderId(Integer venderId) {
		return venderRepository.findById(venderId);
	}

	@Override
	public void addVender(Vender vender) {
		venderRepository.save(vender);
	}

	@Override
	public void updateVender(Vender vender) {
		venderRepository.save(vender);
	}

	@Override
	public void deleteVender(Integer venderId) {
		venderRepository.deleteById(venderId);
	}

}
