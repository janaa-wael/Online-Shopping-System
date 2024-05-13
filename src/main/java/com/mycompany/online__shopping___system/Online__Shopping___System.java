/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shoppingcenter;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class Online__Shopping___System extends Application  {

    Image image1 = new Image("https://assets.ajio.com/medias/sys_master/root/20230728/l7G7/64c3da83a9b42d15c9793be5/-473Wx593H-443014162-blue-MODEL.jpg");
    ImageView imageView1 = new ImageView(image1);
    Image image2 = new Image("https://cdn09.nnnow.com/web-images/medium/styles/O1NP9FK30UP/1697796131784/1.jpg");
    ImageView imageView2 = new ImageView(image2);
    Image image3 = new Image("https://i.pinimg.com/736x/19/2a/da/192adacac5efa7221b657e2b8e17802b.jpg");
    ImageView imageView3 = new ImageView(image3);
    Image image4 = new Image("https://cdn.endource.com/image/8c5e3971dfd525b5bf1db74aed513b2a/detail/gestuz-elmagz-high-rise-wide-leg-jeans.jpg?optimizer=image&class=800");
    ImageView imageView4 = new ImageView(image4);
    Stage stage1=new Stage();
    Stage stage2 = new Stage();
    Stage stage3 = new Stage();
    Customer c1 = new Customer();
    public Products.Size selectedsize;
    @Override
    public void start(Stage stage) throws IOException  {
        Admin admin = new Admin();
        Text username = new Text("username:");
        Text password = new Text("password:");
        javafx.scene.control.TextField user = new javafx.scene.control.TextField();
        PasswordField pass = new PasswordField();
        javafx.scene.control.Label invalidCredentials = new Label();

        javafx.scene.control.Button login = new Button("Let me in!!");
        GridPane gridpane = new GridPane();
        gridpane.setMinSize(400,200);
        gridpane.setPadding(new Insets(10,10,10,10));
        gridpane.setVgap(2);
        gridpane.setHgap(2);
        BackgroundFill filler=new BackgroundFill(Color.LIGHTPINK, CornerRadii.EMPTY,Insets.EMPTY);
        Background fill = new Background(filler);



        gridpane.setBackground(fill);
        gridpane.setAlignment(Pos.CENTER);
        gridpane.add(username,0,0);
        gridpane.add(user,1,0);
        gridpane.add(password,0,1);
        gridpane.add(pass,1,1);
        gridpane.add(login,1,2);
        gridpane.add(invalidCredentials,1,3);
        login.setOnAction(e ->
                {
                    String usernameIP = user.getText();
                    String passwordIP = pass.getText();

                    if (admin.authenticateCredentials(usernameIP,passwordIP)){
                        Home();
                        stage.close();
                    }
                    else{
                        invalidCredentials.setText("Invalid username or password!");
                    }
                }
                );
        Scene scene = new Scene(gridpane,
                Color.LIGHTPINK);
        stage.setTitle("FBI open up!");
        //BackgroundFill fill=new BackgroundFill(Color.LIGHTPINK, CornerRadii.EMPTY,Insets.EMPTY);
        //scene.setFill(Color.LIGHTPINK);
        stage.setScene(scene);
        stage.show();
    }

    private void Home(){
        BorderPane pane=new BorderPane();
        pane.setBackground(new Background(new BackgroundFill(Color.LIGHTPINK,CornerRadii.EMPTY,Insets.EMPTY)));
        pane.setPadding(new Insets(10));
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));

        VBox vBox1=new VBox(10);

        imageView1.setFitWidth(250);
        imageView1.setFitHeight(300);
        Label label1=new Label("Denim");
        label1.setFont(Font.font("Calberi", FontWeight.BOLD, 20));
        vBox1.getChildren().addAll(imageView1,label1);
        vBox1.setAlignment(Pos.CENTER);

        VBox vBox2=new VBox(10);
        imageView2.setFitWidth(250);
        imageView2.setFitHeight(300);
        Label label2=new Label("Sportswear");
        label2.setFont(Font.font("Calberi", FontWeight.BOLD, 20));
        vBox2.getChildren().addAll(imageView2,label2);
        vBox2.setAlignment(Pos.CENTER);

        VBox vBox3=new VBox(10);
        imageView3.setFitWidth(250);
        imageView3.setFitHeight(300);
        Label label3=new Label("Hijab Clothes");
        label3.setFont(Font.font("Calberi", FontWeight.BOLD, 20));
        vBox3.getChildren().addAll(imageView3,label3);
        vBox3.setAlignment(Pos.CENTER);

        hBox.getChildren().addAll(vBox1,vBox2,vBox3);
        pane.setCenter(hBox);


        Scene scene = new Scene(pane,850,600);
        stage1.setTitle("Home Page"); // Set the stage title
        stage1.setScene(scene); // Place scene in stage
        stage1.show();

        // Code to navigate to another page when the denim image is clicked
        imageView1.setOnMouseClicked((MouseEvent event) -> {
            openSecondPage();
            stage1.close();
        });

    }



    private void openSecondPage() {

        BorderPane secondPane = new BorderPane();
        secondPane.setBackground(new Background(new BackgroundFill(Color.LIGHTPINK,CornerRadii.EMPTY,Insets.EMPTY)));
        secondPane.setPadding(new Insets(10));
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));

        VBox vBox1=new VBox(10);
        imageView4.setFitWidth(250);
        imageView4.setFitHeight(300);
        Label label1=new Label("Pants");
        label1.setFont(Font.font("Calberi", FontWeight.BOLD, 20));
        vBox1.getChildren().addAll(imageView4,label1);
        vBox1.setAlignment(Pos.CENTER);


        VBox vBox2=new VBox(10);
        imageView1.setFitWidth(250);
        imageView1.setFitHeight(300);
        Label label2=new Label("Jackets");
        label2.setFont(Font.font("Calberi", FontWeight.BOLD, 20));
        vBox2.getChildren().addAll(imageView1,label2);
        vBox2.setAlignment(Pos.CENTER);

        hBox.getChildren().addAll(vBox1,vBox2);
        secondPane.setCenter(hBox);
        // Set up the content for the second page
        Scene secondScene = new Scene(secondPane, 800, 600);
        stage2.setTitle("Denim");
        stage2.setScene(secondScene);
        stage2.show();

        // Close the current stage
        stage1.close();
        imageView4.setOnMouseClicked((MouseEvent event) -> {
            openThirdpage();
        });
    }
    public void openThirdpage(){
        GridPane gridPane = new GridPane(); // GridPane to hold images and buttons
        gridPane.setHgap(10); // Horizontal gap between grid elements
        gridPane.setVgap(10); // Vertical gap between grid elements
        gridPane.setPadding(new javafx.geometry.Insets(10)); // Add padding around the GridPane
        gridPane.setStyle("-fx-background-color: lightpink;"); // Set background color


        Image[] images = {
                new Image("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTKb9rjxJLmKf1NGQxxWzy55UZv0IC3ErQbHYRWHz1B5GDA4hSB"),
                new Image("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQr535hdmL9yy4n4dKw_evMMJYGUcYne2bW-QRd1UGPvno6dYlo"),
                new Image("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRRIJo48t8XcS369JkWRn7CdNzPVhXGqbS9ki6aBOQhgIpEhK02"),
                new Image("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQgpL3bHSZoqkCRKGK_g1YRU8OxXopiXqoftmEMjJ2EXDA7z-mf"),
                new Image("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTyiUUaJB9z53b7_8Z32kE-WWl5DgNrJgJ1HIQJ2JyD29rgRP7G")
        };



        int column = 0;
        int row = 0;

        for (int i = 0; i < images.length; i++) {
            ImageView imageView = new ImageView(images[i]);
            imageView.setFitWidth(200); // Adjust the width of the image view
            imageView.setFitHeight(200); // Adjust the height of the image view
            gridPane.add(imageView, column, row); // Add the image view to the GridPane

            Rectangle border = new Rectangle(imageView.getFitWidth(), imageView.getFitHeight());
            border.setFill(Color.TRANSPARENT);
            border.setStroke(Color.BLACK);
            // Add buttons under each image
            border.setStrokeWidth(6); // Set the border width

            gridPane.add(border, column, row);
            column++; // Move to the next column

            // If the column reaches 2, move to the next row and reset the column
            if (column == 2) {
                column = 0;
                row += 2; // Move to the next row
            }
        }
        Button button1 = new Button("Wide Leg Jeans ");
        gridPane.add(button1, 0, 1); // Add the button to the GridPane
        button1.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 14px;");
        button1.setOnAction(e -> {
            if (button1.getStyle().contains("-fx-background-color: pink")) {
                button1.setStyle("-fx-background-color: lightblue; -fx-text-fill: black; -fx-font-weight: bold; -fx-font-size: 14px;");
            } else {
                button1.setStyle("-fx-background-color: pink; -fx-text-fill: black; -fx-font-weight: bold; -fx-font-size: 14px;");
            }
            lastpage();
            //border.setStroke(button1.getStyle().contains("-fx-background-color: pink") ? Color.PINK : Color.BLACK);
        });

        Button button2 = new Button("Mom Jeans");
        gridPane.add(button2, 1, 1); // Add the button to the GridPane
        button2.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 14px;");
        button2.setOnAction(e -> button2.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 14px;")); // Change button color when clicked

        Button button3 = new Button("Straight Jeans");
        gridPane.add(button3, 0, 3); // Add the button to the GridPane
        button3.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 14px;");
        button3.setOnAction(e -> button3.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 14px;")); // Change button color when clicked


        Button button4 = new Button("Cargo Jeans");
        gridPane.add(button4, 1, 3); // Add the button to the GridPane
        button4.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 14px;");
        button4.setOnAction(e -> button4.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 14px;")); // Change button color when clicked


        Button button5 = new Button("Skinny Jeans");
        gridPane.add(button5, 0, 5); // Add the button to the GridPane
        button5.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 14px;");
        button5.setOnAction(e -> button5.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 14px;")); // Change button color when clicked


        ScrollPane scrollPane = new ScrollPane(gridPane); // Put the GridPane inside a ScrollPane
        scrollPane.setFitToWidth(true); // Ensure the ScrollPane fits to the width of the scene

        Scene scene = new Scene(scrollPane, 450, 450); // Set a fixed size for the scene
        stage3.setTitle("Show Images with Buttons");
        stage3.setScene(scene);
        stage3.show();
        stage2.close();
    }
    public void lastpage(){
        Stage stage=new Stage();
        Pane pane = new HBox(50);
        // HBox is covered in next section

        Pants pant1=new Pants(2000, 12367 ,"jeans","American Eagle Women","Wide-leg jeans");
        pane.setPadding(new Insets(10, 10, 10, 10));
        Image image = new Image("https://m.media-amazon.com/images/I/511j464MtML._AC_SY679_.jpg");



        ImageView imageView=new ImageView(image);
        imageView.setFitHeight(350); // fit into 100-x-100
        imageView.setFitWidth(200); // pixel area
        Button homeButton1 = new Button("Home");

        homeButton1.setOnAction((ActionEvent e) -> {

            Home();
            stage.close();


        });




        Label label=new Label(pant1.toString());
        pane.getChildren().addAll(imageView,label,homeButton1);
        homeButton1.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 10));
        homeButton1.setMinWidth(50); // Set minimum width to 100 pixels
        homeButton1.setMaxWidth(50); // Set maximum width to 100 pixels
        homeButton1.setMinHeight(28); // Set minimum height to 50 pixels
        homeButton1.setMaxHeight(28); // Set maximum height

        VBox vBox = new VBox(20);
        Button belowButton1 = new Button("+");
        HBox x=new HBox(8) ;
        Label lebel=new Label("ADD To cart");

        Button belowButton2 = new Button("-");




        lebel.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC,18))  ;         //( "Arial", 20) ;
        belowButton1.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 10));
        belowButton1.setMinWidth(28); // Set minimum width to 100 pixels
        belowButton1.setMaxWidth(28); // Set maximum width to 100 pixels
        belowButton1.setMinHeight(28); // Set minimum height to 50 pixels
        belowButton1.setMaxHeight(28); // Set maximum height to 50 pixels

        belowButton2.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 10));
        belowButton2.setMinWidth(28); // Set minimum width to 100 pixels
        belowButton2.setMaxWidth(28); // Set maximum width to 100 pixels
        belowButton2.setMinHeight(28); // Set minimum height to 50 pixels
        belowButton2.setMaxHeight(28); // Set maximum height to 50







        label.setFont(Font.font("Arial",   14));

        ComboBox<Products.Size> sizeComboBox = new ComboBox<>();
        sizeComboBox.setItems(FXCollections.observableArrayList(Products.Size.XS,
                Products.Size.S, Products.Size.M,Products.Size. L, Products.Size.XL,Products.Size.XXL));

        sizeComboBox.setPromptText("Select Size");
        sizeComboBox.setStyle("-fx-font-family: Arial; -fx-font-size: 14;")  ;
        x.getChildren().addAll(lebel, belowButton1, sizeComboBox,belowButton2);


        vBox.getChildren().addAll(pane, x);








        sizeComboBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Retrieve the selected item from the ComboBox
                selectedsize = sizeComboBox.getValue();

                System.out.println(selectedsize);
            }
        });



        TextField quantityField = new TextField("0");
        quantityField.setEditable(false);  // Make the field non-editable
        quantityField.setPrefWidth(50);    // Se


        x.getChildren().add(quantityField);

        belowButton1.setOnAction((ActionEvent e) -> {

                    try{
                        c1.addToCart(pant1, 1, selectedsize);
                        int currentValue = Integer.parseInt(quantityField.getText());
                        quantityField.setText(String.valueOf(currentValue + 1));
                        Integer o= pant1. getOneQuantity(selectedsize) ;
                        System.out.println(o);
                    }catch(Exception ex)
                    {
                        pant1.setcustomerSize();

                        selectedsize=pant1.getcustomerSize();

                        c1.addToCart(pant1,1, selectedsize);
                        int currentValue = Integer.parseInt(quantityField.getText());
                        quantityField.setText(String.valueOf(currentValue + 1));


                    }


                    Integer o= pant1. getOneQuantity(selectedsize) ;
                    System.out.println(o);

                    //Order order1=new Order("g67", c1,c1.getCart());


                    //   order1.toString();



                } //  private Products.Size selectedSize;
        );



        belowButton2.setOnAction((ActionEvent e) -> {
            int currentValue = Integer.parseInt(quantityField.getText());
            quantityField.setText(String.valueOf(currentValue- 1));

            c1.removeFromCart(pant1, 1, selectedsize);
            Integer o= pant1. getOneQuantity(selectedsize) ;
            System.out.println(o);
        });



        vBox.setStyle("-fx-background-color: Pink");
        Scene scene = new Scene( vBox,900,500);

        stage.setTitle("Denim Pants"); // Set the stage title
        stage.setScene(scene); // Place scene in stage
        stage.show();
        stage3.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
