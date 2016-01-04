package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "Shows information about how to apply for admin", usage = "/<command>")
public class Command_ai extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
    
        playerMsg(ChatColor.GOLD + "So you want to apply for admin?");
        playerMsg(ChatColor.AQUA + "Well then, head over to http://chicken-craft.boards.net");
        playerMsg(ChatColor.RED + "Just remember, you MUST have a forum account registered for 2 weeks");
        playerMsg(ChatColor.LIGHT_PURPLE + "I wish you good luck, but just a tip:");
        playerMsg(ChatColor.BOLD + "Make sure you meet the requirements!");
        
        return false;
        
                }
}
