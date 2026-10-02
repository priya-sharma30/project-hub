package live.switchly.api.model;

import java.util.UUID;

public class Environment {
    private final UUID id;
    private final UUID projectId;
    private final String name; // e.g., "test", "production"

    public Environment(UUID id, UUID projectId, String name) {
        this.id = id;
        this.projectId = projectId;
        this.name = name;
    }

    public UUID getId() { return id; }
    public UUID getProjectId() { return projectId; }
    public String getName() { return name; }
}