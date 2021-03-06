// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** LBR GRU forward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class lbr_gru_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public lbr_gru_forward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public lbr_gru_forward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public lbr_gru_forward position(long position) {
        return (lbr_gru_forward)super.position(position);
    }

    /** Descriptor for an LBR GRU forward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        ///
        ///
        ///
        ///
        public native @ByRef dnnl_rnn_desc_t data(); public native desc data(dnnl_rnn_desc_t setter);

        /** Constructs a descriptor for LBR GRU forward propagation primitive.
         * 
         *  The \p src_iter_desc, \p bias_desc, and \p dst_iter, may point to
         *  a zero memory descriptor. This would then indicate that the LBR
         *  GRU forward propagation primitive should not use them and should
         *  default to zero values instead.
         * 
         *  \note
         *      All memory descriptors except \p src_iter_desc can be
         *      initialized with an #dnnl::memory::format_tag::any value of \p
         *      format_tag.
         * 
         *  Inputs:
         *   - src_layer (#dnnl::primitive_desc_base::src_desc (0))
         *   - src_iter (#dnnl::primitive_desc_base::src_desc (1)), if used
         *   - weights_layer (#dnnl::primitive_desc_base::weights_desc (0))
         *   - weights_iter (#dnnl::primitive_desc_base::weights_desc (1))
         *   - bias (#dnnl::primitive_desc_base::weights_desc (2)), if used
         * 
         *  Outputs:
         *   - dst_layer (#dnnl::primitive_desc_base::dst_desc (0))
         *   - dst_iter (#dnnl::primitive_desc_base::dst_desc (1)), if used
         *   - workspace (#dnnl::primitive_desc_base::workspace_desc (0)),
         *      if \p prop_kind equals #dnnl::prop_kind::forward_training;
         *      must be queried for using \ref
         *      dnnl::primitive_desc_base::query_md() after a corresponding
         *      primitive descriptor is created
         * 
         *  @param prop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::forward_training, and
         *      #dnnl::prop_kind::forward_inference.
         *  @param direction RNN direction. See \ref dnnl::rnn_direction for
         *      more info.
         *  @param src_layer_desc Memory descriptor for the input vector.
         *  @param src_iter_desc Memory descriptor for the input recurrent
         *      hidden state vector.
         *  @param weights_layer_desc Memory descriptor for the weights
         *      applied to the layer input.
         *  @param weights_iter_desc Memory descriptor for the weights applied
         *      to the recurrent input.
         *  @param bias_desc Bias memory descriptor.
         *  @param dst_layer_desc Memory descriptor for the output vector.
         *  @param dst_iter_desc Memory descriptor for the output recurrent
         *      hidden state vector.
         *  @param flags Unused. */
        public desc(prop_kind prop_kind, rnn_direction direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        rnn_flags flags/*=dnnl::rnn_flags::undef*/) { super((Pointer)null); allocate(prop_kind, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, flags); }
        private native void allocate(prop_kind prop_kind, rnn_direction direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        rnn_flags flags/*=dnnl::rnn_flags::undef*/);
        public desc(prop_kind prop_kind, rnn_direction direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc) { super((Pointer)null); allocate(prop_kind, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc); }
        private native void allocate(prop_kind prop_kind, rnn_direction direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc);
        public desc(@Cast("dnnl::prop_kind") int prop_kind, @Cast("dnnl::rnn_direction") int direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Cast("dnnl::rnn_flags") int flags/*=dnnl::rnn_flags::undef*/) { super((Pointer)null); allocate(prop_kind, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, flags); }
        private native void allocate(@Cast("dnnl::prop_kind") int prop_kind, @Cast("dnnl::rnn_direction") int direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Cast("dnnl::rnn_flags") int flags/*=dnnl::rnn_flags::undef*/);
        public desc(@Cast("dnnl::prop_kind") int prop_kind, @Cast("dnnl::rnn_direction") int direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc) { super((Pointer)null); allocate(prop_kind, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc); }
        private native void allocate(@Cast("dnnl::prop_kind") int prop_kind, @Cast("dnnl::rnn_direction") int direction,
                        @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc);
    }

    /** Primitive descriptor for an LBR GRU forward propagation primitive. */
    public static class primitive_desc extends rnn_primitive_desc_base {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for a LBR GRU forward
         *  propagation primitive.
         * 
         *  @param desc Descriptor for a LBR GRU forward propagation
         *      primitive.
         *  @param engine Engine to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, engine, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine engine) { super((Pointer)null); allocate(desc, engine); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine engine);

        /** Constructs a primitive descriptor for a LBR GRU forward
         *  propagation primitive.
         * 
         *  @param desc Descriptor for a LBR GRU forward propagation
         *      primitive.
         *  @param attr Primitive attributes to use.
         *  @param engine Engine to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine, @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, attr, engine, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine, @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine) { super((Pointer)null); allocate(desc, attr, engine); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine);

        /** Constructs a primitive descriptor for a LBR GRU forward propagation
         *  primitive from a C API primitive descriptor that must have a
         *  matching kind.
         * 
         *  @param pd C API primitive descriptor for a LBR GRU forward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::rnn_primitive_desc_base::src_layer_desc()const */
        public native @ByVal memory.desc src_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::src_iter_desc()const */
        public native @ByVal memory.desc src_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::weights_layer_desc()const */
        public native @ByVal memory.desc weights_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::weights_iter_desc()const */
        public native @ByVal memory.desc weights_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::bias_desc()const */
        public native @ByVal memory.desc bias_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::dst_layer_desc()const */
        public native @ByVal memory.desc dst_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::dst_iter_desc()const */
        public native @ByVal memory.desc dst_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::workspace_desc()const */
        public native @ByVal memory.desc workspace_desc();
    }

    /** Default constructor. Produces an empty object. */
    public lbr_gru_forward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs an LBR GRU forward propagation primitive.
     *  @param pd Primitive descriptor for an LBR GRU forward propagation
     *      primitive. */
    public lbr_gru_forward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
