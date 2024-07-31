package calculusmaster.bingobot;

import com.github.calculusmaster.basebot.BaseCommandListener;
import com.github.calculusmaster.basebot.registry.BaseCommandManager;
import io.github.cdimascio.dotenv.Dotenv;
import javafx.application.Platform;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class BingoBot
{
	public static BaseCommandManager COMMAND_MANAGER;
	public static Dotenv ENV;
	public static JDA JDA;

	public static void main(String[] args)
	{
		// Initialize JavaFX
		Platform.startup(() -> {});

		// Load environment variables
		ENV = Dotenv.load();

		// Initialize the CommandManager
		COMMAND_MANAGER = new BaseCommandManager();

		// Initialize the JDA instance
		JDA = JDABuilder.createLight(ENV.get("TOKEN"))
				.addEventListeners(new BaseCommandListener(COMMAND_MANAGER))
				.build();
	}
}
