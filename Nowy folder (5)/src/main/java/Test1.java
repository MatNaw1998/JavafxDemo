import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test1 extends Application {

    TextArea textArea;
    Button btnTime;
    Button btnDate;
    Button btnDate_Time;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        VBox layout = new VBox();
        layout.setSpacing(10);
        layout.setPadding(new Insets(20,20,20,20));
        textArea = new TextArea();
        btnDate = new Button("Date");
        btnTime = new Button("Time");
        btnDate_Time = new Button("Time and Date");

        btnTime.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Button Time was pressed \n");
            }
        });


        btnDate.setOnAction(e->{
            System.out.println("Button Date was pressed");
            LocalDate date = LocalDate.now();
            String info = date.toString();
            textArea.setText(info);
        });
        btnTime.setOnAction(e->{
            System.out.println("Button Time was pressed");
            LocalTime time = LocalTime.now();
            String info2 = time.toString();
            textArea.setText(info2);
        });

        //bonus
        btnDate_Time.setOnAction(e->{
            System.out.println("Button Time and Date was pressed");
            LocalDateTime time_date = LocalDateTime.now();
            String info3 = time_date.toString();
            textArea.setText(info3);
        });


        HBox hBox = new HBox();
      hBox.getChildren().add(btnDate);
        hBox.getChildren().add(btnTime);
        hBox.getChildren().add(btnDate_Time);

        layout.getChildren().add(textArea);
        layout.getChildren().add(hBox);
        Scene scene = new Scene(layout, 400, 300);

        primaryStage.setScene(scene); // uuuuu, przygotowana scena
        primaryStage.setTitle("FX1");
        primaryStage.show();

    }

    git config --global user.email "matnaw98@gmail.com"
    git config --global user.name "MatNaw98"

}