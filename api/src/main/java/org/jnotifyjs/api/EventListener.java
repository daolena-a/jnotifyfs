package org.jnotifyjs.api;

import org.jnotifyjs.descriptor.ActionDescriptor;
import org.jnotifyjs.descriptor.Modification.ModificationDescriptor;
import org.jnotifyjs.descriptor.Renamming.RenammingDescriptor;
import org.jnotifyjs.descriptor.creation.CreationDescriptor;
import org.jnotifyjs.descriptor.deletion.DeletionDescriptor;
import org.jnotifyjs.ressource.Ressource;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/5/11
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
public  interface  EventListener <T extends Ressource> {
    public void  ressourceCreated(CreationDescriptor<T> desc);
    public void  ressourceDeleted (DeletionDescriptor<T> desc);
    public void  ressourceModified (ModificationDescriptor<T> desc);
    public void  ressourceRenamed (RenammingDescriptor<T> desc);


}
