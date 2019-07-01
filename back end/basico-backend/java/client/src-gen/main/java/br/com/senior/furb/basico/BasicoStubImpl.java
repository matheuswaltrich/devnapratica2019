/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.function.Supplier;

import br.com.senior.messaging.Message;
import br.com.senior.messaging.IMessenger;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;

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

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.BasicoException;
import br.com.senior.furb.basico.BasicoConstants;

/**
* 
*/
public class BasicoStubImpl  implements BasicoStub {

	protected final Supplier<IMessenger> messengerSupplier;
	protected final UserIdentifier userId;
	protected final Supplier<Message> messageSupplier;

	/**
	 * Use {@link #BasicoStubImpl(MessengerSupplier, UserIdentifier, MessageSupplier)} instead.
	 */
	@Deprecated
	public BasicoStubImpl(IMessenger messenger, UserIdentifier userId) {
		this(new InstanceMessengerSupplier(messenger), userId, null);
	}

	/**
	 * @param messengerSupplier Supplies current service messenger.
	 * @param userId Provides tenant and user name to send or publish messages.
	 * @param messageSupplier Supplies current message being processed by service. Used to send messages by foolowup.
	 */
	public BasicoStubImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	/**
	 * Chamada síncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public HelloWorldOutput helloWorld(HelloWorldInput input, long timeout) {
		br.com.senior.furb.basico.impl.HelloWorldImpl impl = new br.com.senior.furb.basico.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorld(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void helloWorld(HelloWorldInput input) {
		br.com.senior.furb.basico.impl.HelloWorldImpl impl = new br.com.senior.furb.basico.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		impl.helloWorld(input);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input) {
		br.com.senior.furb.basico.impl.HelloWorldImpl impl = new br.com.senior.furb.basico.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorldRequest(input);
	}
	/**
	 * Chamada síncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetMetadataOutput getMetadata(GetMetadataInput input, long timeout) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadata(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public void getMetadata(GetMetadataInput input) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		impl.getMetadata(input);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadataRequest(input);
	}
	/**
	 * Chamada síncrona para o método importAluno
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportAlunoOutput importAluno(ImportAlunoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportAlunoImpl impl = new br.com.senior.furb.basico.impl.ImportAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importAluno
	 * This is a public operation
	 * 
	 */
	@Override
	public void importAluno(ImportAlunoInput input) {
		br.com.senior.furb.basico.impl.ImportAlunoImpl impl = new br.com.senior.furb.basico.impl.ImportAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.importAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método importAluno
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportAlunoOutput> importAlunoRequest(ImportAlunoInput input) {
		br.com.senior.furb.basico.impl.ImportAlunoImpl impl = new br.com.senior.furb.basico.impl.ImportAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportAluno
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportAlunoOutput exportAluno(ExportAlunoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportAlunoImpl impl = new br.com.senior.furb.basico.impl.ExportAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportAluno
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportAluno(ExportAlunoInput input) {
		br.com.senior.furb.basico.impl.ExportAlunoImpl impl = new br.com.senior.furb.basico.impl.ExportAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportAluno
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportAlunoOutput> exportAlunoRequest(ExportAlunoInput input) {
		br.com.senior.furb.basico.impl.ExportAlunoImpl impl = new br.com.senior.furb.basico.impl.ExportAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método importProfessor
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportProfessorOutput importProfessor(ImportProfessorInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportProfessorImpl impl = new br.com.senior.furb.basico.impl.ImportProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.importProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importProfessor
	 * This is a public operation
	 * 
	 */
	@Override
	public void importProfessor(ImportProfessorInput input) {
		br.com.senior.furb.basico.impl.ImportProfessorImpl impl = new br.com.senior.furb.basico.impl.ImportProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.importProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método importProfessor
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportProfessorOutput> importProfessorRequest(ImportProfessorInput input) {
		br.com.senior.furb.basico.impl.ImportProfessorImpl impl = new br.com.senior.furb.basico.impl.ImportProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.importProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportProfessor
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportProfessorOutput exportProfessor(ExportProfessorInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportProfessorImpl impl = new br.com.senior.furb.basico.impl.ExportProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportProfessor
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportProfessor(ExportProfessorInput input) {
		br.com.senior.furb.basico.impl.ExportProfessorImpl impl = new br.com.senior.furb.basico.impl.ExportProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.exportProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportProfessor
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportProfessorOutput> exportProfessorRequest(ExportProfessorInput input) {
		br.com.senior.furb.basico.impl.ExportProfessorImpl impl = new br.com.senior.furb.basico.impl.ExportProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método importMateria
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportMateriaOutput importMateria(ImportMateriaInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportMateriaImpl impl = new br.com.senior.furb.basico.impl.ImportMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.importMateria(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importMateria
	 * This is a public operation
	 * 
	 */
	@Override
	public void importMateria(ImportMateriaInput input) {
		br.com.senior.furb.basico.impl.ImportMateriaImpl impl = new br.com.senior.furb.basico.impl.ImportMateriaImpl(messengerSupplier, userId, messageSupplier);
		impl.importMateria(input);
	}
	
	/**
	 * Chamada assíncrona para o método importMateria
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportMateriaOutput> importMateriaRequest(ImportMateriaInput input) {
		br.com.senior.furb.basico.impl.ImportMateriaImpl impl = new br.com.senior.furb.basico.impl.ImportMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.importMateriaRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportMateria
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportMateriaOutput exportMateria(ExportMateriaInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportMateriaImpl impl = new br.com.senior.furb.basico.impl.ExportMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportMateria(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportMateria
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportMateria(ExportMateriaInput input) {
		br.com.senior.furb.basico.impl.ExportMateriaImpl impl = new br.com.senior.furb.basico.impl.ExportMateriaImpl(messengerSupplier, userId, messageSupplier);
		impl.exportMateria(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportMateria
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportMateriaOutput> exportMateriaRequest(ExportMateriaInput input) {
		br.com.senior.furb.basico.impl.ExportMateriaImpl impl = new br.com.senior.furb.basico.impl.ExportMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportMateriaRequest(input);
	}
	/**
	 * Chamada síncrona para o método importTurma
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportTurmaOutput importTurma(ImportTurmaInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportTurmaImpl impl = new br.com.senior.furb.basico.impl.ImportTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.importTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importTurma
	 * This is a public operation
	 * 
	 */
	@Override
	public void importTurma(ImportTurmaInput input) {
		br.com.senior.furb.basico.impl.ImportTurmaImpl impl = new br.com.senior.furb.basico.impl.ImportTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.importTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método importTurma
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportTurmaOutput> importTurmaRequest(ImportTurmaInput input) {
		br.com.senior.furb.basico.impl.ImportTurmaImpl impl = new br.com.senior.furb.basico.impl.ImportTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.importTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportTurma
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportTurmaOutput exportTurma(ExportTurmaInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportTurmaImpl impl = new br.com.senior.furb.basico.impl.ExportTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportTurma
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportTurma(ExportTurmaInput input) {
		br.com.senior.furb.basico.impl.ExportTurmaImpl impl = new br.com.senior.furb.basico.impl.ExportTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.exportTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportTurma
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportTurmaOutput> exportTurmaRequest(ExportTurmaInput input) {
		br.com.senior.furb.basico.impl.ExportTurmaImpl impl = new br.com.senior.furb.basico.impl.ExportTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método listAluno
	 * This is a public operation
	 * The 'list' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Aluno.PagedResults listAluno(Aluno.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListAlunoImpl impl = new br.com.senior.furb.basico.impl.ListAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listAluno
	 * This is a public operation
	 * The 'list' request primitive for the Aluno entity.
	 */
	@Override
	public void listAluno(Aluno.PageRequest input) {
		br.com.senior.furb.basico.impl.ListAlunoImpl impl = new br.com.senior.furb.basico.impl.ListAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.listAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método listAluno
	 * This is a public operation
	 * The 'list' request primitive for the Aluno entity.
	 */
	@Override
	public CompletableFuture<Aluno.PagedResults> listAlunoRequest(Aluno.PageRequest input) {
		br.com.senior.furb.basico.impl.ListAlunoImpl impl = new br.com.senior.furb.basico.impl.ListAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método listProfessor
	 * This is a public operation
	 * The 'list' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Professor.PagedResults listProfessor(Professor.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListProfessorImpl impl = new br.com.senior.furb.basico.impl.ListProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.listProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listProfessor
	 * This is a public operation
	 * The 'list' request primitive for the Professor entity.
	 */
	@Override
	public void listProfessor(Professor.PageRequest input) {
		br.com.senior.furb.basico.impl.ListProfessorImpl impl = new br.com.senior.furb.basico.impl.ListProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.listProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método listProfessor
	 * This is a public operation
	 * The 'list' request primitive for the Professor entity.
	 */
	@Override
	public CompletableFuture<Professor.PagedResults> listProfessorRequest(Professor.PageRequest input) {
		br.com.senior.furb.basico.impl.ListProfessorImpl impl = new br.com.senior.furb.basico.impl.ListProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.listProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método listMateria
	 * This is a public operation
	 * The 'list' request primitive for the Materia entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Materia.PagedResults listMateria(Materia.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListMateriaImpl impl = new br.com.senior.furb.basico.impl.ListMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.listMateria(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listMateria
	 * This is a public operation
	 * The 'list' request primitive for the Materia entity.
	 */
	@Override
	public void listMateria(Materia.PageRequest input) {
		br.com.senior.furb.basico.impl.ListMateriaImpl impl = new br.com.senior.furb.basico.impl.ListMateriaImpl(messengerSupplier, userId, messageSupplier);
		impl.listMateria(input);
	}
	
	/**
	 * Chamada assíncrona para o método listMateria
	 * This is a public operation
	 * The 'list' request primitive for the Materia entity.
	 */
	@Override
	public CompletableFuture<Materia.PagedResults> listMateriaRequest(Materia.PageRequest input) {
		br.com.senior.furb.basico.impl.ListMateriaImpl impl = new br.com.senior.furb.basico.impl.ListMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.listMateriaRequest(input);
	}
	/**
	 * Chamada síncrona para o método listTurma
	 * This is a public operation
	 * The 'list' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Turma.PagedResults listTurma(Turma.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListTurmaImpl impl = new br.com.senior.furb.basico.impl.ListTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.listTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listTurma
	 * This is a public operation
	 * The 'list' request primitive for the Turma entity.
	 */
	@Override
	public void listTurma(Turma.PageRequest input) {
		br.com.senior.furb.basico.impl.ListTurmaImpl impl = new br.com.senior.furb.basico.impl.ListTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.listTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método listTurma
	 * This is a public operation
	 * The 'list' request primitive for the Turma entity.
	 */
	@Override
	public CompletableFuture<Turma.PagedResults> listTurmaRequest(Turma.PageRequest input) {
		br.com.senior.furb.basico.impl.ListTurmaImpl impl = new br.com.senior.furb.basico.impl.ListTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.listTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetDependenciesOutput getDependencies(long timeout) {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependencies(timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public void getDependencies() {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		impl.getDependencies();
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest() {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependenciesRequest();
	}
	/**
	 * Chamada síncrona para o método createAluno
	 * This is a public operation
	 * The 'create' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Aluno createAluno(Aluno input, long timeout) {
		br.com.senior.furb.basico.impl.CreateAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createAluno
	 * This is a public operation
	 * The 'create' request primitive for the Aluno entity.
	 */
	@Override
	public void createAluno(Aluno input) {
		br.com.senior.furb.basico.impl.CreateAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.createAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método createAluno
	 * This is a public operation
	 * The 'create' request primitive for the Aluno entity.
	 */
	@Override
	public CompletableFuture<Aluno> createAlunoRequest(Aluno input) {
		br.com.senior.furb.basico.impl.CreateAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkAluno
	 * This is a public operation
	 * The 'createBulk' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkAlunoOutput createBulkAluno(CreateBulkAlunoInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAluno
	 * This is a public operation
	 * The 'createBulk' request primitive for the Aluno entity.
	 */
	@Override
	public void createBulkAluno(CreateBulkAlunoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAluno
	 * This is a public operation
	 * The 'createBulk' request primitive for the Aluno entity.
	 */
	@Override
	public CompletableFuture<CreateBulkAlunoOutput> createBulkAlunoRequest(CreateBulkAlunoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeAluno
	 * This is a public operation
	 * The 'createMerge' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Aluno createMergeAluno(Aluno input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAluno
	 * This is a public operation
	 * The 'createMerge' request primitive for the Aluno entity.
	 */
	@Override
	public void createMergeAluno(Aluno input) {
		br.com.senior.furb.basico.impl.CreateMergeAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAluno
	 * This is a public operation
	 * The 'createMerge' request primitive for the Aluno entity.
	 */
	@Override
	public CompletableFuture<Aluno> createMergeAlunoRequest(Aluno input) {
		br.com.senior.furb.basico.impl.CreateMergeAlunoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveAluno
	 * This is a public operation
	 * The 'retrieve' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Aluno retrieveAluno(Aluno.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveAlunoImpl impl = new br.com.senior.furb.basico.impl.RetrieveAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAluno
	 * This is a public operation
	 * The 'retrieve' request primitive for the Aluno entity.
	 */
	@Override
	public void retrieveAluno(Aluno.Id input) {
		br.com.senior.furb.basico.impl.RetrieveAlunoImpl impl = new br.com.senior.furb.basico.impl.RetrieveAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAluno
	 * This is a public operation
	 * The 'retrieve' request primitive for the Aluno entity.
	 */
	@Override
	public CompletableFuture<Aluno> retrieveAlunoRequest(Aluno.Id input) {
		br.com.senior.furb.basico.impl.RetrieveAlunoImpl impl = new br.com.senior.furb.basico.impl.RetrieveAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateAluno
	 * This is a public operation
	 * The 'update' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Aluno updateAluno(Aluno input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateAlunoImpl impl = new br.com.senior.furb.basico.impl.UpdateAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateAluno
	 * This is a public operation
	 * The 'update' request primitive for the Aluno entity.
	 */
	@Override
	public void updateAluno(Aluno input) {
		br.com.senior.furb.basico.impl.UpdateAlunoImpl impl = new br.com.senior.furb.basico.impl.UpdateAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateAluno
	 * This is a public operation
	 * The 'update' request primitive for the Aluno entity.
	 */
	@Override
	public CompletableFuture<Aluno> updateAlunoRequest(Aluno input) {
		br.com.senior.furb.basico.impl.UpdateAlunoImpl impl = new br.com.senior.furb.basico.impl.UpdateAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeAluno
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Aluno updateMergeAluno(Aluno input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeAlunoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAluno
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Aluno entity.
	 */
	@Override
	public void updateMergeAluno(Aluno input) {
		br.com.senior.furb.basico.impl.UpdateMergeAlunoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeAluno(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAluno
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Aluno entity.
	 */
	@Override
	public CompletableFuture<Aluno> updateMergeAlunoRequest(Aluno input) {
		br.com.senior.furb.basico.impl.UpdateMergeAlunoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAlunoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAlunoRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteAluno
	 * This is a public operation
	 * The 'delete' request primitive for the Aluno entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteAluno(Aluno.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteAlunoImpl impl = new br.com.senior.furb.basico.impl.DeleteAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAluno(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteAluno
	 * This is a public operation
	 * The 'delete' request primitive for the Aluno entity.
	 */
	@Override
	public void deleteAluno(Aluno.Id input) {
		br.com.senior.furb.basico.impl.DeleteAlunoImpl impl = new br.com.senior.furb.basico.impl.DeleteAlunoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAluno(input);
	}
	
	/**
	 * Chamada síncrona para o método createProfessor
	 * This is a public operation
	 * The 'create' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Professor createProfessor(Professor input, long timeout) {
		br.com.senior.furb.basico.impl.CreateProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createProfessor
	 * This is a public operation
	 * The 'create' request primitive for the Professor entity.
	 */
	@Override
	public void createProfessor(Professor input) {
		br.com.senior.furb.basico.impl.CreateProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.createProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createProfessor
	 * This is a public operation
	 * The 'create' request primitive for the Professor entity.
	 */
	@Override
	public CompletableFuture<Professor> createProfessorRequest(Professor input) {
		br.com.senior.furb.basico.impl.CreateProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkProfessor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkProfessorOutput createBulkProfessor(CreateBulkProfessorInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkProfessor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Professor entity.
	 */
	@Override
	public void createBulkProfessor(CreateBulkProfessorInput input) {
		br.com.senior.furb.basico.impl.CreateBulkProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkProfessor
	 * This is a public operation
	 * The 'createBulk' request primitive for the Professor entity.
	 */
	@Override
	public CompletableFuture<CreateBulkProfessorOutput> createBulkProfessorRequest(CreateBulkProfessorInput input) {
		br.com.senior.furb.basico.impl.CreateBulkProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateBulkProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeProfessor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Professor createMergeProfessor(Professor input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeProfessor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Professor entity.
	 */
	@Override
	public void createMergeProfessor(Professor input) {
		br.com.senior.furb.basico.impl.CreateMergeProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeProfessor
	 * This is a public operation
	 * The 'createMerge' request primitive for the Professor entity.
	 */
	@Override
	public CompletableFuture<Professor> createMergeProfessorRequest(Professor input) {
		br.com.senior.furb.basico.impl.CreateMergeProfessorImpl impl = new br.com.senior.furb.basico.impl.CreateMergeProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveProfessor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Professor retrieveProfessor(Professor.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveProfessorImpl impl = new br.com.senior.furb.basico.impl.RetrieveProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveProfessor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Professor entity.
	 */
	@Override
	public void retrieveProfessor(Professor.Id input) {
		br.com.senior.furb.basico.impl.RetrieveProfessorImpl impl = new br.com.senior.furb.basico.impl.RetrieveProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveProfessor
	 * This is a public operation
	 * The 'retrieve' request primitive for the Professor entity.
	 */
	@Override
	public CompletableFuture<Professor> retrieveProfessorRequest(Professor.Id input) {
		br.com.senior.furb.basico.impl.RetrieveProfessorImpl impl = new br.com.senior.furb.basico.impl.RetrieveProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateProfessor
	 * This is a public operation
	 * The 'update' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Professor updateProfessor(Professor input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateProfessorImpl impl = new br.com.senior.furb.basico.impl.UpdateProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateProfessor
	 * This is a public operation
	 * The 'update' request primitive for the Professor entity.
	 */
	@Override
	public void updateProfessor(Professor input) {
		br.com.senior.furb.basico.impl.UpdateProfessorImpl impl = new br.com.senior.furb.basico.impl.UpdateProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.updateProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateProfessor
	 * This is a public operation
	 * The 'update' request primitive for the Professor entity.
	 */
	@Override
	public CompletableFuture<Professor> updateProfessorRequest(Professor input) {
		br.com.senior.furb.basico.impl.UpdateProfessorImpl impl = new br.com.senior.furb.basico.impl.UpdateProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeProfessor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Professor updateMergeProfessor(Professor input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeProfessorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeProfessor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Professor entity.
	 */
	@Override
	public void updateMergeProfessor(Professor input) {
		br.com.senior.furb.basico.impl.UpdateMergeProfessorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeProfessor(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeProfessor
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Professor entity.
	 */
	@Override
	public CompletableFuture<Professor> updateMergeProfessorRequest(Professor input) {
		br.com.senior.furb.basico.impl.UpdateMergeProfessorImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeProfessorImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeProfessorRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteProfessor
	 * This is a public operation
	 * The 'delete' request primitive for the Professor entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteProfessor(Professor.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteProfessorImpl impl = new br.com.senior.furb.basico.impl.DeleteProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteProfessor(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteProfessor
	 * This is a public operation
	 * The 'delete' request primitive for the Professor entity.
	 */
	@Override
	public void deleteProfessor(Professor.Id input) {
		br.com.senior.furb.basico.impl.DeleteProfessorImpl impl = new br.com.senior.furb.basico.impl.DeleteProfessorImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteProfessor(input);
	}
	
	/**
	 * Chamada síncrona para o método createMateria
	 * This is a public operation
	 * The 'create' request primitive for the Materia entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Materia createMateria(Materia input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMateriaImpl impl = new br.com.senior.furb.basico.impl.CreateMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMateria(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMateria
	 * This is a public operation
	 * The 'create' request primitive for the Materia entity.
	 */
	@Override
	public void createMateria(Materia input) {
		br.com.senior.furb.basico.impl.CreateMateriaImpl impl = new br.com.senior.furb.basico.impl.CreateMateriaImpl(messengerSupplier, userId, messageSupplier);
		impl.createMateria(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMateria
	 * This is a public operation
	 * The 'create' request primitive for the Materia entity.
	 */
	@Override
	public CompletableFuture<Materia> createMateriaRequest(Materia input) {
		br.com.senior.furb.basico.impl.CreateMateriaImpl impl = new br.com.senior.furb.basico.impl.CreateMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMateriaRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkMateria
	 * This is a public operation
	 * The 'createBulk' request primitive for the Materia entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkMateriaOutput createBulkMateria(CreateBulkMateriaInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkMateriaImpl impl = new br.com.senior.furb.basico.impl.CreateBulkMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkMateria(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkMateria
	 * This is a public operation
	 * The 'createBulk' request primitive for the Materia entity.
	 */
	@Override
	public void createBulkMateria(CreateBulkMateriaInput input) {
		br.com.senior.furb.basico.impl.CreateBulkMateriaImpl impl = new br.com.senior.furb.basico.impl.CreateBulkMateriaImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkMateria(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkMateria
	 * This is a public operation
	 * The 'createBulk' request primitive for the Materia entity.
	 */
	@Override
	public CompletableFuture<CreateBulkMateriaOutput> createBulkMateriaRequest(CreateBulkMateriaInput input) {
		br.com.senior.furb.basico.impl.CreateBulkMateriaImpl impl = new br.com.senior.furb.basico.impl.CreateBulkMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkMateriaRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeMateria
	 * This is a public operation
	 * The 'createMerge' request primitive for the Materia entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Materia createMergeMateria(Materia input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeMateriaImpl impl = new br.com.senior.furb.basico.impl.CreateMergeMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeMateria(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeMateria
	 * This is a public operation
	 * The 'createMerge' request primitive for the Materia entity.
	 */
	@Override
	public void createMergeMateria(Materia input) {
		br.com.senior.furb.basico.impl.CreateMergeMateriaImpl impl = new br.com.senior.furb.basico.impl.CreateMergeMateriaImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeMateria(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeMateria
	 * This is a public operation
	 * The 'createMerge' request primitive for the Materia entity.
	 */
	@Override
	public CompletableFuture<Materia> createMergeMateriaRequest(Materia input) {
		br.com.senior.furb.basico.impl.CreateMergeMateriaImpl impl = new br.com.senior.furb.basico.impl.CreateMergeMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeMateriaRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveMateria
	 * This is a public operation
	 * The 'retrieve' request primitive for the Materia entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Materia retrieveMateria(Materia.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveMateriaImpl impl = new br.com.senior.furb.basico.impl.RetrieveMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveMateria(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveMateria
	 * This is a public operation
	 * The 'retrieve' request primitive for the Materia entity.
	 */
	@Override
	public void retrieveMateria(Materia.Id input) {
		br.com.senior.furb.basico.impl.RetrieveMateriaImpl impl = new br.com.senior.furb.basico.impl.RetrieveMateriaImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveMateria(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveMateria
	 * This is a public operation
	 * The 'retrieve' request primitive for the Materia entity.
	 */
	@Override
	public CompletableFuture<Materia> retrieveMateriaRequest(Materia.Id input) {
		br.com.senior.furb.basico.impl.RetrieveMateriaImpl impl = new br.com.senior.furb.basico.impl.RetrieveMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveMateriaRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMateria
	 * This is a public operation
	 * The 'update' request primitive for the Materia entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Materia updateMateria(Materia input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMateriaImpl impl = new br.com.senior.furb.basico.impl.UpdateMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMateria(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMateria
	 * This is a public operation
	 * The 'update' request primitive for the Materia entity.
	 */
	@Override
	public void updateMateria(Materia input) {
		br.com.senior.furb.basico.impl.UpdateMateriaImpl impl = new br.com.senior.furb.basico.impl.UpdateMateriaImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMateria(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMateria
	 * This is a public operation
	 * The 'update' request primitive for the Materia entity.
	 */
	@Override
	public CompletableFuture<Materia> updateMateriaRequest(Materia input) {
		br.com.senior.furb.basico.impl.UpdateMateriaImpl impl = new br.com.senior.furb.basico.impl.UpdateMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMateriaRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeMateria
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Materia entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Materia updateMergeMateria(Materia input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeMateriaImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeMateria(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeMateria
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Materia entity.
	 */
	@Override
	public void updateMergeMateria(Materia input) {
		br.com.senior.furb.basico.impl.UpdateMergeMateriaImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeMateriaImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeMateria(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeMateria
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Materia entity.
	 */
	@Override
	public CompletableFuture<Materia> updateMergeMateriaRequest(Materia input) {
		br.com.senior.furb.basico.impl.UpdateMergeMateriaImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeMateriaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeMateriaRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteMateria
	 * This is a public operation
	 * The 'delete' request primitive for the Materia entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteMateria(Materia.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteMateriaImpl impl = new br.com.senior.furb.basico.impl.DeleteMateriaImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteMateria(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteMateria
	 * This is a public operation
	 * The 'delete' request primitive for the Materia entity.
	 */
	@Override
	public void deleteMateria(Materia.Id input) {
		br.com.senior.furb.basico.impl.DeleteMateriaImpl impl = new br.com.senior.furb.basico.impl.DeleteMateriaImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteMateria(input);
	}
	
	/**
	 * Chamada síncrona para o método createTurma
	 * This is a public operation
	 * The 'create' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Turma createTurma(Turma input, long timeout) {
		br.com.senior.furb.basico.impl.CreateTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createTurma
	 * This is a public operation
	 * The 'create' request primitive for the Turma entity.
	 */
	@Override
	public void createTurma(Turma input) {
		br.com.senior.furb.basico.impl.CreateTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.createTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método createTurma
	 * This is a public operation
	 * The 'create' request primitive for the Turma entity.
	 */
	@Override
	public CompletableFuture<Turma> createTurmaRequest(Turma input) {
		br.com.senior.furb.basico.impl.CreateTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkTurma
	 * This is a public operation
	 * The 'createBulk' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkTurmaOutput createBulkTurma(CreateBulkTurmaInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateBulkTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkTurma
	 * This is a public operation
	 * The 'createBulk' request primitive for the Turma entity.
	 */
	@Override
	public void createBulkTurma(CreateBulkTurmaInput input) {
		br.com.senior.furb.basico.impl.CreateBulkTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateBulkTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkTurma
	 * This is a public operation
	 * The 'createBulk' request primitive for the Turma entity.
	 */
	@Override
	public CompletableFuture<CreateBulkTurmaOutput> createBulkTurmaRequest(CreateBulkTurmaInput input) {
		br.com.senior.furb.basico.impl.CreateBulkTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateBulkTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeTurma
	 * This is a public operation
	 * The 'createMerge' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Turma createMergeTurma(Turma input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateMergeTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeTurma
	 * This is a public operation
	 * The 'createMerge' request primitive for the Turma entity.
	 */
	@Override
	public void createMergeTurma(Turma input) {
		br.com.senior.furb.basico.impl.CreateMergeTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateMergeTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeTurma
	 * This is a public operation
	 * The 'createMerge' request primitive for the Turma entity.
	 */
	@Override
	public CompletableFuture<Turma> createMergeTurmaRequest(Turma input) {
		br.com.senior.furb.basico.impl.CreateMergeTurmaImpl impl = new br.com.senior.furb.basico.impl.CreateMergeTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveTurma
	 * This is a public operation
	 * The 'retrieve' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Turma retrieveTurma(Turma.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveTurmaImpl impl = new br.com.senior.furb.basico.impl.RetrieveTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveTurma
	 * This is a public operation
	 * The 'retrieve' request primitive for the Turma entity.
	 */
	@Override
	public void retrieveTurma(Turma.Id input) {
		br.com.senior.furb.basico.impl.RetrieveTurmaImpl impl = new br.com.senior.furb.basico.impl.RetrieveTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveTurma
	 * This is a public operation
	 * The 'retrieve' request primitive for the Turma entity.
	 */
	@Override
	public CompletableFuture<Turma> retrieveTurmaRequest(Turma.Id input) {
		br.com.senior.furb.basico.impl.RetrieveTurmaImpl impl = new br.com.senior.furb.basico.impl.RetrieveTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateTurma
	 * This is a public operation
	 * The 'update' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Turma updateTurma(Turma input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateTurmaImpl impl = new br.com.senior.furb.basico.impl.UpdateTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateTurma
	 * This is a public operation
	 * The 'update' request primitive for the Turma entity.
	 */
	@Override
	public void updateTurma(Turma input) {
		br.com.senior.furb.basico.impl.UpdateTurmaImpl impl = new br.com.senior.furb.basico.impl.UpdateTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.updateTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateTurma
	 * This is a public operation
	 * The 'update' request primitive for the Turma entity.
	 */
	@Override
	public CompletableFuture<Turma> updateTurmaRequest(Turma input) {
		br.com.senior.furb.basico.impl.UpdateTurmaImpl impl = new br.com.senior.furb.basico.impl.UpdateTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeTurma
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Turma updateMergeTurma(Turma input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeTurmaImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeTurma
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Turma entity.
	 */
	@Override
	public void updateMergeTurma(Turma input) {
		br.com.senior.furb.basico.impl.UpdateMergeTurmaImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeTurma(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeTurma
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Turma entity.
	 */
	@Override
	public CompletableFuture<Turma> updateMergeTurmaRequest(Turma input) {
		br.com.senior.furb.basico.impl.UpdateMergeTurmaImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeTurmaImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeTurmaRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteTurma
	 * This is a public operation
	 * The 'delete' request primitive for the Turma entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteTurma(Turma.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteTurmaImpl impl = new br.com.senior.furb.basico.impl.DeleteTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteTurma(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteTurma
	 * This is a public operation
	 * The 'delete' request primitive for the Turma entity.
	 */
	@Override
	public void deleteTurma(Turma.Id input) {
		br.com.senior.furb.basico.impl.DeleteTurmaImpl impl = new br.com.senior.furb.basico.impl.DeleteTurmaImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteTurma(input);
	}
	


	/**
	* Chamada assíncrona para o método publishServiceStarted
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishServiceStarted( ServiceStartedPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.SERVICE_STARTED, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishNotifyUserEvent( NotifyUserEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.NOTIFY_USER_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportAlunoEvent
	* This is a public operation
	*/
	public void publishImportAlunoEvent( ImportAlunoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_ALUNO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportAlunoEvent
	* This is a public operation
	*/
	public void publishExportAlunoEvent( ExportAlunoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_ALUNO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportProfessorEvent
	* This is a public operation
	*/
	public void publishImportProfessorEvent( ImportProfessorEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_PROFESSOR_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportProfessorEvent
	* This is a public operation
	*/
	public void publishExportProfessorEvent( ExportProfessorEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_PROFESSOR_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportMateriaEvent
	* This is a public operation
	*/
	public void publishImportMateriaEvent( ImportMateriaEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_MATERIA_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportMateriaEvent
	* This is a public operation
	*/
	public void publishExportMateriaEvent( ExportMateriaEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_MATERIA_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportTurmaEvent
	* This is a public operation
	*/
	public void publishImportTurmaEvent( ImportTurmaEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_TURMA_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportTurmaEvent
	* This is a public operation
	*/
	public void publishExportTurmaEvent( ExportTurmaEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_TURMA_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	

	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
