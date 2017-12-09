/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tp.showimgfromlink.view;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author meg4r0m
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
					UIManager.setLookAndFeel(info.getClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					e.printStackTrace();
				}
                break;
            }
        }
        launch();
    }
    
	private static void launch() {
		// Create window
		MainFrame mainFrame = new MainFrame();
		// Make this window visible
		mainFrame.setTitle("TP - Afficher image depuis URL");
		mainFrame.setVisible(true);
	}
    
}
