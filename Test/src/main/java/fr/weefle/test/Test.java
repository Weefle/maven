package fr.weefle.test;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new TestListener(), this);
		super.onEnable();
	}

}
