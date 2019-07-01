/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Aluno.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface AlunoCrudService extends CrudService<AlunoEntity> {
	
	public AlunoEntity createAluno(AlunoEntity toCreate);
	
	@Deprecated
	public AlunoEntity createMergeAluno(AlunoEntity toCreateMerge);
	
	public AlunoEntity updateAluno(AlunoEntity toUpdate);
	
	@Deprecated
	public AlunoEntity updateMergeAluno(AlunoEntity toUpdateMerge);
	
	public void deleteAluno(Id id);
	
	public AlunoEntity retrieveAluno(Id id);
	
	@Deprecated
	public List<AlunoEntity> listAluno(int skip, int top);
	
	public Page<AlunoEntity> listAlunoPageable(int skip, int top);
	
	public Page<AlunoEntity> listAlunoPageable(int skip, int top, String orderBy);
	
	public Page<AlunoEntity> listAlunoPageable(int skip, int top, String orderBy, String filter);
	
	public Page<AlunoEntity> listAlunoPageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkAluno(List<AlunoEntity> entities);

	public AlunoBaseRepository getRepository();
	
}
