Parent root = FXMLLoader.load(getClass().getResource("FXMLhome.fxml"));
root.getStylesheets().add("file:///C:/Users/mohar/Desktop/style.css");
Scene scene = new Scene(root);
Stage stage = (Stage)error_label.getScene().getWindow();
stage.setScene(scene);
stage.show();