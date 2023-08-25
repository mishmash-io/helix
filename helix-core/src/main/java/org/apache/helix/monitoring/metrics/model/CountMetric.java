package org.apache.helix.monitoring.metrics.model;

import org.apache.helix.common.monitoring.mbeans.dynamicMBeans.DynamicMetric;
import org.apache.helix.common.monitoring.mbeans.dynamicMBeans.SimpleDynamicMetric;

/**
 * Represents a count metric and defines methods to help with calculation. A count metric gives a
 * gauge value of a certain property.
 */
public abstract class CountMetric extends SimpleDynamicMetric<Long> implements Metric<Long> {

  /**
   * Instantiates a new count metric.
   *
   * @param metricName the metric name
   * @param initCount the initial count
   */
  public CountMetric(String metricName, long initCount) {
    super(metricName, initCount);
  }

  /**
   * Increment the metric by the input count.
   *
   * @param count
   */
  public void increment(long count) {
    updateValue(getValue() + count);
  }

  @Override
  public String getMetricName() {
    return _metricName;
  }

  @Override
  public String toString() {
    return String.format("Metric %s's count is %d", getMetricName(), getValue());
  }

  @Override
  public Long getLastEmittedMetricValue() {
    return getValue();
  }

  @Override
  public DynamicMetric getDynamicMetric() {
    return this;
  }
}
