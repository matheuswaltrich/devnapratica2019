/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.concurrent.CompletableFuture;

import br.com.senior.furb.basico.HelloWorldInput;
import br.com.senior.furb.basico.HelloWorldOutput;
import br.com.senior.furb.basico.GetMetadataInput;
import br.com.senior.furb.basico.GetMetadataOutput;
import br.com.senior.furb.basico.ImportAlunoInput;
import br.com.senior.furb.basico.ImportAlunoOutput;
import br.com.senior.furb.basico.ExportAlunoInput;
import br.com.senior.furb.basico.ExportAlunoOutput;
import br.com.senior.furb.basico.ImportProfessorInput;
import br.com.senior.furb.basico.ImportProfessorOutput;
import br.com.senior.furb.basico.ExportProfessorInput;
import br.com.senior.furb.basico.ExportProfessorOutput;
import br.com.senior.furb.basico.ImportMateriaInput;
import br.com.senior.furb.basico.ImportMateriaOutput;
import br.com.senior.furb.basico.ExportMateriaInput;
import br.com.senior.furb.basico.ExportMateriaOutput;
import br.com.senior.furb.basico.ImportTurmaInput;
import br.com.senior.furb.basico.ImportTurmaOutput;
import br.com.senior.furb.basico.ExportTurmaInput;
import br.com.senior.furb.basico.ExportTurmaOutput;
import br.com.senior.furb.basico.GetDependenciesOutput;
import br.com.senior.furb.basico.Aluno;
import br.com.senior.furb.basico.CreateBulkAlunoInput;
import br.com.senior.furb.basico.CreateBulkAlunoOutput;
import br.com.senior.furb.basico.Professor;
import br.com.senior.furb.basico.CreateBulkProfessorInput;
import br.com.senior.furb.basico.CreateBulkProfessorOutput;
import br.com.senior.furb.basico.Materia;
import br.com.senior.furb.basico.CreateBulkMateriaInput;
import br.com.senior.furb.basico.CreateBulkMateriaOutput;
import br.com.senior.furb.basico.Turma;
import br.com.senior.furb.basico.CreateBulkTurmaInput;
import br.com.senior.furb.basico.CreateBulkTurmaOutput;
import br.com.senior.furb.basico.ServiceStartedPayload;
import br.com.senior.furb.basico.NotifyUserEventPayload;
import br.com.senior.furb.basico.ImportAlunoEventPayload;
import br.com.senior.furb.basico.ExportAlunoEventPayload;
import br.com.senior.furb.basico.ImportProfessorEventPayload;
import br.com.senior.furb.basico.ExportProfessorEventPayload;
import br.com.senior.furb.basico.ImportMateriaEventPayload;
import br.com.senior.furb.basico.ExportMateriaEventPayload;
import br.com.senior.furb.basico.ImportTurmaEventPayload;
import br.com.senior.furb.basico.ExportTurmaEventPayload;

