package Registration;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.Optional;

public class RegistrationDialogs extends Application {

    private String previousPassword;
    private String loginName;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        if (showConfirmationDialog()) {
            if (showLoginDialog()) {
                if (showPasswordDialog()) {
                    if (showConfirmPasswordDialog()) {
                        showRegistrationSuccessDialog();
                    }
                }
            }
        }

        primaryStage.close();
    }

    private boolean showConfirmationDialog() {
        Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmationAlert.setTitle("Регистрация");
        confirmationAlert.setHeaderText("Здравствуйте!");
        confirmationAlert.setContentText("Желаете зарегистрироваться?");

        // Настройка стилей диалогового окна
        DialogPane dialogPane = confirmationAlert.getDialogPane();
        dialogPane.setStyle("-fx-font-family: Ubuntu;-fx-font-color:#000000;-fx-font-style: italic bold;-fx-font-size: 18px;-fx-background-color: #ffcc00;-fx-color:#000000;");
        dialogPane.lookup(".header-panel").setStyle("-fx-background-color: #ffcc00;");

        // Задайте стиль каждой кнопке
        ButtonType yesButton = new ButtonType("Да");
        ButtonType noButton = new ButtonType("Нет", ButtonBar.ButtonData.CANCEL_CLOSE);
        confirmationAlert.getButtonTypes().setAll(yesButton, noButton);

        Node yesButtonNode = confirmationAlert.getDialogPane().lookupButton(yesButton);
        yesButtonNode.setStyle("-fx-background-color: #00FFFF;-fx-effect: dropshadow(three-pass-box, rgb(0, 200, 200), 30, 0, 5, 10);"); // Задайте цвет кнопки "Да"

        Node noButtonNode = confirmationAlert.getDialogPane().lookupButton(noButton);
        noButtonNode.setStyle("-fx-background-color: #C70000;-fx-effect: dropshadow(three-pass-box, rgb(200, 0, 0), 30, 0, 5, 10);"); // Задайте цвет кнопки "Нет"

        Optional<ButtonType> result = confirmationAlert.showAndWait();
        return result.orElse(noButton) == yesButton;
    }


    private boolean showLoginDialog() {
        TextInputDialog loginDialog = new TextInputDialog();
        loginDialog.setTitle("Регистрация");
        loginDialog.setHeaderText("Введите логин");
        loginDialog.setContentText("Логин:");

        DialogPane dialogPane = loginDialog.getDialogPane();
        dialogPane.setStyle("-fx-font-family: Ubuntu;-fx-font-style: italic bold;-fx-font-size: 18px;-fx-background-color: #ffcc00;-fx-color:#000000;");
        dialogPane.lookup(".header-panel").setStyle("-fx-background-color: #ffcc00;-fx-color:#000000;");
        dialogPane.lookup(".text-field").setStyle("-fx-background-color: #00FFFF;-fx-effect: dropshadow(three-pass-box, rgb(0, 200, 200), 30, 0, 5, 10);-fx-spacing: 50px");

        Node yes = loginDialog.getDialogPane().lookupButton(loginDialog.getDialogPane().getButtonTypes().get(0));
        yes.setStyle("-fx-background-color: #00FFFF;-fx-effect: dropshadow(three-pass-box, rgb(0, 200, 200), 30, 0, 5, 10);");

        Node no = loginDialog.getDialogPane().lookupButton(loginDialog.getDialogPane().getButtonTypes().get(1));
        no.setStyle("-fx-background-color: #C70000;-fx-effect: dropshadow(three-pass-box, rgb(200, 0, 0), 30, 0, 10, 15);");

        while (true) {
            Optional<String> result = loginDialog.showAndWait();
            if (result.isPresent()) {
                String login = result.get();
                if (isValidLogin(login)) {
                    loginName = result.get();
                    return true;
                } else {
                    showAlert("Неправильный логин", "Логин не должен содержать пробелов и должен быть не менее 5 символов.");
                }
            } else {
                return false;
            }
        }
    }

    private boolean showPasswordDialog() {
        PasswordDialog passwordDialog = new PasswordDialog();
        passwordDialog.setTitle("Регистрация");
        passwordDialog.setHeaderText("Введите пароль");

        DialogPane dialogPane = passwordDialog.getDialogPane();
        dialogPane.setStyle("-fx-font-family: Ubuntu;-fx-font-style: italic bold;-fx-font-size: 18px;-fx-background-color: #ffcc00;-fx-color:#000000;");
        dialogPane.lookup(".header-panel").setStyle("-fx-background-color: #ffcc00;-fx-color:#000000;");
        dialogPane.lookup(".text-field").setStyle("-fx-background-color: #00FFFF;-fx-effect: dropshadow(three-pass-box, rgb(0, 200, 200), 30, 0, 5, 10);-fx-spacing: 50px");
        //dialogPane.lookup(".button-bar").setStyle("-fx-padding: 0 0 0 0");
        Node yes = passwordDialog.getDialogPane().lookupButton(passwordDialog.getDialogPane().getButtonTypes().get(0));
        yes.setStyle("-fx-background-color: #00FFFF;-fx-effect: dropshadow(three-pass-box, rgb(0, 200, 200), 30, 0, 5, 10);");

        Node no = passwordDialog.getDialogPane().lookupButton(passwordDialog.getDialogPane().getButtonTypes().get(1));
        no.setStyle("-fx-background-color: #C70000;-fx-effect: dropshadow(three-pass-box, rgb(200, 0, 0), 30, 0, 10, 15);");

        while (true) {
            Optional<String> result = passwordDialog.showAndWait();
            if (result.isPresent()) {
                String password = result.get();
                if (isValidPassword(password)) {
                    previousPassword = password;
                    return true;
                } else {
                    showAlert("Неправильный пароль", "Пароль должен быть не менее 8 символов, не должен содержать пробелов, и должен содержать как минимум одну цифру и одну букву.");
                }
            } else {
                return false;
            }
        }
    }

    private boolean showConfirmPasswordDialog() {
        PasswordDialog confirmPasswordDialog = new PasswordDialog();
        confirmPasswordDialog.setTitle("Регистрация");
        confirmPasswordDialog.setHeaderText("Подтвердите пароль");

        DialogPane dialogPane = confirmPasswordDialog.getDialogPane();
        dialogPane.setStyle("-fx-font-family: Ubuntu;-fx-font-style: italic bold;-fx-font-size: 18px;-fx-background-color: #ffcc00;-fx-color:#000000;");
        dialogPane.lookup(".header-panel").setStyle("-fx-background-color: #ffcc00;-fx-color:#000000;");
        dialogPane.lookup(".text-field").setStyle("-fx-background-color: #00FFFF;-fx-effect: dropshadow(three-pass-box, rgb(0, 200, 200), 30, 0, 5, 10);-fx-spacing: 50px");

        Node yes = confirmPasswordDialog.getDialogPane().lookupButton(confirmPasswordDialog.getDialogPane().getButtonTypes().get(0));
        yes.setStyle("-fx-background-color: #00FFFF;-fx-effect: dropshadow(three-pass-box, rgb(0, 200, 200), 30, 0, 5, 10);");

        Node no = confirmPasswordDialog.getDialogPane().lookupButton(confirmPasswordDialog.getDialogPane().getButtonTypes().get(1));
        no.setStyle("-fx-background-color: #C70000;-fx-effect: dropshadow(three-pass-box, rgb(200, 0, 0), 30, 0, 10, 15);");
        while (true) {
            Optional<String> result = confirmPasswordDialog.showAndWait();
            if (result.isPresent()) {
                String confirmPassword = result.get();
                if (confirmPassword.equals(previousPassword)) {
                    return true;
                } else {
                    showAlert("Пароли не совпадают", "Пожалуйста попробуйте ещё раз");
                }
            } else {
                return false;
            }
        }
    }

    private void showRegistrationSuccessDialog() {
        Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
        successAlert.setTitle("Регистрация");
        successAlert.setHeaderText("Вы зарегистрированы");
        successAlert.setContentText("Регистрация прошла успешно\n" + "Ваш логин: " + loginName + "\nВаш пароль:" + previousPassword);

        DialogPane dialogPane = successAlert.getDialogPane();
        dialogPane.setStyle("-fx-font-family: Ubuntu;-fx-font-style: italic bold;-fx-font-size: 18px;-fx-background-color: #ffcc00;-fx-color:#000000;");
        dialogPane.lookup(".header-panel").setStyle("-fx-background-color: #ffcc00;-fx-color:#000000;");
        
        Node yes = successAlert.getDialogPane().lookupButton(successAlert.getDialogPane().getButtonTypes().get(0));
        yes.setStyle("-fx-background-color: #00FFFF;-fx-effect: dropshadow(three-pass-box, rgb(0, 200, 200), 30, 0, 5, 10);");
        successAlert.showAndWait();
    }

    private boolean isValidLogin(String login) {
        return login.length() >= 5 && !login.contains(" ");
    }

    private boolean isValidPassword(String password) {
        return password.length() >= 8 && !password.contains(" ") && password.matches(".*[a-zA-Zа-яА-Я].*") && password.matches(".*\\d.*");
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
    private static class PasswordDialog extends Dialog<String> {
        public PasswordDialog() {
            setTitle("Регистрация");
            setHeaderText("Введите пароль");

            ButtonType loginButtonType = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
            getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

            PasswordField passwordField = new PasswordField();
            passwordField.setPromptText("Пароль");

            getDialogPane().setContent(passwordField);

            setResultConverter(dialogButton -> {
                if (dialogButton == loginButtonType) {
                    return passwordField.getText();
                }
                return null;
            });
        }
    }
}
