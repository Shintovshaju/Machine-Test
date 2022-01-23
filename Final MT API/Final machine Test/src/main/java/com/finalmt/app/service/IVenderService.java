package com.finalmt.app.service;

import java.util.List;
import java.util.Optional;

import com.finalmt.app.model.Vender;

public interface IVenderService {
	
	public List<Vender> getAllVenders();

	public Optional<Vender> getVenderByVenderId(Integer venderId);

	public void addVender(Vender vender);

	public void updateVender(Vender vender);

	public void deleteVender(Integer venderId);

}
