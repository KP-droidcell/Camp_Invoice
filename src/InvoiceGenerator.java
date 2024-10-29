import javax.swing.*;
import java.awt.*;

public class InvoiceGenerator extends JFrame
{
        private JPanel mainPnl;
        public InvoiceGenerator()
        {
            setTitle("Invoice Generator");
            setSize(420, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainPnl = new JPanel();
            mainPnl.setLayout(new BorderLayout());
            add(mainPnl);
            setVisible(true);
        }
}
