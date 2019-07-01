/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Aluno entity.
 */
@CommandDescription(name="listAluno", kind=CommandKind.List, requestPrimitive="listAluno", responsePrimitive="listAlunoResponse")
public interface ListAluno extends MessageHandler {
    
    public Aluno.PagedResults listAluno(Aluno.PageRequest pageRequest);
    
}
