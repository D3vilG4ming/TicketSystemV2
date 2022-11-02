package Main.TicketSystem_V2;

import Main.Bot;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.PermissionOverride;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.EnumSet;

public class TicketSystem extends ListenerAdapter {
    String AdminRole = "BOT-Admin"; // Type in here The Role Name of your Admin Role
    String TicketSupporter = "Ticket-Supporter"; // Type in here The Role Name of your Ticket Supporter Role
    String TicketSupporterID = "000000000000"; // Type in here The ID of your Ticket Supporter Role
    String BlacklistRole = "ticket lock"; // Type Here in The Role Name Of your Blacklist Role
    String AuthorName = "Powered By D3vilG4ming#2263"; // What should stand In the Embed
    String Thumbnail = "http://xn--7q8hkab40p.d3vilg4ming.de/"; // What should stand In the Embed

    String TicketCategoryID = "00000000000000000";


    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (event.getMessage().getContentStripped().equals("!setticket")) {
            String roles = String.valueOf(event.getMember().getRoles());
            if (roles.contains(AdminRole)) {
                EmbedBuilder setticket = new EmbedBuilder()
                        .setTitle("\uD83C\uDFAB Ticket Support")
                        .setAuthor(AuthorName)
                        .setColor(Color.ORANGE)
                        .setDescription("**You need Support? No Problem, Just Open a Ticket, In the Category You need.**")
                        .setFooter("Only open a Ticket if you Think its Important!")
                        .setThumbnail(Thumbnail);
                event.getChannel().sendMessageEmbeds(setticket.build()).setActionRow(Button.success("open1topicTicket", "1st Topic").withEmoji(Emoji.fromFormatted("\uD83E\uDD20")), Button.danger("open2topicTicket", "2th Topic Ticket").withEmoji(Emoji.fromFormatted("\uD83E\uDD1D")), Button.success("open3topicTicket", " 3rd Topic Ticket").withEmoji(Emoji.fromFormatted("\uD83D\uDCC3")), Button.danger("open4topicTicket", "4th Topic Ticket").withEmoji(Emoji.fromFormatted("\uD83E\uDD1D")), Button.danger("open5topicTicket", "5th Topic Ticket").withEmoji(Emoji.fromFormatted("\uD83D\uDC36"))).queue();
            }
        }
    } // End Of Received Event

    @Override
    public void onButtonInteraction(@NotNull ButtonInteractionEvent event) {
        String BID = event.getButton().getId();
        event.deferEdit().queue();
        if (BID.equals("open1topicTicket")) {
            String roles = String.valueOf(event.getMember().getRoles());
            if (!roles.contains(BlacklistRole)) {
                int min = 100;
                int max = 500;
                int random_int = (int) Math.floor(Math.random() * (max - min + 1 + min));

                Guild guild = event.getGuild();
                EmbedBuilder ticketinfo = new EmbedBuilder()
                        .setTitle(event.getUser().getName() + "'s 1st Topic Ticket")
                        .setAuthor(AuthorName)
                        .addField("Ticket-Category:", "1st Topic", true)
                        .setColor(Color.BLUE)
                        .setDescription("Welcome In Your Ticket, Please write your Problem/Question directly in here, If there is no Message from you in 48hours, This ticket will getting closed!");
                guild.createTextChannel("t-" + random_int, guild.getCategoryById(TicketCategoryID))
                        .addPermissionOverride(event.getMember(), EnumSet.of(Permission.VIEW_CHANNEL), null) // adds the Member to the ticket!
                        .addPermissionOverride(guild.getPublicRole(), null, EnumSet.of(Permission.VIEW_CHANNEL)) // Deny's @everyone to see the ticket!
                        .addPermissionOverride(guild.getRoleById(TicketSupporterID), EnumSet.of(Permission.VIEW_CHANNEL), null) // adds @Ticket-Supporter To the Ticket!
                        .setTopic("Ticket 1st Topic") // Sets Ticket Topic
                        .complete().sendMessageEmbeds(ticketinfo.build()).setActionRow(closeButton(), claimButton()).queue();

            } else {
            }
        } // end of 'openDefaultTicket'
        else if (BID.equals("open2topicTicket")) {
            String roles = String.valueOf(event.getMember().getRoles());
            if (!roles.contains(BlacklistRole)) {
                int min = 501;
                int max = 530;
                int random_int = (int) Math.floor(Math.random() * (max - min + 1 + min));

                Guild guild = event.getGuild();
                EmbedBuilder ticketinfo = new EmbedBuilder()
                        .setTitle(event.getUser().getName() + "'s 2th Ticket Topic")
                        .setAuthor(AuthorName)
                        .addField("Ticket-Category:", "2th Ticket Topic", true)
                        .setColor(Color.BLUE)
                        .setDescription("Welcome In Your Ticket, Please write your Problem/Question directly in here, If there is no Message from you in 48hours, This ticket will getting closed!");
                guild.createTextChannel("t-" + random_int, guild.getCategoryById(TicketCategoryID))
                        .addPermissionOverride(event.getMember(), EnumSet.of(Permission.VIEW_CHANNEL), null) // adds the Member to the ticket!
                        .addPermissionOverride(guild.getPublicRole(), null, EnumSet.of(Permission.VIEW_CHANNEL)) // Deny's @everyone to see the ticket!
                        .addPermissionOverride(guild.getRoleById(TicketSupporterID), EnumSet.of(Permission.VIEW_CHANNEL), null) // adds @Ticket-Supporter To the Ticket!
                        .setTopic("Ticket 2th Topic") // Sets Ticket Topic
                        .complete().sendMessageEmbeds(ticketinfo.build()).setActionRow(closeButton(), claimButton()).queue();

            } else {
            }
        } // end of 'AllianceTicket'
        else if (BID.equals("open3topicTicket")) {
            String roles = String.valueOf(event.getMember().getRoles());
            if (!roles.contains(BlacklistRole)) {
                int min = 501;
                int max = 530;
                int random_int = (int) Math.floor(Math.random() * (max - min + 1 + min));

                Guild guild = event.getGuild();
                EmbedBuilder ticketinfo = new EmbedBuilder()
                        .setTitle(event.getUser().getName() + "'s 3rd Topic Ticket")
                        .setAuthor(AuthorName)
                        .addField("Ticket-Category:", "3rd Ticket Topic", true)
                        .setColor(Color.BLUE)
                        .setDescription("Welcome In Your Ticket, Please write your Problem/Question directly in here, If there is no Message from you in 48hours, This ticket will getting closed!");
                guild.createTextChannel("t-" + random_int, guild.getCategoryById(TicketCategoryID))
                        .addPermissionOverride(event.getMember(), EnumSet.of(Permission.VIEW_CHANNEL), null) // adds the Member to the ticket!
                        .addPermissionOverride(guild.getPublicRole(), null, EnumSet.of(Permission.VIEW_CHANNEL)) // Deny's @everyone to see the ticket!
                        .addPermissionOverride(guild.getRoleById(TicketSupporterID), EnumSet.of(Permission.VIEW_CHANNEL), null) // adds @Ticket-Supporter To the Ticket!
                        .setTopic("Ticket 3rd Topic") // Sets Ticket Topic
                        .complete().sendMessageEmbeds(ticketinfo.build()).setActionRow(closeButton(), claimButton()).queue();

            } else {
            }
        } // end of 'Application Ticket'
        else if (BID.equals("open4topicTicket")) {
            String roles = String.valueOf(event.getMember().getRoles());
            if (!roles.contains(BlacklistRole)) {
                int min = 501;
                int max = 530;
                int random_int = (int) Math.floor(Math.random() * (max - min + 1 + min));

                Guild guild = event.getGuild();
                EmbedBuilder ticketinfo = new EmbedBuilder()
                        .setTitle(event.getUser().getName() + "'s 4th Topic Ticket")
                        .setAuthor(AuthorName)
                        .addField("Ticket-Category:", "Topic 4", true)
                        .setColor(Color.BLUE)
                        .setDescription("Welcome In Your Ticket, Please write your Problem/Question directly in here, If there is no Message from you in 48hours, This ticket will getting closed!");
                guild.createTextChannel("t-" + random_int, guild.getCategoryById(TicketCategoryID))
                        .addPermissionOverride(event.getMember(), EnumSet.of(Permission.VIEW_CHANNEL), null) // adds the Member to the ticket!
                        .addPermissionOverride(guild.getPublicRole(), null, EnumSet.of(Permission.VIEW_CHANNEL)) // Deny's @everyone to see the ticket!
                        .addPermissionOverride(guild.getRoleById(TicketSupporterID), EnumSet.of(Permission.VIEW_CHANNEL), null) // adds @HumanResourceDepartment To the Ticket!
                        .setTopic("Ticket Topic 4") // Sets Ticket Topic
                        .complete().sendMessageEmbeds(ticketinfo.build()).setActionRow(closeButton(), claimButton()).queue();

            } else {
            }
        } // end of 'Human Resources Ticket'
        else if (BID.equals("open5topicTicket")) {
            String roles = String.valueOf(event.getMember().getRoles());
            if (!roles.contains(BlacklistRole)) {
                int min = 501;
                int max = 530;
                int random_int = (int) Math.floor(Math.random() * (max - min + 1 + min));

                Guild guild = event.getGuild();
                EmbedBuilder ticketinfo = new EmbedBuilder()
                        .setTitle(event.getUser().getName() + "'s 5th Topic Ticket")
                        .setAuthor(AuthorName)
                        .addField("Ticket-Category:", "Topic 5", true)
                        .setColor(Color.BLUE)
                        .setDescription("Welcome In Your Ticket, Please write your Problem/Question directly in here, If there is no Message from you in 48hours, This ticket will getting closed!");
                guild.createTextChannel("t-" + random_int, guild.getCategoryById(TicketCategoryID))
                        .addPermissionOverride(event.getMember(), EnumSet.of(Permission.VIEW_CHANNEL), null) // adds the Member to the ticket!
                        .addPermissionOverride(guild.getPublicRole(), null, EnumSet.of(Permission.VIEW_CHANNEL)) // Deny's @everyone to see the ticket!
                        .addPermissionOverride(guild.getRoleById(TicketSupporterID), EnumSet.of(Permission.VIEW_CHANNEL), null) // adds @HumanResourceDepartment To the Ticket!
                        .setTopic("Ticket Topic 5") // Sets Ticket Topic
                        .complete().sendMessageEmbeds(ticketinfo.build()).setActionRow(closeButton(), claimButton()).queue();

            } else {
            }
        } // end of 'Human Resources Ticket'
         else if (BID.equals("closeButton")) {
        String roles = String.valueOf(event.getMember().getRoles());
        if (roles.contains(TicketSupporter)) {
            if (event.getChannel().getName().startsWith("t-")) {
                event.getInteraction().getChannel().delete().queue();
            }
        }
    } // end of 'closeButton'
        else if (BID.equals("claimButton")) {
        if (event.getMember().hasPermission(Permission.MESSAGE_MANAGE)) {
            TextChannel channel = event.getGuildChannel().asTextChannel();
            event.getInteraction().getMessage().delete().queue();
            EmbedBuilder ClaimedEmbed = new EmbedBuilder()
                    .setColor(Color.ORANGE)
                    .setTitle("Ticket System")
                    .setDescription(event.getInteraction().getUser().getAsMention() + " Claimed the Ticket.");
            channel.sendMessageEmbeds(ClaimedEmbed.build()).setActionRow(closeButton()).queue();
            PermissionOverride permissionOverride = channel.getPermissionOverride(event.getMember());
            if (permissionOverride == null) {
                channel.upsertPermissionOverride(event.getMember()).setAllowed(Permission.VIEW_CHANNEL).queue();
            } else {
                permissionOverride.getManager().setAllowed(Permission.VIEW_CHANNEL).queue();
            }
            PermissionOverride permissionOverride2 = channel.getPermissionOverride(event.getGuild().getRoleById(TicketSupporterID));
            if (permissionOverride2 == null) {
                channel.upsertPermissionOverride(event.getGuild().getRoleById(TicketSupporterID)).setDenied(Permission.VIEW_CHANNEL).queue();
            } else {
                permissionOverride2.getManager().setDenied(Permission.VIEW_CHANNEL).queue();
            }
        }
    } // end of 'claimButton'
}

    private Button closeButton() {
        return Button.danger("closeButton", "Close Ticket [Support Team Only]");
    }
    private Button claimButton() {
        return Button.success("claimButton", "Claim's The Ticket [Support Team Only]");
    }

}
