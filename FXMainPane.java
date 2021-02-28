package application;


import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

	/**
	 * This panel is the basic panel, inside which other panels are placed.  
	 * Before beginning to implement, design the structure of your GUI in order to 
	 * understand what panels go inside which ones, and what buttons or other components
	 * go in which panels.  
	 * @author ralexander
	 *
	 */
	//make the main panel's layout be a VBox
	public class FXMainPane extends HBox {
		
		public void start (Stage stage) {
			HBox hb1 = new HBox();
			HBox hb2 = new HBox();
		
			DataManager theDobject = new DataManager ();//Creating class DataManager
			TextField textFields=new TextField(); //Creating textFields
			Label labelVal=new Label ("Feedback:- "); //Creating the label Feedback
			
			
			Button bb1=new Button ("Hello"); //Creating button "Hello"
			bb1.setOnAction(new EventHandler < ActionEvent >()
			{
				@Override
				public void handle(ActionEvent e)
				{
					textFields.setText(theDobject.getHello());
				}
				
		    });
			
			Button bb2=new Button ("Howdy"); //Creating button "Howdy"
			bb2.setOnAction(new EventHandler < ActionEvent >() 
			{
				@Override
				public void handle(ActionEvent e)
				{
					textFields.setText(theDobject.getHowdy());
				}
			});
			
		    Button bb3=new Button ("Chinese"); //Creating Button "Chinese"
			bb3.setOnAction(new EventHandler < ActionEvent >() 
			{
				@Override
				public void handle(ActionEvent e)
				{
					textFields.setText(theDobject.getChinese());
				}
			});
			
		    Button bb4=new Button ("Clear"); //Creating Button "clear"
		    bb3.setOnAction(new EventHandler < ActionEvent >() 
			{
				@Override
				public void handle(ActionEvent e)
				{
					textFields.setText ("");
				}
			});
			
		    Button bb5=new Button ("Exit"); //Creating Button "Exit"
		    bb3.setOnAction(new EventHandler < ActionEvent >() 
			{
				@Override
				public void handle(ActionEvent e)
				{
					System.exit(0);
				}
			});
		    //Hboxes Instantiation
			HBox hBox = new HBox (55);
			hBox.setAlignment(Pos.CENTER);
			hBox.setSpacing(8);//space setting
			Insets inset = new Insets (18,18,18,18);
			
			   HBox.setMargin (textFields, new Insets (18,18,18,18));//Setting Margin
			   HBox.setMargin(bb1,new Insets (18,18,18,18));
			   HBox.setMargin(bb2,new Insets (18,18,18,18));
			   HBox.setMargin(bb3,new Insets (18,18,18,18));
			   HBox.setMargin(bb4,new Insets (18,18,18,18));
			   HBox.setMargin(bb5,new Insets (18,18,18,18));
			   
			   //centered position
			   hb1.setAlignment(Pos.CENTER);
			   hb1.getChildren().addAll(labelVal,textFields,hb2);
			   
			   //Added listing 
			   ObservableList <Node> listVal = hBox.getChildren();
			   listVal.addAll(textFields,bb1,bb2,bb3,bb4,bb5,hb1);
			   
			   Scene scenes=new Scene(hBox);
			   stage.setScene(scenes);
			   stage.show();
			   
			   
			   




	
			
			
			
			
			
		   
			
		}

		//student Task #2:
		//  declare five buttons, a label, and a textfield
		//  declare two HBoxes
		
		//student Task #4:
		//  declare an instance of DataManager
		/**
		 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
		 * wait to add a component to its containing component until the container has
		 * been created.  This is the only constraint on the order in which the following 
		 * statements appear.
		 */
		FXMainPane() {
			//student Task #2:
			//  instantiate the buttons, label, and textfield
			//  instantiate the HBoxes
			
			//student Task #4:
			//  instantiate the DataManager instance
			//  set margins and set alignment of the components
			
			//student Task #3:
			//  add the label and textfield to one of the HBoxes
			//  add the buttons to the other HBox
			//  add the HBoxes to this FXMainPanel (a VBox)
			
		}
		
		//Task #4:
		//  create a private inner class to handle the button clicks
	}


