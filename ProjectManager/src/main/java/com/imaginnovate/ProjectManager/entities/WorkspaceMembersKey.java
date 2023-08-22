package com.imaginnovate.ProjectManager.entities;

import java.io.Serializable;
import java.util.Objects;

public class WorkspaceMembersKey implements Serializable {
    private int userId;
    private int workspaceId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkspaceMembersKey that = (WorkspaceMembersKey) o;
        return userId == that.userId && workspaceId == that.workspaceId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, workspaceId);
    }
}
