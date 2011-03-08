package org.jnotifys.impl.monitoring;

import org.jnotifyfs.impl.ressource.filesystem.FileSystem;
import org.jnotifyfs.impl.ressource.filesystem.FileSystemRessource;
import org.jnotifyfs.impl.ressource.filesystem.FileSystemType;
import org.jnotifyjs.api.EventListener;
import org.jnotifyjs.api.Monitor;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/8/11
 * Time: 9:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class MonitorImpl implements Monitor<FileSystemRessource,FileSystemType,FileSystem>{
    EventListener<FileSystem> listener =  new EventListenerImpl<FileSystem>();
    public void addListener(EventListener<FileSystem> list) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void startListening() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void lookForCreationEvent() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void lookForDeletionEvent() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void lookForRenammingEvent() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void lookForModificationEvent() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void raiseCreationEvent() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void raiseDeletionEvent() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void raiseRenammingEvent() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void raiseModificationEvent() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
