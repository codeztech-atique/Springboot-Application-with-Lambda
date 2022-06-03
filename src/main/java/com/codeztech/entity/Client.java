package com.codeztech.entity;

import org.springframework.stereotype.Repository;

public class Client {
	private String clientName;
	private int clientId;
	private String clientAddress;

	@Override
	public String toString() {
		return "Client [clientName=" + clientName + ", clientId=" + clientId + ", clientAddress=" + clientAddress + "]";
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int userId) {
		this.clientId = userId;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
}
