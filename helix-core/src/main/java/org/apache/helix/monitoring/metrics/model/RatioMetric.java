package org.apache.helix.monitoring.metrics.model;

import org.apache.helix.common.monitoring.mbeans.dynamicMBeans.DynamicMetric;
import org.apache.helix.common.monitoring.mbeans.dynamicMBeans.SimpleDynamicMetric;


/**
 * A gauge which defines the ratio of one value to another.
 */
public abstract class RatioMetric extends SimpleDynamicMetric<Double> implements Metric<Double> {
  /**
   * Instantiates a new Simple dynamic metric.
   *  @param metricName the metric name
   * @param metricObject the metric object
   */
  public RatioMetric(String metricName, double metricObject) {
    super(metricName, metricObject);
  }

  @Override
  public DynamicMetric getDynamicMetric() {
    return this;
  }

  @Override
  public String getMetricName() {
    return _metricName;
  }

  @Override
  public Double getLastEmittedMetricValue() {
    return getValue();
  }

  @Override
  public String toString() {
    return String.format("Metric name: %s, metric value: %f", getMetricName(), getValue());
  }
}
