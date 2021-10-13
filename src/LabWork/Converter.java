package LabWork;

import javax.swing.*;

public class Converter {
  //Learning Java
  public static void main(String[] args) {
    Convert c;
    String md, v;
    do {
      md = JOptionPane.showInputDialog("Укажите, что будете конвертировать:\n[1] - масса\n[2] - расстояние");
    } while (Integer.parseInt(md) < 1 || Integer.parseInt(md) > 2);
    if (Integer.parseInt(md) == 1) {
      do {
        md = JOptionPane.showInputDialog("Выберите единицу измерения:\n[1] - кг\n[2] - грамм\n[3] - фунт(lb)\n[4] - карат");
      } while (Integer.parseInt(md) < 1 || Integer.parseInt(md) > 4);
      v = JOptionPane.showInputDialog("Введите число:");
      c = new Convert(1, Integer.parseInt(md), Integer.parseInt(v));
      c.getMetricK();
    } else {
      do {
        md = JOptionPane.showInputDialog("Выберите единицу измерения:\n[1] - метр\n[2] - миля\n[3] - ярд\n[4] - фут");
      } while (Integer.parseInt(md) < 1 || Integer.parseInt(md) > 4);
      v = JOptionPane.showInputDialog("Введите число:");
      c = new Convert(2, Integer.parseInt(md), Integer.parseInt(v));
      c.getMetricM();
      // Changes for GIT
    }
  }
}
