/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Aluno entity.
 */
@CommandDescription(name="deleteAluno", kind=CommandKind.Delete, requestPrimitive="deleteAluno", responsePrimitive="deleteAlunoResponse")
public interface DeleteAluno extends MessageHandler {
    
    public void deleteAluno(Aluno.Id id);
    
}
