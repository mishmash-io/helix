package org.apache.helix.monitoring.metrics.model;

import org.apache.helix.common.monitoring.mbeans.dynamicMBeans.DynamicMetric;

/**
 * Defines a generic metric interface.
 * @param <T> type of input value for the metric
 */
public interface Metric<T> {

  /**
   * Gets the name of the metric.
   */
  String getMetricName();

  /**
   * Prints the metric along with its name.
   */
  String toString();

  /**
   * Returns the most recently emitted value for the metric at the time of the call.
   * @return metric value
   */
  T getLastEmittedMetricValue();

  /**
   * Returns the underlying DynamicMetric.
   */
  DynamicMetric getDynamicMetric();
}
