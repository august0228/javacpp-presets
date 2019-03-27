// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IRuntime
 * 
 *  \brief Allows a serialized engine to be deserialized.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IRuntime extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IRuntime(Pointer p) { super(p); }

    /**
     *  \brief Deserialize an engine from a stream.
     * 
     *  @param blob The memory that holds the serialized engine.
     *  @param size The size of the memory.
     *  @param pluginFactory The plugin factory, if any plugins are used by the network, otherwise nullptr.
     * 
     *  @return The engine, or nullptr if it could not be deserialized.
     *  */
    
    
    //!
    //!
    public native ICudaEngine deserializeCudaEngine(@Const Pointer blob, @Cast("std::size_t") long size, IPluginFactory pluginFactory);

    /**
     *  \brief Set the DLA core that the deserialized engine must execute on.
     *  @param dlaCore The DLA core to execute the engine on (0 to N-1, where N is the maximum number of DLA's present on the device). Default value is 0.
     *  @see getDLACore()
     *  */
    
    
    //!
    //!
    public native void setDLACore(int dlaCore);

    /**
     *  \brief Get the DLA core that the engine executes on.
     *  @return If setDLACore is called, returns DLA core from 0 to N-1, else returns 0.
     *  */
    
    
    //!
    //!
    public native int getDLACore();

    /**
     *  \brief Returns number of DLA hardware cores accessible.
     *  */
    
    
    //!
    //!
    public native int getNbDLACores();

    /**
     *  \brief Destroy this object.
     *  */
    public native void destroy();
    /**
     *  \brief Set the GPU allocator.
     *  @param allocator Set the GPU allocator to be used by the runtime. All GPU memory acquired will use this allocator. If NULL is passed, the default allocator will be used.
     * 
     *  Default: uses cudaMalloc/cudaFree.
     * 
     *  If nullptr is passed, the default allocator will be used.
     *  */
    public native void setGpuAllocator(IGpuAllocator allocator);
}