package org.jboss.intersmash.deployments;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.maven.settings.building.SettingsBuildingException;
import org.eclipse.aether.resolution.ArtifactResolutionException;
import org.jboss.intersmash.deployments.util.maven.ArtifactProvider;

/**
 * A class which is expected to provide access to shared (e.g.: used by both demos or testsuite) deployment
 * applications. They need to be installed in local repository.
 */
public class IntersmashSharedDeployments {
	static final String BOOTABLE_JAR_ARTIFACT = "wildfly-bootable-jar";
	static final String BOOTABLE_JAR_ARTIFACT_PACKAGING = "jar";

	public static Path bootableJarDemoOpenShift() {
		Path file = null;
		try {
			file = ArtifactProvider.resolveArtifact(
					IntersmashSharedDeploymentsProperties.groupID(),
					BOOTABLE_JAR_ARTIFACT,
					IntersmashSharedDeploymentsProperties.version(),
					BOOTABLE_JAR_ARTIFACT_PACKAGING,
					"bootable-openshift").toPath();
		} catch (SettingsBuildingException | ArtifactResolutionException e) {
			throw new RuntimeException("Can not get artifact", e);
		}
		return file;
	}

	public static Path bootableJarDemoBareMetal() {
		Path file = null;
		try {
			file = ArtifactProvider.resolveArtifact(
					IntersmashSharedDeploymentsProperties.groupID(),
					BOOTABLE_JAR_ARTIFACT,
					IntersmashSharedDeploymentsProperties.version(),
					BOOTABLE_JAR_ARTIFACT_PACKAGING,
					"bootable-baremetal").toPath();
		} catch (SettingsBuildingException | ArtifactResolutionException e) {
			throw new RuntimeException("Can not get artifact", e);
		}
		return file;
	}

	public static Path findStandaloneDeploymentPath(String deployment) {
		File deploymentsBaseDir = new File(IntersmashSharedDeploymentsProperties.getDeploymentsProviderPath())
				.getParentFile();
		Path path = Paths.get(deploymentsBaseDir.getAbsolutePath(), deployment);
		if (path.toFile().exists() && path.toFile().isDirectory()) {
			return path;
		}
		throw new RuntimeException("Cannot find sources root directory: " + path.toFile().getAbsolutePath());
	}
}
