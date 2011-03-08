package org.jnotifyfs.impl.ressource.filesystem;

import org.jnotifyjs.ressource.SupportType;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/6/11
 * Time: 12:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class FileSystemType extends SupportType {
    @Override
    public FileSystemRessource getRessource(String path2ressource) {
         File f = new File(path2ressource);
        return new FileSystemRessource(f);

    }
}
