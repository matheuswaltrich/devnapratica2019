/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@SubscriptionDescription(domain="furb", service="basico", event="importMateriaEvent")
public interface ImportMateriaEvent extends MessageHandler {
    public void importMateriaEvent(ImportMateriaEventPayload payload);
    
}
