package org.jnotifyjs.api;

import org.jnotifyjs.ressource.Ressource;
import org.jnotifyjs.ressource.Support;
import org.jnotifyjs.ressource.SupportType;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/5/11
 * Time: 11:36 PM
 * To change this template use File | Settings | File Templates.
 */
public  interface  Monitor {

    public void addListener(EventListener list);
    public void startListening();
    public void lookForCreationEvent();
    public void lookForDeletionEvent();
    public void lookForRenammingEvent();
    public void lookForModificationEvent();
    public void raiseCreationEvent();
    public void raiseDeletionEvent();
    public void raiseRenammingEvent();
    public void raiseModificationEvent();

}
