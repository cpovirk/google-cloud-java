// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/queue.proto

package com.google.cloud.tasks.v2beta3;

public interface QueueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta3.Queue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Caller-specified and required in [CreateQueue][google.cloud.tasks.v2beta3.CloudTasks.CreateQueue],
   * after which it becomes output only.
   * The queue name.
   * The queue name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),
   *    hyphens (-), colons (:), or periods (.).
   *    For more information, see
   *    [Identifying
   *    projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
   * * `LOCATION_ID` is the canonical ID for the queue's location.
   *    The list of available locations can be obtained by calling
   *    [ListLocations][google.cloud.location.Locations.ListLocations].
   *    For more information, see https://cloud.google.com/about/locations/.
   * * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or
   *   hyphens (-). The maximum length is 100 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Caller-specified and required in [CreateQueue][google.cloud.tasks.v2beta3.CloudTasks.CreateQueue],
   * after which it becomes output only.
   * The queue name.
   * The queue name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID`
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),
   *    hyphens (-), colons (:), or periods (.).
   *    For more information, see
   *    [Identifying
   *    projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
   * * `LOCATION_ID` is the canonical ID for the queue's location.
   *    The list of available locations can be obtained by calling
   *    [ListLocations][google.cloud.location.Locations.ListLocations].
   *    For more information, see https://cloud.google.com/about/locations/.
   * * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or
   *   hyphens (-). The maximum length is 100 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * [AppEngineHttpQueue][google.cloud.tasks.v2beta3.AppEngineHttpQueue] settings apply only to
   * [App Engine tasks][google.cloud.tasks.v2beta3.AppEngineHttpRequest] in this queue.
   * [Http tasks][google.cloud.tasks.v2beta3.HttpRequest] are not affected by this proto.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.AppEngineHttpQueue app_engine_http_queue = 3;</code>
   */
  boolean hasAppEngineHttpQueue();
  /**
   *
   *
   * <pre>
   * [AppEngineHttpQueue][google.cloud.tasks.v2beta3.AppEngineHttpQueue] settings apply only to
   * [App Engine tasks][google.cloud.tasks.v2beta3.AppEngineHttpRequest] in this queue.
   * [Http tasks][google.cloud.tasks.v2beta3.HttpRequest] are not affected by this proto.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.AppEngineHttpQueue app_engine_http_queue = 3;</code>
   */
  com.google.cloud.tasks.v2beta3.AppEngineHttpQueue getAppEngineHttpQueue();
  /**
   *
   *
   * <pre>
   * [AppEngineHttpQueue][google.cloud.tasks.v2beta3.AppEngineHttpQueue] settings apply only to
   * [App Engine tasks][google.cloud.tasks.v2beta3.AppEngineHttpRequest] in this queue.
   * [Http tasks][google.cloud.tasks.v2beta3.HttpRequest] are not affected by this proto.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.AppEngineHttpQueue app_engine_http_queue = 3;</code>
   */
  com.google.cloud.tasks.v2beta3.AppEngineHttpQueueOrBuilder getAppEngineHttpQueueOrBuilder();

  /**
   *
   *
   * <pre>
   * Rate limits for task dispatches.
   * [rate_limits][google.cloud.tasks.v2beta3.Queue.rate_limits] and [retry_config][google.cloud.tasks.v2beta3.Queue.retry_config] are
   * related because they both control task attempts. However they control task
   * attempts in different ways:
   * * [rate_limits][google.cloud.tasks.v2beta3.Queue.rate_limits] controls the total rate of
   *   dispatches from a queue (i.e. all traffic dispatched from the
   *   queue, regardless of whether the dispatch is from a first
   *   attempt or a retry).
   * * [retry_config][google.cloud.tasks.v2beta3.Queue.retry_config] controls what happens to
   *   particular a task after its first attempt fails. That is,
   *   [retry_config][google.cloud.tasks.v2beta3.Queue.retry_config] controls task retries (the
   *   second attempt, third attempt, etc).
   * The queue's actual dispatch rate is the result of:
   * * Number of tasks in the queue
   * * User-specified throttling: [rate_limits][google.cloud.tasks.v2beta3.Queue.rate_limits],
   *   [retry_config][google.cloud.tasks.v2beta3.Queue.retry_config], and the
   *   [queue's state][google.cloud.tasks.v2beta3.Queue.state].
   * * System throttling due to `429` (Too Many Requests) or `503` (Service
   *   Unavailable) responses from the worker, high error rates, or to smooth
   *   sudden large traffic spikes.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.RateLimits rate_limits = 4;</code>
   */
  boolean hasRateLimits();
  /**
   *
   *
   * <pre>
   * Rate limits for task dispatches.
   * [rate_limits][google.cloud.tasks.v2beta3.Queue.rate_limits] and [retry_config][google.cloud.tasks.v2beta3.Queue.retry_config] are
   * related because they both control task attempts. However they control task
   * attempts in different ways:
   * * [rate_limits][google.cloud.tasks.v2beta3.Queue.rate_limits] controls the total rate of
   *   dispatches from a queue (i.e. all traffic dispatched from the
   *   queue, regardless of whether the dispatch is from a first
   *   attempt or a retry).
   * * [retry_config][google.cloud.tasks.v2beta3.Queue.retry_config] controls what happens to
   *   particular a task after its first attempt fails. That is,
   *   [retry_config][google.cloud.tasks.v2beta3.Queue.retry_config] controls task retries (the
   *   second attempt, third attempt, etc).
   * The queue's actual dispatch rate is the result of:
   * * Number of tasks in the queue
   * * User-specified throttling: [rate_limits][google.cloud.tasks.v2beta3.Queue.rate_limits],
   *   [retry_config][google.cloud.tasks.v2beta3.Queue.retry_config], and the
   *   [queue's state][google.cloud.tasks.v2beta3.Queue.state].
   * * System throttling due to `429` (Too Many Requests) or `503` (Service
   *   Unavailable) responses from the worker, high error rates, or to smooth
   *   sudden large traffic spikes.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.RateLimits rate_limits = 4;</code>
   */
  com.google.cloud.tasks.v2beta3.RateLimits getRateLimits();
  /**
   *
   *
   * <pre>
   * Rate limits for task dispatches.
   * [rate_limits][google.cloud.tasks.v2beta3.Queue.rate_limits] and [retry_config][google.cloud.tasks.v2beta3.Queue.retry_config] are
   * related because they both control task attempts. However they control task
   * attempts in different ways:
   * * [rate_limits][google.cloud.tasks.v2beta3.Queue.rate_limits] controls the total rate of
   *   dispatches from a queue (i.e. all traffic dispatched from the
   *   queue, regardless of whether the dispatch is from a first
   *   attempt or a retry).
   * * [retry_config][google.cloud.tasks.v2beta3.Queue.retry_config] controls what happens to
   *   particular a task after its first attempt fails. That is,
   *   [retry_config][google.cloud.tasks.v2beta3.Queue.retry_config] controls task retries (the
   *   second attempt, third attempt, etc).
   * The queue's actual dispatch rate is the result of:
   * * Number of tasks in the queue
   * * User-specified throttling: [rate_limits][google.cloud.tasks.v2beta3.Queue.rate_limits],
   *   [retry_config][google.cloud.tasks.v2beta3.Queue.retry_config], and the
   *   [queue's state][google.cloud.tasks.v2beta3.Queue.state].
   * * System throttling due to `429` (Too Many Requests) or `503` (Service
   *   Unavailable) responses from the worker, high error rates, or to smooth
   *   sudden large traffic spikes.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.RateLimits rate_limits = 4;</code>
   */
  com.google.cloud.tasks.v2beta3.RateLimitsOrBuilder getRateLimitsOrBuilder();

  /**
   *
   *
   * <pre>
   * Settings that determine the retry behavior.
   * * For tasks created using Cloud Tasks: the queue-level retry settings
   *   apply to all tasks in the queue that were created using Cloud Tasks.
   *   Retry settings cannot be set on individual tasks.
   * * For tasks created using the App Engine SDK: the queue-level retry
   *   settings apply to all tasks in the queue which do not have retry settings
   *   explicitly set on the task and were created by the App Engine SDK. See
   *   [App Engine
   *   documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.RetryConfig retry_config = 5;</code>
   */
  boolean hasRetryConfig();
  /**
   *
   *
   * <pre>
   * Settings that determine the retry behavior.
   * * For tasks created using Cloud Tasks: the queue-level retry settings
   *   apply to all tasks in the queue that were created using Cloud Tasks.
   *   Retry settings cannot be set on individual tasks.
   * * For tasks created using the App Engine SDK: the queue-level retry
   *   settings apply to all tasks in the queue which do not have retry settings
   *   explicitly set on the task and were created by the App Engine SDK. See
   *   [App Engine
   *   documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.RetryConfig retry_config = 5;</code>
   */
  com.google.cloud.tasks.v2beta3.RetryConfig getRetryConfig();
  /**
   *
   *
   * <pre>
   * Settings that determine the retry behavior.
   * * For tasks created using Cloud Tasks: the queue-level retry settings
   *   apply to all tasks in the queue that were created using Cloud Tasks.
   *   Retry settings cannot be set on individual tasks.
   * * For tasks created using the App Engine SDK: the queue-level retry
   *   settings apply to all tasks in the queue which do not have retry settings
   *   explicitly set on the task and were created by the App Engine SDK. See
   *   [App Engine
   *   documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.RetryConfig retry_config = 5;</code>
   */
  com.google.cloud.tasks.v2beta3.RetryConfigOrBuilder getRetryConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The state of the queue.
   * `state` can only be changed by called
   * [PauseQueue][google.cloud.tasks.v2beta3.CloudTasks.PauseQueue],
   * [ResumeQueue][google.cloud.tasks.v2beta3.CloudTasks.ResumeQueue], or uploading
   * [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref).
   * [UpdateQueue][google.cloud.tasks.v2beta3.CloudTasks.UpdateQueue] cannot be used to change `state`.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Queue.State state = 6;</code>
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of the queue.
   * `state` can only be changed by called
   * [PauseQueue][google.cloud.tasks.v2beta3.CloudTasks.PauseQueue],
   * [ResumeQueue][google.cloud.tasks.v2beta3.CloudTasks.ResumeQueue], or uploading
   * [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref).
   * [UpdateQueue][google.cloud.tasks.v2beta3.CloudTasks.UpdateQueue] cannot be used to change `state`.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Queue.State state = 6;</code>
   */
  com.google.cloud.tasks.v2beta3.Queue.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The last time this queue was purged.
   * All tasks that were [created][google.cloud.tasks.v2beta3.Task.create_time] before this time
   * were purged.
   * A queue can be purged using [PurgeQueue][google.cloud.tasks.v2beta3.CloudTasks.PurgeQueue], the
   * [App Engine Task Queue SDK, or the Cloud
   * Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue).
   * Purge time will be truncated to the nearest microsecond. Purge
   * time will be unset if the queue has never been purged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp purge_time = 7;</code>
   */
  boolean hasPurgeTime();
  /**
   *
   *
   * <pre>
   * Output only. The last time this queue was purged.
   * All tasks that were [created][google.cloud.tasks.v2beta3.Task.create_time] before this time
   * were purged.
   * A queue can be purged using [PurgeQueue][google.cloud.tasks.v2beta3.CloudTasks.PurgeQueue], the
   * [App Engine Task Queue SDK, or the Cloud
   * Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue).
   * Purge time will be truncated to the nearest microsecond. Purge
   * time will be unset if the queue has never been purged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp purge_time = 7;</code>
   */
  com.google.protobuf.Timestamp getPurgeTime();
  /**
   *
   *
   * <pre>
   * Output only. The last time this queue was purged.
   * All tasks that were [created][google.cloud.tasks.v2beta3.Task.create_time] before this time
   * were purged.
   * A queue can be purged using [PurgeQueue][google.cloud.tasks.v2beta3.CloudTasks.PurgeQueue], the
   * [App Engine Task Queue SDK, or the Cloud
   * Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue).
   * Purge time will be truncated to the nearest microsecond. Purge
   * time will be unset if the queue has never been purged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp purge_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getPurgeTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the fraction of operations to write to
   * [Stackdriver Logging](https://cloud.google.com/logging/docs/).
   * This field may contain any value between 0.0 and 1.0, inclusive.
   * 0.0 is the default and means that no operations are logged.
   * </pre>
   *
   * <code>double log_sampling_ratio = 10;</code>
   */
  double getLogSamplingRatio();

  public com.google.cloud.tasks.v2beta3.Queue.QueueTypeCase getQueueTypeCase();
}
