package org.jnotifys.impl.monitoring;

import org.jnotifyfs.impl.ressource.filesystem.FileSystem;
import org.jnotifyjs.api.EventListener;
import org.jnotifyjs.descriptor.Modification.ModificationDescriptor;
import org.jnotifyjs.descriptor.Renamming.RenammingDescriptor;
import org.jnotifyjs.descriptor.creation.CreationDescriptor;
import org.jnotifyjs.descriptor.deletion.DeletionDescriptor;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/8/11
 * Time: 9:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class EventListenerImpl implements EventListener<FileSystem>{
    public CreationDescriptor<FileSystem> resourceCreated() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public DeletionDescriptor<FileSystem> resourceDeleted() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public ModificationDescriptor<FileSystem> resourceModified() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public RenammingDescriptor<FileSystem> resourceRenamed() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
