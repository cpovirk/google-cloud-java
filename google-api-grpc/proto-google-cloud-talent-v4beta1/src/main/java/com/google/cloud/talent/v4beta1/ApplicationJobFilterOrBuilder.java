// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface ApplicationJobFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ApplicationJobFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional.
   * The job requisition id in the application. The API does an exact match on
   * the [Job.requisistion_id][] of [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_requisition_id = 2;</code>
   */
  java.lang.String getJobRequisitionId();
  /**
   *
   *
   * <pre>
   * Optional.
   * The job requisition id in the application. The API does an exact match on
   * the [Job.requisistion_id][] of [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_requisition_id = 2;</code>
   */
  com.google.protobuf.ByteString getJobRequisitionIdBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * The job title in the application. The API does an exact match on the
   * [Job.title][google.cloud.talent.v4beta1.Job.title] of [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_title = 3;</code>
   */
  java.lang.String getJobTitle();
  /**
   *
   *
   * <pre>
   * Optional.
   * The job title in the application. The API does an exact match on the
   * [Job.title][google.cloud.talent.v4beta1.Job.title] of [Application.job][google.cloud.talent.v4beta1.Application.job] in profiles.
   * </pre>
   *
   * <code>string job_title = 3;</code>
   */
  com.google.protobuf.ByteString getJobTitleBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * If true, the API excludes all profiles with any [Application.job][google.cloud.talent.v4beta1.Application.job]
   * matching the filters.
   * </pre>
   *
   * <code>bool negated = 4;</code>
   */
  boolean getNegated();
}
