package tapgui;

import java.awt.FlowLayout;

import java.awt.event.*;

import javax.swing.*;

import tapgui.GuiApp;





/**
 * This is a simple application for an address book
 * that enable the user to enter name,email,phone number and address 
 * and also save those details in the proper group of data whether 
 * it is family,friends or coworkers
 * 
 * 
 * @author Moneer
 * @version 1.0
 * @since26.09.2018
 */


/**
 * @author Rocco
 *
 */
/**
 * @author Rocco
 *
 */
public class GuiApp extends  JPanel {	
/**
 * JFrame f for the JFrame that will include the panel
 * 
 * JTextField tf1 for the first value to be entered 
 * JTextField tf2 for the second value to be entered 
 * JTextField tf3 for the third value to be entered 
 * JTextField tf4 for the forth value to be entered 
 * 
 * JButton b for submitting the details to be saved
 */
JFrame f ;

JTextField tf1;
JTextField tf2;
JTextField tf3;
JTextField tf4;


JButton b;


/**
 * JLabel 11,12,13,14,15,16,17,18
 * to describe what needs to be entered in the text fields 
 * 	ordered according to the numbers above 
 *	Enter name
 *	Enter phone 
 *	Enter address
 *   Enter email 
 *   Groups
 *   Friends
 *   family
 *    coworkers
 */
JLabel l1;
JLabel l2;
JLabel l3;
JLabel l4;


JLabel l5;
JLabel l6;
JLabel l7;
JLabel l8;

/**
 * JPanel panel 1 is for the first page of the application 
 * JPanel panel2 is for the second page of the application 
 */
JPanel panel;
JPanel panel2;

/**
 * the go method is the method that adds text fields, the button and text labels 
 * to both panels
 * it also sets the frame size,layout,visibility and to be exited when closed 
 */
public void go() {
	f = new JFrame();

	tf1 =new JTextField (15);

	tf2 =new JTextField (15);

	tf3 =new JTextField (15);

	tf4 =new JTextField (15);


	
	b=new JButton ("Submit details");
	
	
	
	l1 = new JLabel("Enter name ");
	l2 = new JLabel("Enter phone ");
	l3 = new JLabel("Enter address ");
	l4 = new JLabel("Enter email ");


	


	panel.add(tf1);
	panel.add(tf2);
	panel.add(tf3);
	panel.add(tf4);
	panel.add(b);

	panel.add(l1);

	panel.add(l2);

	panel.add(l3);

	panel.add(l4);
	f.setLayout(new FlowLayout());
	
	f.setSize(700, 700);;
	f.setVisible(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	
	

 l5= new JLabel ("Groups");
 l6= new JLabel ("Friends");
 l7=new JLabel ("family");
 l8=new JLabel ("coworkers");
 
 
 panel2.add(l5);

	panel2.add(l5);

	panel2.add(l6);

	panel2.add(l7);
	panel2.add(l8);

}


/**
 * this class is a tabbedpane class that includes a TabbedPaneD method
 * that adds the first panel to tab1
 *  and assign an icon to it with "Does nothing" text for hovering over the tab
 * it does the same thing for the second panel 
 */
public  class TabbedPaneD extends JFrame {
    public TabbedPaneD() {
        super();
         
        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = createImageIcon("khuhuhui");
         
   
        tabbedPane.addTab("Tab 1", icon, panel,
                "Does nothing");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
         
        ;
        tabbedPane.addTab("Tab 2", icon, panel2,
                "Does twice as much nothing");
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        //Add the tabbed pane to this panel.
        add(tabbedPane);
         
        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

    }
    /**
     * @param path sets the path for the imageicone
     * @return image URL if it wasn't null 
     * if no path found returns null
     */
    protected ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = TabbedPaneD.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
/**
 * this method adds the tabbedpaneD to the frame 
 * sets the frame to close on exit
 * adds the guiApp class to the frame to the window 
 * and select the layout of that window
 * displays the window 
 */
private static void createAndShowGUI() {
    //Create and set up the window.
    JFrame frame = new JFrame("TabbedPaneD");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    //Add content to the window.
    frame.add(new GuiApp(), FlowLayout.CENTER);
     
    //Display the window.
    frame.pack();
    frame.setVisible(true);
}

/**
 * @param args unused
 * @return nothing
 *  Schedule a job for the event dispatch thread:
 *  creating and showing this application's GUI.
 *   Turn off metal's use of bold fonts
 */

public static void main(String[] args) {
    //Schedule a job for the event dispatch thread:
    //creating and showing this application's GUI.
    SwingUtilities.invokeLater(
   
    new Runnable() {
     
        public void run() {
            //Turn off metal's use of bold fonts
    UIManager.put("swing.boldMetal", Boolean.FALSE);
    createAndShowGUI();
        }
    });
}
	       
}