// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief A basic component of a Dataset which yields zero or more
 *  Fragments. A Source acts as a discovery mechanism of Fragments
 *  and partitions, e.g. files deeply nested in a directory. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class Source extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Source(Pointer p) { super(p); }

  /** \brief GetFragments returns an iterator of Fragments. The ScanOptions
   *  controls filtering and schema inference. */
  public native @ByVal @Cast("arrow::dataset::FragmentIterator*") ScanTaskIterator GetFragments(@SharedPtr ScanOptions options);

  public native @Const @SharedPtr @ByRef Schema schema();

  /** \brief An expression which evaluates to true for all data viewed by this Source.
   *  May be null, which indicates no information is available. */
  public native @Const @SharedPtr @ByRef Expression partition_expression();

  /** \brief The name identifying the kind of source */
  public native @StdString String type_name();
}
