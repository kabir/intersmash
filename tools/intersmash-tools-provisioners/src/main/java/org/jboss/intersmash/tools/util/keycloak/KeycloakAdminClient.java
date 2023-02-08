package org.jboss.intersmash.tools.util.keycloak;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;

import org.apache.http.conn.ssl.TrustAllStrategy;
import org.apache.http.ssl.SSLContextBuilder;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.representations.idm.PartialImportRepresentation;
import org.keycloak.util.JsonSerialization;

/**
 * The Keycloak Admin client
 *
 * The class should follow the Keycloak Applications and Provisioners.
 *
 * TODO Move the class, with Keycloak Application and Provisioner classes, to separate module in case of refactoring
 */
public class KeycloakAdminClient {

	private Keycloak keycloak;

	public KeycloakAdminClient(final String url, final String realm, final String username, final String password)
			throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
		SSLContext trustAllSSLContext = SSLContextBuilder
				.create()
				.loadTrustMaterial(TrustAllStrategy.INSTANCE)
				.build();

		keycloak = Keycloak.getInstance(
				url,
				realm,
				username, password,
				"admin-cli",
				trustAllSSLContext);
	}

	/**
	 * https://www.keycloak.org/docs/9.0/server_admin/index.html#importing-a-realm-from-exported-json-file
	 * @param is an input stream with exported realm configuration in json format
	 * @throws IOException If something goes wrong when deserializing JSON from the input stream
	 */
	public void importRealmConfiguration(InputStream is) throws IOException {
		PartialImportRepresentation piRep = JsonSerialization.readValue(is, PartialImportRepresentation.class);
		keycloak.realm("wildfly-realm").partialImport(piRep);
	}
}
