import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SwingApp extends JFrame{
    private JPanel panel1;
    private JPanel JPanelTop;
    private JPanel JPanelLeft;
    private JPanel JPanelRight;
    private JButton buttonNew;
    private JButton buttonSave;
    private JTextField textName;
    private JTextField textEmail;
    private JTextField textPhoneNumber;
    private JTextField textAddress;
    private JTextField textDateBirth;
    private JList listPeople;
    private JLabel JLabelAge;
    private ArrayList <Person> people;

    //konstruktor klasy
    public SwingApp(){
        super("moj projekt");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        buttonNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {



            }
        });
        listPeople.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {

            }
        });
    }

    public static void main(String[] args) {
        SwingApp swingApp = new SwingApp();
        swingApp.setVisible(true);
    }

    public void addPerson(Person p)
    {
        people.add(p);
    }
}
