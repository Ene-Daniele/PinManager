
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {

    static JDA bot;
    public static void main(String[] args) throws LoginException {

        bot = JDABuilder.createDefault("TOKEN").build();
        bot.addEventListener(new MessageListener());
    }
}
