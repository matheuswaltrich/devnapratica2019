/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportMateria", kind=CommandKind.Query, requestPrimitive="exportMateria", responsePrimitive="exportMateriaResponse")
public interface ExportMateria extends MessageHandler {
    
    public ExportMateriaOutput exportMateria(ExportMateriaInput request);
    
}
