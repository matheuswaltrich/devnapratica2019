/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkProfessor", kind = CommandKind.Create, requestPrimitive = "createBulkProfessor", responsePrimitive="")
public interface CreateBulkProfessor extends MessageHandler {
    public CreateBulkProfessorOutput createBulkProfessor(CreateBulkProfessorInput toCreate);
}
