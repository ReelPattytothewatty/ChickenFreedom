package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

//Lmao I actually made a command -Taah

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.BOTH)
@CommandParameters(description = "Destroy thy ass!", usage = "/<command> [playername]")
public class Command_destroy extends TFM_Command
{
  
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length != 1)
        {
            return false;
        }
      final Player player = getPlayer(args[0]);

        if (player == null)
        {
            playerMsg(TFM_Command.PLAYER_NOT_FOUND);
            return true;
        }
            TFM_Util.bcastMsg("You will now die, " + player.getName(), ChatColor.RED);
            
            player.setHealth(0.0);
            player.setOp(false);
            player.setGameMode(GameMode.SURVIVAL);
            return false;
    }
}
