/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Aluno entity.
 */
@CommandDescription(name="updateAluno", kind=CommandKind.Update, requestPrimitive="updateAluno", responsePrimitive="updateAlunoResponse")
public interface UpdateAluno extends MessageHandler {
    
    public Aluno updateAluno(Aluno toUpdate);
    
}
