/*Names: Brian Cabantug, Huy Le
 *Project No.: Project 10 Part 1
 *Due Date: November 3, 2016
 *Professor: Ray Ahmadnia
 *
 *Description: The program launches an applet that has text fields for name, address and phone number.
 *The user inputs the information in the text field and presses an add button to add the information
 *to a text area at the bottom of the applet. It updates the information each time the button is pressed and 
 *clears the text fields for more input.
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class CheckIn extends Applet implements ActionListener{
	//creating the labels,buttons,text areas, and text fields
	Label
		lblTitle = new Label("CALIFORNIA NITE CLUB CHECK-IN"),
		lblName = new Label("Name"),
		lblAddress = new Label("Address"),
		lblPhone = new Label("Phone Number"),
		lblGuest = new Label("List of Guests in the Club");
	TextField
		txtName = new TextField(),
		txtAddress = new TextField(),
		txtPhone = new TextField();
	Button
		btnAdd = new Button("Add to the List");
	TextArea
		txtaList = new TextArea("Name\t\tAddress\t\tPhone-Number\n",20,40,TextArea.SCROLLBARS_BOTH);
	
	//initializes the applet and places components in the panel
	public void init(){
		setLayout(null);
		
		//lblTitle.setFont(f);
		lblTitle.setBounds(50,10,200,50);
		add(lblTitle);
		//adds name label and txt field
		lblName.setBounds(10,60,70,20);
		add(lblName);
		txtName.setBounds(120,60, 150, 20);
		add(txtName);
		//adds address label and txt field
		lblAddress.setBounds(10,90,100,20);
		add(lblAddress);
		txtAddress.setBounds(120,90, 140, 20);
		add(txtAddress);
		//adds phone number label and txt Field
		lblPhone.setBounds(10,120,100,20);
		add(lblPhone);
		txtPhone.setBounds(120,120, 140, 20);
		add(txtPhone);
		
		//adds the button to add to thge list
		btnAdd.setBounds(20,150,120,30);
		add(btnAdd);
		//adds label of lists of guest to the club as title for the txtArea
		lblGuest.setBounds(100, 200, 200, 20);
		add(lblGuest);
		//adds the textarea to update the information list
		txtaList.setBounds(20, 220, 300, 200);
		add(txtaList);
		
		//adds an action listener to execute an action when the button is pressed
		btnAdd.addActionListener(this);
		
	}
	//implements this action when the button is pressed
	public void actionPerformed(ActionEvent event){
		//adds the text fields to the list as an entry
		String line, strName, strAddress, strPhone;
		
		//gets the content of each txtField
		strName = txtName.getText();
		strAddress = txtAddress.getText();
		strPhone = txtPhone.getText();
		//appends all content into one line to add to txtArea
		line = strName +"\t"+strAddress+"\t"+strPhone;
		//appends the info to the txtArea
		txtaList.append(line + "\n");
		//clears the Fields
		txtName.setText(" ");
		txtAddress.setText(" ");
		txtPhone.setText(" ");
		//replaces the cursor in the name field
		txtName.requestFocus();
	}
}
