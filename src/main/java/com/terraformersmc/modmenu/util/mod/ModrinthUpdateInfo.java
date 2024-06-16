package com.terraformersmc.modmenu.util.mod;

import com.terraformersmc.modmenu.api.UpdateChannel;
import com.terraformersmc.modmenu.api.UpdateInfo;

public class ModrinthUpdateInfo implements UpdateInfo {
	protected final String projectId;
	protected final String versionId;
	protected final String versionNumber;
	protected final UpdateChannel updateChannel;

	public ModrinthUpdateInfo(String projectId, String versionId, String versionNumber, UpdateChannel updateChannel) {
		this.projectId = projectId;
		this.versionId = versionId;
		this.versionNumber = versionNumber;
		this.updateChannel = updateChannel;
	}

	@Override
	public boolean isUpdateAvailable() {
		return true;
	}

	@Override
	public String getDownloadLink() {
		return String.format("https://modrinth.com/project/%s/version/%s", projectId, versionId);
	}

	public String getProjectId() {
		return projectId;
	}

	public String getVersionId() {
		return versionId;
	}

	public String getVersionNumber() {
		return versionNumber;
	}

	@Override
	public UpdateChannel getUpdateChannel() {
		return this.updateChannel;
	}
}
