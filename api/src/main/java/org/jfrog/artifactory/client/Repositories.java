package org.jfrog.artifactory.client;

import org.jfrog.artifactory.client.model.LightweightRepository;
import org.jfrog.artifactory.client.model.Repository;
import org.jfrog.artifactory.client.model.RepositoryType;
import org.jfrog.artifactory.client.model.builder.RepositoryBuilders;

import java.util.List;

/**
 * @author jbaruch
 * @since 12/08/12
 */
public interface Repositories {

    String create(int position, Repository configuration);

    String update(Repository configuration);

    RepositoryHandle repository(String repo);

    RepositoryBuilders builders();

    List<LightweightRepository> list(RepositoryType repositoryType);

    String getRepositoriesApi();

    String getReplicationApi();
}
