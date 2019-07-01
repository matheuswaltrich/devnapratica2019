/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Turma.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface TurmaCrudService extends CrudService<TurmaEntity> {
	
	public TurmaEntity createTurma(TurmaEntity toCreate);
	
	@Deprecated
	public TurmaEntity createMergeTurma(TurmaEntity toCreateMerge);
	
	public TurmaEntity updateTurma(TurmaEntity toUpdate);
	
	@Deprecated
	public TurmaEntity updateMergeTurma(TurmaEntity toUpdateMerge);
	
	public void deleteTurma(Id id);
	
	public TurmaEntity retrieveTurma(Id id);
	
	@Deprecated
	public List<TurmaEntity> listTurma(int skip, int top);
	
	public Page<TurmaEntity> listTurmaPageable(int skip, int top);
	
	public Page<TurmaEntity> listTurmaPageable(int skip, int top, String orderBy);
	
	public Page<TurmaEntity> listTurmaPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkTurma(List<TurmaEntity> entities);

	public TurmaBaseRepository getRepository();
	
}
