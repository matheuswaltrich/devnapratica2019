/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Aluno entity.
 */
@CommandDescription(name="createAluno", kind=CommandKind.Create, requestPrimitive="createAluno", responsePrimitive="createAlunoResponse")
public interface CreateAluno extends MessageHandler {
    
    public Aluno createAluno(Aluno toCreate);
    
}
