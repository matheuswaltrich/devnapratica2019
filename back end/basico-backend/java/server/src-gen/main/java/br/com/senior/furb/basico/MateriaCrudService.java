/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Materia.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface MateriaCrudService extends CrudService<MateriaEntity> {
	
	public MateriaEntity createMateria(MateriaEntity toCreate);
	
	@Deprecated
	public MateriaEntity createMergeMateria(MateriaEntity toCreateMerge);
	
	public MateriaEntity updateMateria(MateriaEntity toUpdate);
	
	@Deprecated
	public MateriaEntity updateMergeMateria(MateriaEntity toUpdateMerge);
	
	public void deleteMateria(Id id);
	
	public MateriaEntity retrieveMateria(Id id);
	
	@Deprecated
	public List<MateriaEntity> listMateria(int skip, int top);
	
	public Page<MateriaEntity> listMateriaPageable(int skip, int top);
	
	public Page<MateriaEntity> listMateriaPageable(int skip, int top, String orderBy);
	
	public Page<MateriaEntity> listMateriaPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkMateria(List<MateriaEntity> entities);

	public MateriaBaseRepository getRepository();
	
}
