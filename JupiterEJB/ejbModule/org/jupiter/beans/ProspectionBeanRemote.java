package org.jupiter.beans;

import java.util.List;

import javax.ejb.Remote;

import org.jupiter.entities.Prospection;

@Remote
public interface ProspectionBeanRemote {
	
	public void addProspection(Prospection prospect);

	public Prospection findProspection(int id);

	public void updateProspection(Prospection prospect);

	public void deleteProspectio(Prospection prospect);

	public List<Prospection> findAllProsectons();


}
