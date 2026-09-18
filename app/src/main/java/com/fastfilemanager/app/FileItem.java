package com.fastfilemanager.app;
import java.io.File;
public class FileItem { public final File file; public FileItem(File f){file=f;} public boolean isDir(){return file.isDirectory();} }
