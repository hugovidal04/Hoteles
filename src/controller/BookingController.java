/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.BookingDialog;

/**
 *
 * @author hvp
 */
public class BookingController {

    private final BookingDialog view;

    public BookingController(BookingDialog view) {
        this.view = view;
        this.view.addCancelButtonActionListener(this.getCancelButtonActionListener());
        this.view.addConfirmButtonActionListener(this.addConfirmButtonActionListener());
    }

    private ActionListener getCancelButtonActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();

            }
        };
        return al;
    }

    private ActionListener addConfirmButtonActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rooms = view.getSelectedOptionCheckBox();
                String name = view.getNameTextField();
                String phone = view.getPhoneTextField();
                String email = view.getEmailTextField();
                String event = view.getEventDateTextField();
                int assistants = view.getSpinnerValue();
                String kitchenSelectOption = view.getKitchenComboBoxItem();
                String kitchenComboBox = view.getSelectedOptions();
                JOptionPane.showMessageDialog(view,
                        "Reserva creada con éxito\n"
                        + "Nombre del registrante: " + name + "\n"
                        + "Correo electrónico del registrante: " + email + "\n"
                        + "Teléfono del registrante: " + phone + "\n"
                        + "Evento registrado: " + event + "\n"
                        + "Habitaciones registradas: " + rooms + "\n"
                        + "Asistentes registrados: " + assistants + "\n"
                        + "Tipo de cocina elegida: " + kitchenSelectOption + "\n"
                        + "Tipo de evento elegido: " + kitchenComboBox);
            }
        };
        return al;
    }

}
