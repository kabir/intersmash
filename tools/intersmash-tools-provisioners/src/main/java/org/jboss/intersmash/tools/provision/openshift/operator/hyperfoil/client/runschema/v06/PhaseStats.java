
package org.jboss.intersmash.tools.provision.openshift.operator.hyperfoil.client.runschema.v06;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"phase",
		"metric",
		"start",
		"end",
		"summary",
		"custom"
})
@Generated("jsonschema2pojo")
public class PhaseStats {

	/**
	 * Name of the phase.
	 * (Required)
	 *
	 */
	@JsonProperty("phase")
	@JsonPropertyDescription("Name of the phase.")
	private String phase;
	/**
	 * Name of the metric.
	 * (Required)
	 *
	 */
	@JsonProperty("metric")
	@JsonPropertyDescription("Name of the metric.")
	private String metric;
	/**
	 * Phase start timestamp, in epoch milliseconds.
	 * (Required)
	 *
	 */
	@JsonProperty("start")
	@JsonPropertyDescription("Phase start timestamp, in epoch milliseconds.")
	private Long start;
	/**
	 * Phase completion timestamp, in epoch milliseconds.
	 * (Required)
	 *
	 */
	@JsonProperty("end")
	@JsonPropertyDescription("Phase completion timestamp, in epoch milliseconds.")
	private Long end;
	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("summary")
	private Summary summary;
	/**
	 * Custom statistics.
	 *
	 */
	@JsonProperty("custom")
	@JsonPropertyDescription("Custom statistics.")
	private Custom custom;

	/**
	 * Name of the phase.
	 * (Required)
	 *
	 */
	@JsonProperty("phase")
	public String getPhase() {
		return phase;
	}

	/**
	 * Name of the phase.
	 * (Required)
	 *
	 */
	@JsonProperty("phase")
	public void setPhase(String phase) {
		this.phase = phase;
	}

	/**
	 * Name of the metric.
	 * (Required)
	 *
	 */
	@JsonProperty("metric")
	public String getMetric() {
		return metric;
	}

	/**
	 * Name of the metric.
	 * (Required)
	 *
	 */
	@JsonProperty("metric")
	public void setMetric(String metric) {
		this.metric = metric;
	}

	/**
	 * Phase start timestamp, in epoch milliseconds.
	 * (Required)
	 *
	 */
	@JsonProperty("start")
	public Long getStart() {
		return start;
	}

	/**
	 * Phase start timestamp, in epoch milliseconds.
	 * (Required)
	 *
	 */
	@JsonProperty("start")
	public void setStart(Long start) {
		this.start = start;
	}

	/**
	 * Phase completion timestamp, in epoch milliseconds.
	 * (Required)
	 *
	 */
	@JsonProperty("end")
	public Long getEnd() {
		return end;
	}

	/**
	 * Phase completion timestamp, in epoch milliseconds.
	 * (Required)
	 *
	 */
	@JsonProperty("end")
	public void setEnd(Long end) {
		this.end = end;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("summary")
	public Summary getSummary() {
		return summary;
	}

	/**
	 *
	 * (Required)
	 *
	 */
	@JsonProperty("summary")
	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	/**
	 * Custom statistics.
	 *
	 */
	@JsonProperty("custom")
	public Custom getCustom() {
		return custom;
	}

	/**
	 * Custom statistics.
	 *
	 */
	@JsonProperty("custom")
	public void setCustom(Custom custom) {
		this.custom = custom;
	}

}
