package part1_java_final;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProductSelection extends JFrame implements ItemListener {
  private JCheckBox laptopBox;
  private JCheckBox phoneBox;
  private JCheckBox tabletBox;
  private JLabel productsLabel;
  private String products = "";

  public ProductSelection() {
    setLayout(new FlowLayout());

    laptopBox = new JCheckBox("Laptop");
    phoneBox = new JCheckBox("Phone");
    tabletBox = new JCheckBox("Tablet");

    add(laptopBox);
    add(phoneBox);
    add(tabletBox);

    laptopBox.addItemListener(this);
    phoneBox.addItemListener(this);
    tabletBox.addItemListener(this);

    productsLabel = new JLabel("Products: ");
    add(productsLabel);
  }

  public void itemStateChanged(ItemEvent e) {
    products = "";
    if (laptopBox.isSelected()) {
      products += "Laptop ";
    }
    if (phoneBox.isSelected()) {
      products += "Phone ";
    }
    if (tabletBox.isSelected()) {
      products += "Tablet ";
    }
    productsLabel.setText("Products: " + products);
  }

  public static void main(String[] args) {
    ProductSelection gui = new ProductSelection();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setSize(300, 100);
    gui.setVisible(true);
    gui.setTitle("Product Selection");
  }
}

