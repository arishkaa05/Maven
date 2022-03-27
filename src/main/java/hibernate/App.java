package hibernate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class App {
    private JFrame manager;
    private DefaultTableModel model;
    private JButton save;
    private JButton add;
    private JButton delete;
    private JButton edit;
    private JButton folder;
    private JButton print;
    private JToolBar toolBar;
    private JScrollPane scroll;
    private JTable drivers;
    private JComboBox team;
    private JTextField lastname;
    private JTextField violation;
    private JTextField textSearch;
    private JButton search;
    private JComboBox comboBox;
    public void show() {
        add = new JButton("Добавить", new ImageIcon("./images/add.png"));
        delete = new JButton("Удалить", new ImageIcon("./images/delete.png"));
        edit = new JButton("Редактировать", new ImageIcon("./images/edit.png"));
        save = new JButton("Сохранить", new ImageIcon("./images/save.png"));
        folder = new JButton("Загрузить", new ImageIcon("./images/folder.png"));
        print = new JButton("Печать",new ImageIcon("./images/print.png"));
        add.setToolTipText("Добавить информацию о водителях");
        delete.setToolTipText("Удалить информацию о водителях");
        edit.setToolTipText("Изменить информацию о водителях");
        save.setToolTipText("Сохранить информацию о водителях");
        folder.setToolTipText("Загрузить информацию о водителях");
        print.setToolTipText("Распечатать информацию о водителях");
        manager = new JFrame("Водители");
        manager.setSize(1000, 500);
        manager.setLocation(100, 100);
        manager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        toolBar = new JToolBar("Панель инструментов");
        toolBar.add(add);
        toolBar.add(delete);
        toolBar.add(edit);
        toolBar.add(save);
        toolBar.add(folder);
        toolBar.add(print);
        manager.setLayout(new BorderLayout());
        manager.add(toolBar, BorderLayout.NORTH);
        String [] columns = {"Имя", "Фамилия", "Автомобиль", "Нарушение"};
        String [][] data = {{"Кирилл", "Иванов", "Toyota RAV4", "Выезд на встречную полосу"},
                {"Игорь", "Кудряшов", "Suzuki Vitara", "Управление ТС в состоянии опьянения"},
                {"Сергей", "Тихонов", "Nissan Kicks", "Превышение скорости"},
                {"Кирилл", "Иванов", "Mitsubishi ASX", "Выезд на встречную полосу"}};
        team = new JComboBox(new String[]{"Автомобиль", "Фамилия", "Имя", "Наруение"});
        textSearch = new JTextField();
        textSearch.setColumns(20);
        search = new JButton("Поиск");
        manager.getRootPane().setDefaultButton(search);
        JPanel searchPanel = new JPanel();
        searchPanel.add(team);
        searchPanel.add(textSearch);
        searchPanel.add(search);
        manager.add(searchPanel,BorderLayout.SOUTH);
        model= new DefaultTableModel(data, columns);
        drivers = new JTable(model);
        scroll = new JScrollPane(drivers);
        manager.add(scroll, BorderLayout.CENTER);
        lastname = new JTextField("Фамилия");
        violation = new JTextField("Нарушение");
        manager.setVisible(true);
    }
    public static void main(String[] args) {
        new App().show();
    }
}


