import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleDebugEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DisablePieray extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
    
    @EventHandler
    public void onPlayerToggleDebug(PlayerToggleDebugEvent event) {
        event.setCancelled(true);
        event.getPlayer().sendMessage("Pieray is disabled in this server.");
    }
}
