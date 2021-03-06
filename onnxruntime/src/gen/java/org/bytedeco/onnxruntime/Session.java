// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class Session extends BaseSession {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Session(Pointer p) { super(p); }

  public Session(@ByRef Env env, @Cast("const ORTCHAR_T*") Pointer model_path, @Const @ByRef SessionOptions options) { super((Pointer)null); allocate(env, model_path, options); }
  private native void allocate(@ByRef Env env, @Cast("const ORTCHAR_T*") Pointer model_path, @Const @ByRef SessionOptions options);
  public Session(@ByRef Env env, @Const Pointer model_data, @Cast("size_t") long model_data_length, @Const @ByRef SessionOptions options) { super((Pointer)null); allocate(env, model_data, model_data_length, options); }
  private native void allocate(@ByRef Env env, @Const Pointer model_data, @Cast("size_t") long model_data_length, @Const @ByRef SessionOptions options);

  // Run that will allocate the output values
  public native @StdMove ValueVector Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") PointerPointer input_names, @Const Value input_values, @Cast("size_t") long input_count,
                           @Cast("const char*const*") PointerPointer output_names, @Cast("size_t") long output_count);
  public native @StdMove ValueVector Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") @ByPtrPtr BytePointer input_names, @Const Value input_values, @Cast("size_t") long input_count,
                           @Cast("const char*const*") @ByPtrPtr BytePointer output_names, @Cast("size_t") long output_count);
  public native @StdMove ValueVector Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") @ByPtrPtr ByteBuffer input_names, @Const Value input_values, @Cast("size_t") long input_count,
                           @Cast("const char*const*") @ByPtrPtr ByteBuffer output_names, @Cast("size_t") long output_count);
  public native @StdMove ValueVector Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") @ByPtrPtr byte[] input_names, @Const Value input_values, @Cast("size_t") long input_count,
                           @Cast("const char*const*") @ByPtrPtr byte[] output_names, @Cast("size_t") long output_count);
  // Run for when there is a list of prealloated outputs
  public native void Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") PointerPointer input_names, @Const Value input_values, @Cast("size_t") long input_count,
             @Cast("const char*const*") PointerPointer output_names, Value output_values, @Cast("size_t") long output_count);
  public native void Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") @ByPtrPtr BytePointer input_names, @Const Value input_values, @Cast("size_t") long input_count,
             @Cast("const char*const*") @ByPtrPtr BytePointer output_names, Value output_values, @Cast("size_t") long output_count);
  public native void Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") @ByPtrPtr ByteBuffer input_names, @Const Value input_values, @Cast("size_t") long input_count,
             @Cast("const char*const*") @ByPtrPtr ByteBuffer output_names, Value output_values, @Cast("size_t") long output_count);
  public native void Run(@Const @ByRef RunOptions run_options, @Cast("const char*const*") @ByPtrPtr byte[] input_names, @Const Value input_values, @Cast("size_t") long input_count,
             @Cast("const char*const*") @ByPtrPtr byte[] output_names, Value output_values, @Cast("size_t") long output_count);

  public native @Cast("size_t") long GetInputCount();
  public native @Cast("size_t") long GetOutputCount();
  public native @Cast("size_t") long GetOverridableInitializerCount();

  public native @Cast("char*") BytePointer GetInputName(@Cast("size_t") long index, OrtAllocator allocator);
  public native @Cast("char*") BytePointer GetOutputName(@Cast("size_t") long index, OrtAllocator allocator);
  public native @Cast("char*") BytePointer GetOverridableInitializerName(@Cast("size_t") long index, OrtAllocator allocator);
  public native @Cast("char*") BytePointer EndProfiling(OrtAllocator allocator);
  public native @ByVal ModelMetadata GetModelMetadata();

  public native @ByVal TypeInfo GetInputTypeInfo(@Cast("size_t") long index);
  public native @ByVal TypeInfo GetOutputTypeInfo(@Cast("size_t") long index);
  public native @ByVal TypeInfo GetOverridableInitializerTypeInfo(@Cast("size_t") long index);
}
