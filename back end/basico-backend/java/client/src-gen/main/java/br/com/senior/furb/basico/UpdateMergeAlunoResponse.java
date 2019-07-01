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
 * Response method for updateMergeAluno
 */
@CommandDescription(name="updateMergeAlunoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeAlunoResponse")
public interface UpdateMergeAlunoResponse extends MessageHandler {

	void updateMergeAlunoResponse(Aluno response);
	
	void updateMergeAlunoResponseError(ErrorPayload error);

}
