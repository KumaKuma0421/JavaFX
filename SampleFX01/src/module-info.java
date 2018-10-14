module Main {
	requires transitive javafx.base;
	requires transitive javafx.controls;
	requires transitive javafx.fxml;
	requires transitive javafx.graphics;
	exports Main;
	opens Main to Main.fxml;
}