/**
* 
*/
public interface BasicoStub {

	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	HelloWorldOutput helloWorld(HelloWorldInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void helloWorld(HelloWorldInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetMetadataOutput getMetadata(GetMetadataInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona
	 */
	void getMetadata(GetMetadataInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportAlunoOutput importAluno(ImportAlunoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importAluno(ImportAlunoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportAlunoOutput> importAlunoRequest(ImportAlunoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportAlunoOutput exportAluno(ExportAlunoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportAluno(ExportAlunoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportAlunoOutput> exportAlunoRequest(ExportAlunoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportProfessorOutput importProfessor(ImportProfessorInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importProfessor(ImportProfessorInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportProfessorOutput> importProfessorRequest(ImportProfessorInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportProfessorOutput exportProfessor(ExportProfessorInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportProfessor(ExportProfessorInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportProfessorOutput> exportProfessorRequest(ExportProfessorInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportMateriaOutput importMateria(ImportMateriaInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importMateria(ImportMateriaInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportMateriaOutput> importMateriaRequest(ImportMateriaInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportMateriaOutput exportMateria(ExportMateriaInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportMateria(ExportMateriaInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportMateriaOutput> exportMateriaRequest(ExportMateriaInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportTurmaOutput importTurma(ImportTurmaInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importTurma(ImportTurmaInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportTurmaOutput> importTurmaRequest(ImportTurmaInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportTurmaOutput exportTurma(ExportTurmaInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportTurma(ExportTurmaInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportTurmaOutput> exportTurmaRequest(ExportTurmaInput input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Aluno entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Aluno.PagedResults listAluno(Aluno.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Aluno entity.
	 * Chamada assíncrona
	 */
	void listAluno(Aluno.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Aluno entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Aluno.PagedResults> listAlunoRequest(Aluno.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Professor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Professor.PagedResults listProfessor(Professor.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Professor entity.
	 * Chamada assíncrona
	 */
	void listProfessor(Professor.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Professor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Professor.PagedResults> listProfessorRequest(Professor.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Materia entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Materia.PagedResults listMateria(Materia.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Materia entity.
	 * Chamada assíncrona
	 */
	void listMateria(Materia.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Materia entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Materia.PagedResults> listMateriaRequest(Materia.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Turma entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Turma.PagedResults listTurma(Turma.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Turma entity.
	 * Chamada assíncrona
	 */
	void listTurma(Turma.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Turma entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Turma.PagedResults> listTurmaRequest(Turma.PageRequest input);
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetDependenciesOutput getDependencies(long timeout);
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona
	 */
	void getDependencies();
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetDependenciesOutput> getDependenciesRequest();
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Aluno entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Aluno createAluno(Aluno input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Aluno entity.
	 * Chamada assíncrona
	 */
	void createAluno(Aluno input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Aluno entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Aluno> createAlunoRequest(Aluno input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Aluno entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkAlunoOutput createBulkAluno(CreateBulkAlunoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Aluno entity.
	 * Chamada assíncrona
	 */
	void createBulkAluno(CreateBulkAlunoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Aluno entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkAlunoOutput> createBulkAlunoRequest(CreateBulkAlunoInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Aluno entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Aluno createMergeAluno(Aluno input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Aluno entity.
	 * Chamada assíncrona
	 */
	void createMergeAluno(Aluno input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Aluno entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Aluno> createMergeAlunoRequest(Aluno input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Aluno entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Aluno retrieveAluno(Aluno.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Aluno entity.
	 * Chamada assíncrona
	 */
	void retrieveAluno(Aluno.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Aluno entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Aluno> retrieveAlunoRequest(Aluno.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Aluno entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Aluno updateAluno(Aluno input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Aluno entity.
	 * Chamada assíncrona
	 */
	void updateAluno(Aluno input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Aluno entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Aluno> updateAlunoRequest(Aluno input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Aluno entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Aluno updateMergeAluno(Aluno input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Aluno entity.
	 * Chamada assíncrona
	 */
	void updateMergeAluno(Aluno input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Aluno entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Aluno> updateMergeAlunoRequest(Aluno input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Aluno entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteAluno(Aluno.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Aluno entity.
	 * Chamada assíncrona
	 */
	void deleteAluno(Aluno.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Professor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Professor createProfessor(Professor input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Professor entity.
	 * Chamada assíncrona
	 */
	void createProfessor(Professor input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Professor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Professor> createProfessorRequest(Professor input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Professor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkProfessorOutput createBulkProfessor(CreateBulkProfessorInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Professor entity.
	 * Chamada assíncrona
	 */
	void createBulkProfessor(CreateBulkProfessorInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Professor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkProfessorOutput> createBulkProfessorRequest(CreateBulkProfessorInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Professor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Professor createMergeProfessor(Professor input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Professor entity.
	 * Chamada assíncrona
	 */
	void createMergeProfessor(Professor input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Professor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Professor> createMergeProfessorRequest(Professor input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Professor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Professor retrieveProfessor(Professor.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Professor entity.
	 * Chamada assíncrona
	 */
	void retrieveProfessor(Professor.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Professor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Professor> retrieveProfessorRequest(Professor.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Professor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Professor updateProfessor(Professor input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Professor entity.
	 * Chamada assíncrona
	 */
	void updateProfessor(Professor input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Professor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Professor> updateProfessorRequest(Professor input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Professor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Professor updateMergeProfessor(Professor input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Professor entity.
	 * Chamada assíncrona
	 */
	void updateMergeProfessor(Professor input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Professor entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Professor> updateMergeProfessorRequest(Professor input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Professor entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteProfessor(Professor.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Professor entity.
	 * Chamada assíncrona
	 */
	void deleteProfessor(Professor.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Materia entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Materia createMateria(Materia input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Materia entity.
	 * Chamada assíncrona
	 */
	void createMateria(Materia input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Materia entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Materia> createMateriaRequest(Materia input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Materia entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkMateriaOutput createBulkMateria(CreateBulkMateriaInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Materia entity.
	 * Chamada assíncrona
	 */
	void createBulkMateria(CreateBulkMateriaInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Materia entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkMateriaOutput> createBulkMateriaRequest(CreateBulkMateriaInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Materia entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Materia createMergeMateria(Materia input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Materia entity.
	 * Chamada assíncrona
	 */
	void createMergeMateria(Materia input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Materia entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Materia> createMergeMateriaRequest(Materia input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Materia entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Materia retrieveMateria(Materia.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Materia entity.
	 * Chamada assíncrona
	 */
	void retrieveMateria(Materia.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Materia entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Materia> retrieveMateriaRequest(Materia.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Materia entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Materia updateMateria(Materia input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Materia entity.
	 * Chamada assíncrona
	 */
	void updateMateria(Materia input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Materia entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Materia> updateMateriaRequest(Materia input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Materia entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Materia updateMergeMateria(Materia input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Materia entity.
	 * Chamada assíncrona
	 */
	void updateMergeMateria(Materia input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Materia entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Materia> updateMergeMateriaRequest(Materia input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Materia entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteMateria(Materia.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Materia entity.
	 * Chamada assíncrona
	 */
	void deleteMateria(Materia.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Turma entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Turma createTurma(Turma input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Turma entity.
	 * Chamada assíncrona
	 */
	void createTurma(Turma input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Turma entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Turma> createTurmaRequest(Turma input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Turma entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkTurmaOutput createBulkTurma(CreateBulkTurmaInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Turma entity.
	 * Chamada assíncrona
	 */
	void createBulkTurma(CreateBulkTurmaInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Turma entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkTurmaOutput> createBulkTurmaRequest(CreateBulkTurmaInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Turma entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Turma createMergeTurma(Turma input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Turma entity.
	 * Chamada assíncrona
	 */
	void createMergeTurma(Turma input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Turma entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Turma> createMergeTurmaRequest(Turma input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Turma entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Turma retrieveTurma(Turma.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Turma entity.
	 * Chamada assíncrona
	 */
	void retrieveTurma(Turma.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Turma entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Turma> retrieveTurmaRequest(Turma.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Turma entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Turma updateTurma(Turma input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Turma entity.
	 * Chamada assíncrona
	 */
	void updateTurma(Turma input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Turma entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Turma> updateTurmaRequest(Turma input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Turma entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Turma updateMergeTurma(Turma input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Turma entity.
	 * Chamada assíncrona
	 */
	void updateMergeTurma(Turma input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Turma entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Turma> updateMergeTurmaRequest(Turma input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Turma entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteTurma(Turma.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Turma entity.
	 * Chamada assíncrona
	 */
	void deleteTurma(Turma.Id input);
	


	/**
	* Chamada assíncrona para o método publishServiceStarted 
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	void publishServiceStarted( ServiceStartedPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent 
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	void publishNotifyUserEvent( NotifyUserEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportAlunoEvent 
	* This is a public operation
	*/
	void publishImportAlunoEvent( ImportAlunoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportAlunoEvent 
	* This is a public operation
	*/
	void publishExportAlunoEvent( ExportAlunoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportProfessorEvent 
	* This is a public operation
	*/
	void publishImportProfessorEvent( ImportProfessorEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportProfessorEvent 
	* This is a public operation
	*/
	void publishExportProfessorEvent( ExportProfessorEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportMateriaEvent 
	* This is a public operation
	*/
	void publishImportMateriaEvent( ImportMateriaEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportMateriaEvent 
	* This is a public operation
	*/
	void publishExportMateriaEvent( ExportMateriaEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportTurmaEvent 
	* This is a public operation
	*/
	void publishImportTurmaEvent( ImportTurmaEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportTurmaEvent 
	* This is a public operation
	*/
	void publishExportTurmaEvent( ExportTurmaEventPayload input );
			
	

}
