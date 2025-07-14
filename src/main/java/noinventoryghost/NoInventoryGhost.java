package noinventoryghost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.api.ClientModInitializer;

public class NoInventoryGhost implements ClientModInitializer {
	public static final String MOD_ID = "noinventoryghost";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("Loading Anti Inventory Ghost Measures.");

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
        	    if (client.player != null) {
        	        client.player.playerScreenHandler.sendContentUpdates();
        	    }
	        });

		LOGGER.info("Loaded Anti Inventory Ghost Measures!");
	}
}
