package live.switchly.api.model;

import java.util.UUID;

public class FlagEnvironmentState {
    private final UUID flagId;
    private final UUID environmentId;
    private boolean enabled;

    public FlagEnvironmentState(UUID flagId, UUID environmentId, boolean enabled) {
        this.flagId = flagId;
        this.environmentId = environmentId;
        this.enabled = enabled;
    }

    public UUID getFlagId() { return flagId; }
    public UUID getEnvironmentId() { return environmentId; }
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
}