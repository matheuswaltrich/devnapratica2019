/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkAluno", kind = CommandKind.Create, requestPrimitive = "createBulkAluno", responsePrimitive="")
public interface CreateBulkAluno extends MessageHandler {
    public CreateBulkAlunoOutput createBulkAluno(CreateBulkAlunoInput toCreate);
}
