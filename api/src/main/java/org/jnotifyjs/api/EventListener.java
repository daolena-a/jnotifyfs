package org.jnotifyjs.api;

import org.jnotifyjs.descriptor.ActionDescriptor;
import org.jnotifyjs.descriptor.Modification.ModificationDescriptor;
import org.jnotifyjs.descriptor.Renamming.RenammingDescriptor;
import org.jnotifyjs.descriptor.creation.CreationDescriptor;
import org.jnotifyjs.descriptor.deletion.DeletionDescriptor;
import org.jnotifyjs.ressource.Ressource;
import org.jnotifyjs.ressource.Support;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/5/11
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
public  interface  EventListener {
    public CreationDescriptor   resourceCreated();
    public DeletionDescriptor  resourceDeleted ( );
    public ModificationDescriptor   resourceModified ();
    public RenammingDescriptor resourceRenamed ( );


}
