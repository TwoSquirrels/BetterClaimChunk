package com.github.twosquirrels.betterclaimchunk

import org.bukkit.plugin.java.JavaPlugin

class BetterClaimChunk : JavaPlugin() {
    override fun onEnable() {
        logger.info("$name has been enabled!");
    }

    override fun onDisable() {
        logger.info("$name has been disabled!");
    }
}