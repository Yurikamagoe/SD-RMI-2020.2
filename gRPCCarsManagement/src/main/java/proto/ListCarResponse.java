// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car.proto

package proto;

/**
 * Protobuf type {@code proto.ListCarResponse}
 */
public  final class ListCarResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ListCarResponse)
    ListCarResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCarResponse.newBuilder() to construct.
  private ListCarResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCarResponse() {
    car_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListCarResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              car_ = new java.util.ArrayList<proto.Car>();
              mutable_bitField0_ |= 0x00000001;
            }
            car_.add(
                input.readMessage(proto.Car.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        car_ = java.util.Collections.unmodifiableList(car_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.CarOuterClass.internal_static_proto_ListCarResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.CarOuterClass.internal_static_proto_ListCarResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.ListCarResponse.class, proto.ListCarResponse.Builder.class);
  }

  public static final int CAR_FIELD_NUMBER = 1;
  private java.util.List<proto.Car> car_;
  /**
   * <code>repeated .proto.Car car = 1;</code>
   */
  public java.util.List<proto.Car> getCarList() {
    return car_;
  }
  /**
   * <code>repeated .proto.Car car = 1;</code>
   */
  public java.util.List<? extends proto.CarOrBuilder> 
      getCarOrBuilderList() {
    return car_;
  }
  /**
   * <code>repeated .proto.Car car = 1;</code>
   */
  public int getCarCount() {
    return car_.size();
  }
  /**
   * <code>repeated .proto.Car car = 1;</code>
   */
  public proto.Car getCar(int index) {
    return car_.get(index);
  }
  /**
   * <code>repeated .proto.Car car = 1;</code>
   */
  public proto.CarOrBuilder getCarOrBuilder(
      int index) {
    return car_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < car_.size(); i++) {
      output.writeMessage(1, car_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < car_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, car_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof proto.ListCarResponse)) {
      return super.equals(obj);
    }
    proto.ListCarResponse other = (proto.ListCarResponse) obj;

    boolean result = true;
    result = result && getCarList()
        .equals(other.getCarList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCarCount() > 0) {
      hash = (37 * hash) + CAR_FIELD_NUMBER;
      hash = (53 * hash) + getCarList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.ListCarResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ListCarResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ListCarResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ListCarResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ListCarResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ListCarResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ListCarResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.ListCarResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.ListCarResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.ListCarResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.ListCarResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.ListCarResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.ListCarResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.ListCarResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ListCarResponse)
      proto.ListCarResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.CarOuterClass.internal_static_proto_ListCarResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.CarOuterClass.internal_static_proto_ListCarResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.ListCarResponse.class, proto.ListCarResponse.Builder.class);
    }

    // Construct using proto.ListCarResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getCarFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (carBuilder_ == null) {
        car_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        carBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.CarOuterClass.internal_static_proto_ListCarResponse_descriptor;
    }

    @java.lang.Override
    public proto.ListCarResponse getDefaultInstanceForType() {
      return proto.ListCarResponse.getDefaultInstance();
    }

    @java.lang.Override
    public proto.ListCarResponse build() {
      proto.ListCarResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.ListCarResponse buildPartial() {
      proto.ListCarResponse result = new proto.ListCarResponse(this);
      int from_bitField0_ = bitField0_;
      if (carBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          car_ = java.util.Collections.unmodifiableList(car_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.car_ = car_;
      } else {
        result.car_ = carBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof proto.ListCarResponse) {
        return mergeFrom((proto.ListCarResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.ListCarResponse other) {
      if (other == proto.ListCarResponse.getDefaultInstance()) return this;
      if (carBuilder_ == null) {
        if (!other.car_.isEmpty()) {
          if (car_.isEmpty()) {
            car_ = other.car_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCarIsMutable();
            car_.addAll(other.car_);
          }
          onChanged();
        }
      } else {
        if (!other.car_.isEmpty()) {
          if (carBuilder_.isEmpty()) {
            carBuilder_.dispose();
            carBuilder_ = null;
            car_ = other.car_;
            bitField0_ = (bitField0_ & ~0x00000001);
            carBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCarFieldBuilder() : null;
          } else {
            carBuilder_.addAllMessages(other.car_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      proto.ListCarResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.ListCarResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<proto.Car> car_ =
      java.util.Collections.emptyList();
    private void ensureCarIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        car_ = new java.util.ArrayList<proto.Car>(car_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Car, proto.Car.Builder, proto.CarOrBuilder> carBuilder_;

    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public java.util.List<proto.Car> getCarList() {
      if (carBuilder_ == null) {
        return java.util.Collections.unmodifiableList(car_);
      } else {
        return carBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public int getCarCount() {
      if (carBuilder_ == null) {
        return car_.size();
      } else {
        return carBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public proto.Car getCar(int index) {
      if (carBuilder_ == null) {
        return car_.get(index);
      } else {
        return carBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public Builder setCar(
        int index, proto.Car value) {
      if (carBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarIsMutable();
        car_.set(index, value);
        onChanged();
      } else {
        carBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public Builder setCar(
        int index, proto.Car.Builder builderForValue) {
      if (carBuilder_ == null) {
        ensureCarIsMutable();
        car_.set(index, builderForValue.build());
        onChanged();
      } else {
        carBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public Builder addCar(proto.Car value) {
      if (carBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarIsMutable();
        car_.add(value);
        onChanged();
      } else {
        carBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public Builder addCar(
        int index, proto.Car value) {
      if (carBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarIsMutable();
        car_.add(index, value);
        onChanged();
      } else {
        carBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public Builder addCar(
        proto.Car.Builder builderForValue) {
      if (carBuilder_ == null) {
        ensureCarIsMutable();
        car_.add(builderForValue.build());
        onChanged();
      } else {
        carBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public Builder addCar(
        int index, proto.Car.Builder builderForValue) {
      if (carBuilder_ == null) {
        ensureCarIsMutable();
        car_.add(index, builderForValue.build());
        onChanged();
      } else {
        carBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public Builder addAllCar(
        java.lang.Iterable<? extends proto.Car> values) {
      if (carBuilder_ == null) {
        ensureCarIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, car_);
        onChanged();
      } else {
        carBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public Builder clearCar() {
      if (carBuilder_ == null) {
        car_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        carBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public Builder removeCar(int index) {
      if (carBuilder_ == null) {
        ensureCarIsMutable();
        car_.remove(index);
        onChanged();
      } else {
        carBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public proto.Car.Builder getCarBuilder(
        int index) {
      return getCarFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public proto.CarOrBuilder getCarOrBuilder(
        int index) {
      if (carBuilder_ == null) {
        return car_.get(index);  } else {
        return carBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public java.util.List<? extends proto.CarOrBuilder> 
         getCarOrBuilderList() {
      if (carBuilder_ != null) {
        return carBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(car_);
      }
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public proto.Car.Builder addCarBuilder() {
      return getCarFieldBuilder().addBuilder(
          proto.Car.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public proto.Car.Builder addCarBuilder(
        int index) {
      return getCarFieldBuilder().addBuilder(
          index, proto.Car.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Car car = 1;</code>
     */
    public java.util.List<proto.Car.Builder> 
         getCarBuilderList() {
      return getCarFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Car, proto.Car.Builder, proto.CarOrBuilder> 
        getCarFieldBuilder() {
      if (carBuilder_ == null) {
        carBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Car, proto.Car.Builder, proto.CarOrBuilder>(
                car_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        car_ = null;
      }
      return carBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.ListCarResponse)
  }

  // @@protoc_insertion_point(class_scope:proto.ListCarResponse)
  private static final proto.ListCarResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.ListCarResponse();
  }

  public static proto.ListCarResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCarResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListCarResponse>() {
    @java.lang.Override
    public ListCarResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListCarResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListCarResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCarResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.ListCarResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

