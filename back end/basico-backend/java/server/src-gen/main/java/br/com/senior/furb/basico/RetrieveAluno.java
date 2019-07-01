/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Aluno entity.
 */
@CommandDescription(name="retrieveAluno", kind=CommandKind.Retrieve, requestPrimitive="retrieveAluno", responsePrimitive="retrieveAlunoResponse")
public interface RetrieveAluno extends MessageHandler {
    
    public Aluno retrieveAluno(Aluno.Id id);
    
}
