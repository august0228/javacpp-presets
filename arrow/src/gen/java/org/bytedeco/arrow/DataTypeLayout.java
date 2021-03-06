// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;
  // namespace detail

@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class DataTypeLayout extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DataTypeLayout() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DataTypeLayout(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataTypeLayout(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DataTypeLayout position(long position) {
        return (DataTypeLayout)super.position(position);
    }

  // The bit width for each buffer in this DataType's representation
  // (kVariableSizeBuffer if the item size for a given buffer is unknown or variable,
  //  kAlwaysNullBuffer if the buffer is always null).
  // Child types are not included, they should be inspected separately.
  public native @Cast("int64_t*") @StdVector LongPointer bit_widths(); public native DataTypeLayout bit_widths(LongPointer setter);
  public native @Cast("bool") boolean has_dictionary(); public native DataTypeLayout has_dictionary(boolean setter);

  @MemberGetter public static native @Cast("const int64_t") long kAlwaysNullBuffer();
  public static final long kAlwaysNullBuffer = kAlwaysNullBuffer();
  @MemberGetter public static native @Cast("const int64_t") long kVariableSizeBuffer();
  public static final long kVariableSizeBuffer = kVariableSizeBuffer();
}
