package com.nokoriware.nngine.arcweave.project;

import java.util.ArrayList;

public class Board extends Carrier {
	
	private String name;
	
	private ArrayList<String> noteIDs = new ArrayList<>();
	private ArrayList<String> jumperIDs = new ArrayList<>();
	private ArrayList<String> branchIDs = new ArrayList<>();
	private ArrayList<String> elementIDs = new ArrayList<>();
	private ArrayList<String> connectionIDs = new ArrayList<>();
	
	public Board(String id) {
		super(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getNoteIDs() {
		return noteIDs;
	}
	
	public ArrayList<String> getJumperIDs() {
		return jumperIDs;
	}
	
	public ArrayList<String> getBranchIDs() {
		return branchIDs;
	}

	public ArrayList<String> getElementIDs() {
		return elementIDs;
	}
	
	public ArrayList<String> getConnectionIDs() {
		return connectionIDs;
	}

}
