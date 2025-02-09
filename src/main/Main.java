/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.FrontController;
import view.MainJFrame;

/**
 *
 * @author hvp
 */
public class Main {

    public static void main(String[] args) {
        MainJFrame mainView = new MainJFrame();
        FrontController fc = new FrontController(mainView);
        mainView.setVisible(true);
    }
}
