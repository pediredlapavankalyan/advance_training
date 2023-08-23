package com.imaginnovate.ProjectManager.entities;

import jakarta.persistence.*;

@Entity
@Table
@IdClass(WorkspaceMembersKey.class)
public class WorkspcaeMembers {
    @Id
    private int userId;
    @Id
    private  int workspaceId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(int workspaceId) {
        this.workspaceId = workspaceId;
    }



}
