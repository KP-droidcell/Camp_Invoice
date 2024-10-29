import javax.swing.*;
import java.awt.*;

public class AddressEntityWidget  extends JFrame
{
    private Customer customer;
    private JPanel mainPnl;
    private JLabel customerNameLbl;
    private JLabel street1Lbl;
    private JLabel street2Lbl;
    private JLabel cityLbl;
    private JLabel stateLbl;
    private JLabel zipLbl;

    private JTextField customerNameTf;
    private JTextField street1Tf;
    private JTextField street2Tf;
    private JTextField cityTf;
    private JTextField stateTf;
    private JTextField zipTf;

    public AddressEntityWidget()
    {
        setTitle("Customer");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPnl = new JPanel();
        mainPnl.setLayout(new GridLayout(5,1));

        customerNameLbl = new JLabel("Custoner name");
        street1Lbl = new JLabel("Street 1: ");
        street2Lbl = new JLabel("Steet 2: ");
        cityLbl = new JLabel("City: ");
        stateLbl = new JLabel("State: ");
        zipLbl = new JLabel("Zip: ");

        customerNameTf = new JTextField();
        street1Tf = new JTextField();
        street2Tf = new JTextField();
        cityTf = new JTextField();
        stateTf = new JTextField();
        zipTf = new JTextField();

        add(mainPnl);
        setVisible(true);
    }
}
