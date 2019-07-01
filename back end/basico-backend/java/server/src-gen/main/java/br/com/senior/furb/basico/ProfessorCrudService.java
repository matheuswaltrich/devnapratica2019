/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Professor.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface ProfessorCrudService extends CrudService<ProfessorEntity> {
	
	public ProfessorEntity createProfessor(ProfessorEntity toCreate);
	
	@Deprecated
	public ProfessorEntity createMergeProfessor(ProfessorEntity toCreateMerge);
	
	public ProfessorEntity updateProfessor(ProfessorEntity toUpdate);
	
	@Deprecated
	public ProfessorEntity updateMergeProfessor(ProfessorEntity toUpdateMerge);
	
	public void deleteProfessor(Id id);
	
	public ProfessorEntity retrieveProfessor(Id id);
	
	@Deprecated
	public List<ProfessorEntity> listProfessor(int skip, int top);
	
	public Page<ProfessorEntity> listProfessorPageable(int skip, int top);
	
	public Page<ProfessorEntity> listProfessorPageable(int skip, int top, String orderBy);
	
	public Page<ProfessorEntity> listProfessorPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkProfessor(List<ProfessorEntity> entities);

	public ProfessorBaseRepository getRepository();
	
}
