/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Turma entity.
 */
@CommandDescription(name="listTurma", kind=CommandKind.List, requestPrimitive="listTurma", responsePrimitive="listTurmaResponse")
public interface ListTurma extends MessageHandler {
    
    public Turma.PagedResults listTurma(Turma.PageRequest pageRequest);
    
}
