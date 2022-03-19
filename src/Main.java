
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {

    static JDA bot;
    public static void main(String[] args) throws LoginException {

        bot = JDABuilder.createDefault("OTU0NDM5MTAyMTMwOTY2NjU4.YjTIrg.Old126k9ltzBw1uMK88dCgOIB0c").build();
        bot.addEventListener(new MessageListener());
    }
}
