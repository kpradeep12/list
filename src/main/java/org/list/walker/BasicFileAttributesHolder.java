package org.list.walker;


import java.nio.file.attribute.BasicFileAttributes;

public interface BasicFileAttributesHolder {

    /**

     * Returns cached attributes (may be null). If file is a symbolic link then

     * the attributes are the link attributes and not the final target of the

     * file.

     */

    BasicFileAttributes get();


    /**

     * Invalidates cached attributes

     */

    void invalidate();

}
