package org.jboss.intersmash.tools.provision.openshift.operator.keycloak.user.spec;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class KeycloakAPIUser {

	/**
	 * User ID.
	 */
	private String id;

	/**
	 * User Name.
	 */
	private String username;

	/**
	 * First Name.
	 */
	private String firstName;

	/**
	 * Last Name.
	 */
	private String lastName;

	/**
	 * Email.
	 */
	private String email;

	/**
	 * True if email has already been verified.
	 */
	private boolean emailVerified;

	/**
	 * User enabled flag.
	 */
	private boolean enabled;

	/**
	 * A set of Realm Roles.
	 */
	private Set<String> realmRoles;

	/**
	 * A set of Client Roles.
	 */
	private Map<String, List<String>> clientRoles;

	/**
	 * A set of Required Actions
	 */
	private Set<String> requiredActions;

	/**
	 * A set of Groups.
	 */
	private Set<String> groups;

	/**
	 * A set of Federated Identities.
	 */
	private Set<FederatedIdentity> federatedIdentities;

	/**
	 * A set of Credentials.
	 */
	private Set<KeycloakCredential> credentials;

	//	/**
	//	 * A set of Attributes.
	//	 */
	//	private Map<String, List<String>> attributes;
}
