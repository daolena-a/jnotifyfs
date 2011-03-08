package org.jnotifyjs.descriptor.creation;

import org.jnotifyjs.descriptor.ActionDescriptor;
import org.jnotifyjs.ressource.Ressource;
import org.jnotifyjs.ressource.Support;
import sun.security.krb5.internal.ccache.Credentials;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/5/11
 * Time: 10:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreationDescriptor extends ActionDescriptor {
    Ressource ressourceCreated;
    public CreationDescriptor(Ressource res){
        ressourceCreated = res;
    }
    public Ressource getRessource(){
        return ressourceCreated;
    }
    @Override
    public String whatHappened() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
