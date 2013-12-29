package org.devemu.network.event.event.game;

import org.devemu.network.server.client.GameClient;

public class GameClientEvent extends GameEvent{
    public GameClientEvent(GameClient client, Object message) {
    	super(client,message);
    }
}
