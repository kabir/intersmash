package org.jboss.intersmash.tools.provision.openshift.operator.infinispan.infinispan.spec;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * InfinispanSpec defines the desired state of Infinispan
 * See
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class InfinispanSpec {

	/**
	 * Number of replicas
	 */
	private int replicas;

	/**
	 * Lets you specify a Infinispan image to use
	 * see https://infinispan.org/infinispan-operator/2.0.x/operator.html#ref_image_crd-ref
	 */
	private String image;

	/**
	 * InfinispanSecurity info for the user application connection
	 * see https://github.com/infinispan/infinispan-operator/blob/2.0.x/pkg/apis/infinispan/v1/infinispan_types.go#L14
	 */
	private InfinispanSecurity security;

	/**
	 * Specify resource requirements per container
	 * see https://github.com/infinispan/infinispan-operator/blob/2.0.x/pkg/apis/infinispan/v1/infinispan_types.go#L46
	 */
	private InfinispanContainerSpec container;

	/**
	 * Specify configuration for specific service
	 * see https://github.com/infinispan/infinispan-operator/blob/2.0.x/pkg/apis/infinispan/v1/infinispan_types.go#L68
	 */
	private InfinispanServiceSpec service;

	/**
	 * Specify configuration for the logging functionality
	 */
	private InfinispanLoggingSpec logging;

	/**
	 * Describe how Infinispan will be exposed externally
	 * see https://github.com/infinispan/infinispan-operator/blob/2.0.x/pkg/apis/infinispan/v1/infinispan_types.go#L122
	 */
	private ExposeSpec expose;

	/**
	 * Describe autoscaling configuration for the cluster
	 * see https://github.com/infinispan/infinispan-operator/blob/2.0.x/pkg/apis/infinispan/v1/infinispan_types.go#L130
	 */
	private Autoscale autoscale;

	//	TODO? Affinity  *corev1.Affinity        `json:"affinity,optional,omitempty"`
}
