/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BookingDialog;
import view.MainJFrame;

/**
 *
 * @author hvp
 */
public class FrontController {
    
    private final MainJFrame view;
    
    public FrontController(MainJFrame view) {
        this.view = view;
        this.view.addQuitMenuItemListener(this.getQuitActionListener());
        this.view.addBookingMenuItemListener(this.getBookingActionListener());
    }
    
    private ActionListener getQuitActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
                System.exit(0);
                
            }
        };
        return al;
    }
    
    private ActionListener getBookingActionListener() {
          ActionListener al = new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  BookingDialog book = new BookingDialog(view, true);
                  BookingController conn = new BookingController(book);
                  book.setVisible(true);
              }
          };
          return al;
      }
}
