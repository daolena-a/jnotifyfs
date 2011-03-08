package org.jnotifyfs.impl.ressource.filesystem;

import org.jnotifyjs.ressource.Ressource;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: adrien
 * Date: 3/6/11
 * Time: 12:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class FileSystemRessource<File> extends Ressource{

    File resource;
    public FileSystemRessource (File file){
        resource = file;
    }
}
