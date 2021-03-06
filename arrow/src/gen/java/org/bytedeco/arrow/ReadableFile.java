// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief An operating system file open in read-only mode.
 * 
 *  Reads through this implementation are unbuffered.  If many small reads
 *  need to be issued, it is recommended to use a buffering layer for good
 *  performance. */
@Namespace("arrow::io") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ReadableFile extends ReadableFileRandomAccessFileConcurrencyWrapper {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReadableFile(Pointer p) { super(p); }


  /** \brief Open a local file for reading
   *  @param path [in] with UTF8 encoding
   *  @param pool [in] a MemoryPool for memory allocations
   *  @return ReadableFile instance */
  public static native @ByVal ReadableFileResult Open(
        @StdString String path, MemoryPool pool/*=arrow::default_memory_pool()*/);
  public static native @ByVal ReadableFileResult Open(
        @StdString String path);
  public static native @ByVal ReadableFileResult Open(
        @StdString BytePointer path, MemoryPool pool/*=arrow::default_memory_pool()*/);
  public static native @ByVal ReadableFileResult Open(
        @StdString BytePointer path);

  public static native @Deprecated @ByVal Status Open(@StdString String path, @SharedPtr ReadableFile file);
  public static native @Deprecated @ByVal Status Open(@StdString BytePointer path, @SharedPtr ReadableFile file);
  
  ///
  public static native @Deprecated @ByVal Status Open(@StdString String path, MemoryPool pool,
                       @SharedPtr ReadableFile file);
  public static native @Deprecated @ByVal Status Open(@StdString BytePointer path, MemoryPool pool,
                       @SharedPtr ReadableFile file);

  /** \brief Open a local file for reading
   *  @param fd [in] file descriptor
   *  @param pool [in] a MemoryPool for memory allocations
   *  @return ReadableFile instance
   * 
   *  The file descriptor becomes owned by the ReadableFile, and will be closed
   *  on Close() or destruction. */
  public static native @ByVal ReadableFileResult Open(
        int fd, MemoryPool pool/*=arrow::default_memory_pool()*/);
  public static native @ByVal ReadableFileResult Open(
        int fd);

  public static native @Deprecated @ByVal Status Open(int fd, @SharedPtr ReadableFile file);
  public static native @Deprecated @ByVal Status Open(int fd, MemoryPool pool, @SharedPtr ReadableFile file);

  public native @Cast("bool") boolean closed();

  public native int file_descriptor();
}
