/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Aluno;

/**
 * Response method for createAluno
 */
@CommandDescription(name="createAlunoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createAlunoResponse")
public interface CreateAlunoResponse extends MessageHandler {

	void createAlunoResponse(Aluno response);
	
	void createAlunoResponseError(ErrorPayload error);

}
