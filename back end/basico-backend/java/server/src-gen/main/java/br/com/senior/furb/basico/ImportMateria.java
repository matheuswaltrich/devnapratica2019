/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importMateria", kind=CommandKind.Action, requestPrimitive="importMateria", responsePrimitive="importMateriaResponse")
public interface ImportMateria extends MessageHandler {
    
    public ImportMateriaOutput importMateria(ImportMateriaInput request);
    
}
