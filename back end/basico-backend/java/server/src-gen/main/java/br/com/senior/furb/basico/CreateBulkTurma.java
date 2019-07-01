/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkTurma", kind = CommandKind.Create, requestPrimitive = "createBulkTurma", responsePrimitive="")
public interface CreateBulkTurma extends MessageHandler {
    public CreateBulkTurmaOutput createBulkTurma(CreateBulkTurmaInput toCreate);
}
