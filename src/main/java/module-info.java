module BingoBot.main {
	requires javafx.controls;
	requires javafx.graphics;
	requires net.dv8tion.jda;
	requires basebot;
	requires io.github.cdimascio.dotenv.java;

	exports calculusmaster.bingobot.ui to javafx.graphics;
}