/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkMateria", kind = CommandKind.Create, requestPrimitive = "createBulkMateria", responsePrimitive="")
public interface CreateBulkMateria extends MessageHandler {
    public CreateBulkMateriaOutput createBulkMateria(CreateBulkMateriaInput toCreate);
}
