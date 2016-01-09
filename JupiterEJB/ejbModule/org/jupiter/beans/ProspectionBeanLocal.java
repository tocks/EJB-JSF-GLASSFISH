package org.jupiter.beans;

import java.util.List;

import javax.ejb.Local;

import org.jupiter.entities.Prospection;

@Local
public interface ProspectionBeanLocal {
	
	public void addProspection(Prospection prospect);

	public Prospection findProspection(int id);

	public void updateProspection(Prospection prospect);

	public void deleteProspectio(Prospection prospect);

	public List<Prospection> findAllProsectons();


}
