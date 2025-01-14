// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

package com.google.cloud.vision.v1;

public interface InputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.InputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to read the input from.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to read the input from.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.vision.v1.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to read the input from.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.vision.v1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * File content, represented as a stream of bytes.
   * Note: As with all `bytes` fields, protobuffers use a pure binary
   * representation, whereas JSON representations use base64.
   * Currently, this field only works for BatchAnnotateFiles requests. It does
   * not work for AsyncBatchAnnotateFiles requests.
   * </pre>
   *
   * <code>bytes content = 3;</code>
   */
  com.google.protobuf.ByteString getContent();

  /**
   *
   *
   * <pre>
   * The type of the file. Currently only "application/pdf" and "image/tiff"
   * are supported. Wildcards are not supported.
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * The type of the file. Currently only "application/pdf" and "image/tiff"
   * are supported. Wildcards are not supported.
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   */
  com.google.protobuf.ByteString getMimeTypeBytes();
}
