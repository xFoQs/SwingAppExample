import javax.swing.*;

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

    //konstruktor klasy
    public SwingApp(){
        super("moj projekt");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args) {
        SwingApp swingApp = new SwingApp();
        swingApp.setVisible(true);
    }
}
