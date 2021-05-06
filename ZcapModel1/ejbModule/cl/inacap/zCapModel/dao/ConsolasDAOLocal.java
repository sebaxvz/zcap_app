package cl.inacap.zCapModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.zCapModel1.dto.Consola;

@Local
public interface ConsolasDAOLocal {
	
	void save(Consola consola);
	List<Consola> getAll();
	void delete(Consola consola);
	List<Consola> filterByNAme(String nombre);
	
	

}
