package com.DrasticDemise.TerrainCrystals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import net.minecraftforge.common.MinecraftForge;

public class ThreadVersionChecker extends Thread{
	public ThreadVersionChecker() {
		setName("Terrain Crystals Checking Thread");
		setDaemon(true);
		start();
	}

	@Override
	public void run() {
		try {
			URL url = new URL(TerrainCrystals.URL);
			BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
			VersionChecker.version = r.readLine();
			r.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
