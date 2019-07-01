/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

public interface BasicoConstants {
    String DOMAIN = "furb";
    String SERVICE = "basico";
    
    interface Commands {
    	/**
    	 * @see HelloWorldInput the request payload
    	 */
    	String HELLO_WORLD = "helloWorld";
    	/**
    	 * The success response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 * @see HelloWorldOutput the response payload
    	 */
    	String HELLO_WORLD_RESPONSE = "helloWorldResponse";
    	/**
    	 * An error response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 */
    	String HELLO_WORLD_ERROR = "helloWorldError";
    	/**
    	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
    	 * @see GetMetadataInput the request payload
    	 */
    	String GET_METADATA = "getMetadata";
    	/**
    	 * The success response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 * @see GetMetadataOutput the response payload
    	 */
    	String GET_METADATA_RESPONSE = "getMetadataResponse";
    	/**
    	 * An error response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 */
    	String GET_METADATA_ERROR = "getMetadataError";
    	/**
    	 * @see ImportAlunoInput the request payload
    	 */
    	String IMPORT_ALUNO = "importAluno";
    	/**
    	 * The success response primitive for importAluno.
    	 *
    	 * @see #IMPORT_ALUNO the request primitive
    	 * @see ImportAlunoOutput the response payload
    	 */
    	String IMPORT_ALUNO_RESPONSE = "importAlunoResponse";
    	/**
    	 * An error response primitive for importAluno.
    	 *
    	 * @see #IMPORT_ALUNO the request primitive
    	 */
    	String IMPORT_ALUNO_ERROR = "importAlunoError";
    	/**
    	 * @see ExportAlunoInput the request payload
    	 */
    	String EXPORT_ALUNO = "exportAluno";
    	/**
    	 * The success response primitive for exportAluno.
    	 *
    	 * @see #EXPORT_ALUNO the request primitive
    	 * @see ExportAlunoOutput the response payload
    	 */
    	String EXPORT_ALUNO_RESPONSE = "exportAlunoResponse";
    	/**
    	 * An error response primitive for exportAluno.
    	 *
    	 * @see #EXPORT_ALUNO the request primitive
    	 */
    	String EXPORT_ALUNO_ERROR = "exportAlunoError";
    	/**
    	 * @see ImportProfessorInput the request payload
    	 */
    	String IMPORT_PROFESSOR = "importProfessor";
    	/**
    	 * The success response primitive for importProfessor.
    	 *
    	 * @see #IMPORT_PROFESSOR the request primitive
    	 * @see ImportProfessorOutput the response payload
    	 */
    	String IMPORT_PROFESSOR_RESPONSE = "importProfessorResponse";
    	/**
    	 * An error response primitive for importProfessor.
    	 *
    	 * @see #IMPORT_PROFESSOR the request primitive
    	 */
    	String IMPORT_PROFESSOR_ERROR = "importProfessorError";
    	/**
    	 * @see ExportProfessorInput the request payload
    	 */
    	String EXPORT_PROFESSOR = "exportProfessor";
    	/**
    	 * The success response primitive for exportProfessor.
    	 *
    	 * @see #EXPORT_PROFESSOR the request primitive
    	 * @see ExportProfessorOutput the response payload
    	 */
    	String EXPORT_PROFESSOR_RESPONSE = "exportProfessorResponse";
    	/**
    	 * An error response primitive for exportProfessor.
    	 *
    	 * @see #EXPORT_PROFESSOR the request primitive
    	 */
    	String EXPORT_PROFESSOR_ERROR = "exportProfessorError";
    	/**
    	 * @see ImportMateriaInput the request payload
    	 */
    	String IMPORT_MATERIA = "importMateria";
    	/**
    	 * The success response primitive for importMateria.
    	 *
    	 * @see #IMPORT_MATERIA the request primitive
    	 * @see ImportMateriaOutput the response payload
    	 */
    	String IMPORT_MATERIA_RESPONSE = "importMateriaResponse";
    	/**
    	 * An error response primitive for importMateria.
    	 *
    	 * @see #IMPORT_MATERIA the request primitive
    	 */
    	String IMPORT_MATERIA_ERROR = "importMateriaError";
    	/**
    	 * @see ExportMateriaInput the request payload
    	 */
    	String EXPORT_MATERIA = "exportMateria";
    	/**
    	 * The success response primitive for exportMateria.
    	 *
    	 * @see #EXPORT_MATERIA the request primitive
    	 * @see ExportMateriaOutput the response payload
    	 */
    	String EXPORT_MATERIA_RESPONSE = "exportMateriaResponse";
    	/**
    	 * An error response primitive for exportMateria.
    	 *
    	 * @see #EXPORT_MATERIA the request primitive
    	 */
    	String EXPORT_MATERIA_ERROR = "exportMateriaError";
    	/**
    	 * @see ImportTurmaInput the request payload
    	 */
    	String IMPORT_TURMA = "importTurma";
    	/**
    	 * The success response primitive for importTurma.
    	 *
    	 * @see #IMPORT_TURMA the request primitive
    	 * @see ImportTurmaOutput the response payload
    	 */
    	String IMPORT_TURMA_RESPONSE = "importTurmaResponse";
    	/**
    	 * An error response primitive for importTurma.
    	 *
    	 * @see #IMPORT_TURMA the request primitive
    	 */
    	String IMPORT_TURMA_ERROR = "importTurmaError";
    	/**
    	 * @see ExportTurmaInput the request payload
    	 */
    	String EXPORT_TURMA = "exportTurma";
    	/**
    	 * The success response primitive for exportTurma.
    	 *
    	 * @see #EXPORT_TURMA the request primitive
    	 * @see ExportTurmaOutput the response payload
    	 */
    	String EXPORT_TURMA_RESPONSE = "exportTurmaResponse";
    	/**
    	 * An error response primitive for exportTurma.
    	 *
    	 * @see #EXPORT_TURMA the request primitive
    	 */
    	String EXPORT_TURMA_ERROR = "exportTurmaError";
    	/**
    	 * The 'list' request primitive for the Aluno entity.
    	 * @see aluno.pageRequest the request payload
    	 */
    	String LIST_ALUNO = "listAluno";
    	/**
    	 * The success response primitive for listAluno.
    	 *
    	 * @see #LIST_ALUNO the request primitive
    	 * @see Aluno.PagedResults the response payload
    	 */
    	String LIST_ALUNO_RESPONSE = "listAlunoResponse";
    	/**
    	 * An error response primitive for listAluno.
    	 *
    	 * @see #LIST_ALUNO the request primitive
    	 */
    	String LIST_ALUNO_ERROR = "listAlunoError";
    	/**
    	 * The 'list' request primitive for the Professor entity.
    	 * @see professor.pageRequest the request payload
    	 */
    	String LIST_PROFESSOR = "listProfessor";
    	/**
    	 * The success response primitive for listProfessor.
    	 *
    	 * @see #LIST_PROFESSOR the request primitive
    	 * @see Professor.PagedResults the response payload
    	 */
    	String LIST_PROFESSOR_RESPONSE = "listProfessorResponse";
    	/**
    	 * An error response primitive for listProfessor.
    	 *
    	 * @see #LIST_PROFESSOR the request primitive
    	 */
    	String LIST_PROFESSOR_ERROR = "listProfessorError";
    	/**
    	 * The 'list' request primitive for the Materia entity.
    	 * @see materia.pageRequest the request payload
    	 */
    	String LIST_MATERIA = "listMateria";
    	/**
    	 * The success response primitive for listMateria.
    	 *
    	 * @see #LIST_MATERIA the request primitive
    	 * @see Materia.PagedResults the response payload
    	 */
    	String LIST_MATERIA_RESPONSE = "listMateriaResponse";
    	/**
    	 * An error response primitive for listMateria.
    	 *
    	 * @see #LIST_MATERIA the request primitive
    	 */
    	String LIST_MATERIA_ERROR = "listMateriaError";
    	/**
    	 * The 'list' request primitive for the Turma entity.
    	 * @see turma.pageRequest the request payload
    	 */
    	String LIST_TURMA = "listTurma";
    	/**
    	 * The success response primitive for listTurma.
    	 *
    	 * @see #LIST_TURMA the request primitive
    	 * @see Turma.PagedResults the response payload
    	 */
    	String LIST_TURMA_RESPONSE = "listTurmaResponse";
    	/**
    	 * An error response primitive for listTurma.
    	 *
    	 * @see #LIST_TURMA the request primitive
    	 */
    	String LIST_TURMA_ERROR = "listTurmaError";
    	/**
    	 * Returns a list with all dependencies from this service, along with their respective versions
    	 */
    	String GET_DEPENDENCIES = "getDependencies";
    	/**
    	 * The success response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 * @see GetDependenciesOutput the response payload
    	 */
    	String GET_DEPENDENCIES_RESPONSE = "getDependenciesResponse";
    	/**
    	 * An error response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 */
    	String GET_DEPENDENCIES_ERROR = "getDependenciesError";
    	/**
    	 * The 'create' request primitive for the Aluno entity.
    	 * @see Aluno the request payload
    	 */
    	String CREATE_ALUNO = "createAluno";
    	/**
    	 * The success response primitive for createAluno.
    	 *
    	 * @see #CREATE_ALUNO the request primitive
    	 */
    	String CREATE_ALUNO_RESPONSE = "createAlunoResponse";
    	/**
    	 * An error response primitive for createAluno.
    	 *
    	 * @see #CREATE_ALUNO the request primitive
    	 */
    	String CREATE_ALUNO_ERROR = "createAlunoError";
    	/**
    	 * The 'createBulk' request primitive for the Aluno entity.
    	 * @see CreateBulkAlunoInput the request payload
    	 */
    	String CREATE_BULK_ALUNO = "createBulkAluno";
    	/**
    	 * The success response primitive for createBulkAluno.
    	 *
    	 * @see #CREATE_BULK_ALUNO the request primitive
    	 * @see CreateBulkAlunoOutput the response payload
    	 */
    	String CREATE_BULK_ALUNO_RESPONSE = "createBulkAlunoResponse";
    	/**
    	 * An error response primitive for createBulkAluno.
    	 *
    	 * @see #CREATE_BULK_ALUNO the request primitive
    	 */
    	String CREATE_BULK_ALUNO_ERROR = "createBulkAlunoError";
    	/**
    	 * The 'createMerge' request primitive for the Aluno entity.
    	 * @see Aluno the request payload
    	 */
    	String CREATE_MERGE_ALUNO = "createMergeAluno";
    	/**
    	 * The success response primitive for createMergeAluno.
    	 *
    	 * @see #CREATE_MERGE_ALUNO the request primitive
    	 */
    	String CREATE_MERGE_ALUNO_RESPONSE = "createMergeAlunoResponse";
    	/**
    	 * An error response primitive for createMergeAluno.
    	 *
    	 * @see #CREATE_MERGE_ALUNO the request primitive
    	 */
    	String CREATE_MERGE_ALUNO_ERROR = "createMergeAlunoError";
    	/**
    	 * The 'retrieve' request primitive for the Aluno entity.
    	 * @see Aluno.Id the request payload
    	 */
    	String RETRIEVE_ALUNO = "retrieveAluno";
    	/**
    	 * The success response primitive for retrieveAluno.
    	 *
    	 * @see #RETRIEVE_ALUNO the request primitive
    	 */
    	String RETRIEVE_ALUNO_RESPONSE = "retrieveAlunoResponse";
    	/**
    	 * An error response primitive for retrieveAluno.
    	 *
    	 * @see #RETRIEVE_ALUNO the request primitive
    	 */
    	String RETRIEVE_ALUNO_ERROR = "retrieveAlunoError";
    	/**
    	 * The 'update' request primitive for the Aluno entity.
    	 * @see Aluno the request payload
    	 */
    	String UPDATE_ALUNO = "updateAluno";
    	/**
    	 * The success response primitive for updateAluno.
    	 *
    	 * @see #UPDATE_ALUNO the request primitive
    	 */
    	String UPDATE_ALUNO_RESPONSE = "updateAlunoResponse";
    	/**
    	 * An error response primitive for updateAluno.
    	 *
    	 * @see #UPDATE_ALUNO the request primitive
    	 */
    	String UPDATE_ALUNO_ERROR = "updateAlunoError";
    	/**
    	 * The 'updateMerge' request primitive for the Aluno entity.
    	 * @see Aluno the request payload
    	 */
    	String UPDATE_MERGE_ALUNO = "updateMergeAluno";
    	/**
    	 * The success response primitive for updateMergeAluno.
    	 *
    	 * @see #UPDATE_MERGE_ALUNO the request primitive
    	 */
    	String UPDATE_MERGE_ALUNO_RESPONSE = "updateMergeAlunoResponse";
    	/**
    	 * An error response primitive for updateMergeAluno.
    	 *
    	 * @see #UPDATE_MERGE_ALUNO the request primitive
    	 */
    	String UPDATE_MERGE_ALUNO_ERROR = "updateMergeAlunoError";
    	/**
    	 * The 'delete' request primitive for the Aluno entity.
    	 * @see Aluno.Id the request payload
    	 */
    	String DELETE_ALUNO = "deleteAluno";
    	/**
    	 * The success response primitive for deleteAluno.
    	 *
    	 * @see #DELETE_ALUNO the request primitive
    	 */
    	String DELETE_ALUNO_RESPONSE = "deleteAlunoResponse";
    	/**
    	 * An error response primitive for deleteAluno.
    	 *
    	 * @see #DELETE_ALUNO the request primitive
    	 */
    	String DELETE_ALUNO_ERROR = "deleteAlunoError";
    	/**
    	 * The 'create' request primitive for the Professor entity.
    	 * @see Professor the request payload
    	 */
    	String CREATE_PROFESSOR = "createProfessor";
    	/**
    	 * The success response primitive for createProfessor.
    	 *
    	 * @see #CREATE_PROFESSOR the request primitive
    	 */
    	String CREATE_PROFESSOR_RESPONSE = "createProfessorResponse";
    	/**
    	 * An error response primitive for createProfessor.
    	 *
    	 * @see #CREATE_PROFESSOR the request primitive
    	 */
    	String CREATE_PROFESSOR_ERROR = "createProfessorError";
    	/**
    	 * The 'createBulk' request primitive for the Professor entity.
    	 * @see CreateBulkProfessorInput the request payload
    	 */
    	String CREATE_BULK_PROFESSOR = "createBulkProfessor";
    	/**
    	 * The success response primitive for createBulkProfessor.
    	 *
    	 * @see #CREATE_BULK_PROFESSOR the request primitive
    	 * @see CreateBulkProfessorOutput the response payload
    	 */
    	String CREATE_BULK_PROFESSOR_RESPONSE = "createBulkProfessorResponse";
    	/**
    	 * An error response primitive for createBulkProfessor.
    	 *
    	 * @see #CREATE_BULK_PROFESSOR the request primitive
    	 */
    	String CREATE_BULK_PROFESSOR_ERROR = "createBulkProfessorError";
    	/**
    	 * The 'createMerge' request primitive for the Professor entity.
    	 * @see Professor the request payload
    	 */
    	String CREATE_MERGE_PROFESSOR = "createMergeProfessor";
    	/**
    	 * The success response primitive for createMergeProfessor.
    	 *
    	 * @see #CREATE_MERGE_PROFESSOR the request primitive
    	 */
    	String CREATE_MERGE_PROFESSOR_RESPONSE = "createMergeProfessorResponse";
    	/**
    	 * An error response primitive for createMergeProfessor.
    	 *
    	 * @see #CREATE_MERGE_PROFESSOR the request primitive
    	 */
    	String CREATE_MERGE_PROFESSOR_ERROR = "createMergeProfessorError";
    	/**
    	 * The 'retrieve' request primitive for the Professor entity.
    	 * @see Professor.Id the request payload
    	 */
    	String RETRIEVE_PROFESSOR = "retrieveProfessor";
    	/**
    	 * The success response primitive for retrieveProfessor.
    	 *
    	 * @see #RETRIEVE_PROFESSOR the request primitive
    	 */
    	String RETRIEVE_PROFESSOR_RESPONSE = "retrieveProfessorResponse";
    	/**
    	 * An error response primitive for retrieveProfessor.
    	 *
    	 * @see #RETRIEVE_PROFESSOR the request primitive
    	 */
    	String RETRIEVE_PROFESSOR_ERROR = "retrieveProfessorError";
    	/**
    	 * The 'update' request primitive for the Professor entity.
    	 * @see Professor the request payload
    	 */
    	String UPDATE_PROFESSOR = "updateProfessor";
    	/**
    	 * The success response primitive for updateProfessor.
    	 *
    	 * @see #UPDATE_PROFESSOR the request primitive
    	 */
    	String UPDATE_PROFESSOR_RESPONSE = "updateProfessorResponse";
    	/**
    	 * An error response primitive for updateProfessor.
    	 *
    	 * @see #UPDATE_PROFESSOR the request primitive
    	 */
    	String UPDATE_PROFESSOR_ERROR = "updateProfessorError";
    	/**
    	 * The 'updateMerge' request primitive for the Professor entity.
    	 * @see Professor the request payload
    	 */
    	String UPDATE_MERGE_PROFESSOR = "updateMergeProfessor";
    	/**
    	 * The success response primitive for updateMergeProfessor.
    	 *
    	 * @see #UPDATE_MERGE_PROFESSOR the request primitive
    	 */
    	String UPDATE_MERGE_PROFESSOR_RESPONSE = "updateMergeProfessorResponse";
    	/**
    	 * An error response primitive for updateMergeProfessor.
    	 *
    	 * @see #UPDATE_MERGE_PROFESSOR the request primitive
    	 */
    	String UPDATE_MERGE_PROFESSOR_ERROR = "updateMergeProfessorError";
    	/**
    	 * The 'delete' request primitive for the Professor entity.
    	 * @see Professor.Id the request payload
    	 */
    	String DELETE_PROFESSOR = "deleteProfessor";
    	/**
    	 * The success response primitive for deleteProfessor.
    	 *
    	 * @see #DELETE_PROFESSOR the request primitive
    	 */
    	String DELETE_PROFESSOR_RESPONSE = "deleteProfessorResponse";
    	/**
    	 * An error response primitive for deleteProfessor.
    	 *
    	 * @see #DELETE_PROFESSOR the request primitive
    	 */
    	String DELETE_PROFESSOR_ERROR = "deleteProfessorError";
    	/**
    	 * The 'create' request primitive for the Materia entity.
    	 * @see Materia the request payload
    	 */
    	String CREATE_MATERIA = "createMateria";
    	/**
    	 * The success response primitive for createMateria.
    	 *
    	 * @see #CREATE_MATERIA the request primitive
    	 */
    	String CREATE_MATERIA_RESPONSE = "createMateriaResponse";
    	/**
    	 * An error response primitive for createMateria.
    	 *
    	 * @see #CREATE_MATERIA the request primitive
    	 */
    	String CREATE_MATERIA_ERROR = "createMateriaError";
    	/**
    	 * The 'createBulk' request primitive for the Materia entity.
    	 * @see CreateBulkMateriaInput the request payload
    	 */
    	String CREATE_BULK_MATERIA = "createBulkMateria";
    	/**
    	 * The success response primitive for createBulkMateria.
    	 *
    	 * @see #CREATE_BULK_MATERIA the request primitive
    	 * @see CreateBulkMateriaOutput the response payload
    	 */
    	String CREATE_BULK_MATERIA_RESPONSE = "createBulkMateriaResponse";
    	/**
    	 * An error response primitive for createBulkMateria.
    	 *
    	 * @see #CREATE_BULK_MATERIA the request primitive
    	 */
    	String CREATE_BULK_MATERIA_ERROR = "createBulkMateriaError";
    	/**
    	 * The 'createMerge' request primitive for the Materia entity.
    	 * @see Materia the request payload
    	 */
    	String CREATE_MERGE_MATERIA = "createMergeMateria";
    	/**
    	 * The success response primitive for createMergeMateria.
    	 *
    	 * @see #CREATE_MERGE_MATERIA the request primitive
    	 */
    	String CREATE_MERGE_MATERIA_RESPONSE = "createMergeMateriaResponse";
    	/**
    	 * An error response primitive for createMergeMateria.
    	 *
    	 * @see #CREATE_MERGE_MATERIA the request primitive
    	 */
    	String CREATE_MERGE_MATERIA_ERROR = "createMergeMateriaError";
    	/**
    	 * The 'retrieve' request primitive for the Materia entity.
    	 * @see Materia.Id the request payload
    	 */
    	String RETRIEVE_MATERIA = "retrieveMateria";
    	/**
    	 * The success response primitive for retrieveMateria.
    	 *
    	 * @see #RETRIEVE_MATERIA the request primitive
    	 */
    	String RETRIEVE_MATERIA_RESPONSE = "retrieveMateriaResponse";
    	/**
    	 * An error response primitive for retrieveMateria.
    	 *
    	 * @see #RETRIEVE_MATERIA the request primitive
    	 */
    	String RETRIEVE_MATERIA_ERROR = "retrieveMateriaError";
    	/**
    	 * The 'update' request primitive for the Materia entity.
    	 * @see Materia the request payload
    	 */
    	String UPDATE_MATERIA = "updateMateria";
    	/**
    	 * The success response primitive for updateMateria.
    	 *
    	 * @see #UPDATE_MATERIA the request primitive
    	 */
    	String UPDATE_MATERIA_RESPONSE = "updateMateriaResponse";
    	/**
    	 * An error response primitive for updateMateria.
    	 *
    	 * @see #UPDATE_MATERIA the request primitive
    	 */
    	String UPDATE_MATERIA_ERROR = "updateMateriaError";
    	/**
    	 * The 'updateMerge' request primitive for the Materia entity.
    	 * @see Materia the request payload
    	 */
    	String UPDATE_MERGE_MATERIA = "updateMergeMateria";
    	/**
    	 * The success response primitive for updateMergeMateria.
    	 *
    	 * @see #UPDATE_MERGE_MATERIA the request primitive
    	 */
    	String UPDATE_MERGE_MATERIA_RESPONSE = "updateMergeMateriaResponse";
    	/**
    	 * An error response primitive for updateMergeMateria.
    	 *
    	 * @see #UPDATE_MERGE_MATERIA the request primitive
    	 */
    	String UPDATE_MERGE_MATERIA_ERROR = "updateMergeMateriaError";
    	/**
    	 * The 'delete' request primitive for the Materia entity.
    	 * @see Materia.Id the request payload
    	 */
    	String DELETE_MATERIA = "deleteMateria";
    	/**
    	 * The success response primitive for deleteMateria.
    	 *
    	 * @see #DELETE_MATERIA the request primitive
    	 */
    	String DELETE_MATERIA_RESPONSE = "deleteMateriaResponse";
    	/**
    	 * An error response primitive for deleteMateria.
    	 *
    	 * @see #DELETE_MATERIA the request primitive
    	 */
    	String DELETE_MATERIA_ERROR = "deleteMateriaError";
    	/**
    	 * The 'create' request primitive for the Turma entity.
    	 * @see Turma the request payload
    	 */
    	String CREATE_TURMA = "createTurma";
    	/**
    	 * The success response primitive for createTurma.
    	 *
    	 * @see #CREATE_TURMA the request primitive
    	 */
    	String CREATE_TURMA_RESPONSE = "createTurmaResponse";
    	/**
    	 * An error response primitive for createTurma.
    	 *
    	 * @see #CREATE_TURMA the request primitive
    	 */
    	String CREATE_TURMA_ERROR = "createTurmaError";
    	/**
    	 * The 'createBulk' request primitive for the Turma entity.
    	 * @see CreateBulkTurmaInput the request payload
    	 */
    	String CREATE_BULK_TURMA = "createBulkTurma";
    	/**
    	 * The success response primitive for createBulkTurma.
    	 *
    	 * @see #CREATE_BULK_TURMA the request primitive
    	 * @see CreateBulkTurmaOutput the response payload
    	 */
    	String CREATE_BULK_TURMA_RESPONSE = "createBulkTurmaResponse";
    	/**
    	 * An error response primitive for createBulkTurma.
    	 *
    	 * @see #CREATE_BULK_TURMA the request primitive
    	 */
    	String CREATE_BULK_TURMA_ERROR = "createBulkTurmaError";
    	/**
    	 * The 'createMerge' request primitive for the Turma entity.
    	 * @see Turma the request payload
    	 */
    	String CREATE_MERGE_TURMA = "createMergeTurma";
    	/**
    	 * The success response primitive for createMergeTurma.
    	 *
    	 * @see #CREATE_MERGE_TURMA the request primitive
    	 */
    	String CREATE_MERGE_TURMA_RESPONSE = "createMergeTurmaResponse";
    	/**
    	 * An error response primitive for createMergeTurma.
    	 *
    	 * @see #CREATE_MERGE_TURMA the request primitive
    	 */
    	String CREATE_MERGE_TURMA_ERROR = "createMergeTurmaError";
    	/**
    	 * The 'retrieve' request primitive for the Turma entity.
    	 * @see Turma.Id the request payload
    	 */
    	String RETRIEVE_TURMA = "retrieveTurma";
    	/**
    	 * The success response primitive for retrieveTurma.
    	 *
    	 * @see #RETRIEVE_TURMA the request primitive
    	 */
    	String RETRIEVE_TURMA_RESPONSE = "retrieveTurmaResponse";
    	/**
    	 * An error response primitive for retrieveTurma.
    	 *
    	 * @see #RETRIEVE_TURMA the request primitive
    	 */
    	String RETRIEVE_TURMA_ERROR = "retrieveTurmaError";
    	/**
    	 * The 'update' request primitive for the Turma entity.
    	 * @see Turma the request payload
    	 */
    	String UPDATE_TURMA = "updateTurma";
    	/**
    	 * The success response primitive for updateTurma.
    	 *
    	 * @see #UPDATE_TURMA the request primitive
    	 */
    	String UPDATE_TURMA_RESPONSE = "updateTurmaResponse";
    	/**
    	 * An error response primitive for updateTurma.
    	 *
    	 * @see #UPDATE_TURMA the request primitive
    	 */
    	String UPDATE_TURMA_ERROR = "updateTurmaError";
    	/**
    	 * The 'updateMerge' request primitive for the Turma entity.
    	 * @see Turma the request payload
    	 */
    	String UPDATE_MERGE_TURMA = "updateMergeTurma";
    	/**
    	 * The success response primitive for updateMergeTurma.
    	 *
    	 * @see #UPDATE_MERGE_TURMA the request primitive
    	 */
    	String UPDATE_MERGE_TURMA_RESPONSE = "updateMergeTurmaResponse";
    	/**
    	 * An error response primitive for updateMergeTurma.
    	 *
    	 * @see #UPDATE_MERGE_TURMA the request primitive
    	 */
    	String UPDATE_MERGE_TURMA_ERROR = "updateMergeTurmaError";
    	/**
    	 * The 'delete' request primitive for the Turma entity.
    	 * @see Turma.Id the request payload
    	 */
    	String DELETE_TURMA = "deleteTurma";
    	/**
    	 * The success response primitive for deleteTurma.
    	 *
    	 * @see #DELETE_TURMA the request primitive
    	 */
    	String DELETE_TURMA_RESPONSE = "deleteTurmaResponse";
    	/**
    	 * An error response primitive for deleteTurma.
    	 *
    	 * @see #DELETE_TURMA the request primitive
    	 */
    	String DELETE_TURMA_ERROR = "deleteTurmaError";
    }
    
    interface Events {
    	/**
    	 * Default 'serviceStarted' event.
    	 */
    	String SERVICE_STARTED = "serviceStarted";
    	/**
    	 * Default 'notifyUser' event.
    	 */
    	String NOTIFY_USER_EVENT = "notifyUserEvent";
    	String IMPORT_ALUNO_EVENT = "importAlunoEvent";
    	String EXPORT_ALUNO_EVENT = "exportAlunoEvent";
    	String IMPORT_PROFESSOR_EVENT = "importProfessorEvent";
    	String EXPORT_PROFESSOR_EVENT = "exportProfessorEvent";
    	String IMPORT_MATERIA_EVENT = "importMateriaEvent";
    	String EXPORT_MATERIA_EVENT = "exportMateriaEvent";
    	String IMPORT_TURMA_EVENT = "importTurmaEvent";
    	String EXPORT_TURMA_EVENT = "exportTurmaEvent";
    }
    
}
