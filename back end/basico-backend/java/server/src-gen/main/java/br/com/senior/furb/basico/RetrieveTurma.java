/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Turma entity.
 */
@CommandDescription(name="retrieveTurma", kind=CommandKind.Retrieve, requestPrimitive="retrieveTurma", responsePrimitive="retrieveTurmaResponse")
public interface RetrieveTurma extends MessageHandler {
    
    public Turma retrieveTurma(Turma.Id id);
    
}
