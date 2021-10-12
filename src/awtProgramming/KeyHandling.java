package awtProgramming;
import java.awt.*;
import java.awt.event.*;

public class KeyHandling {
    private Frame f;
    private Panel p;
    private Button ok,submit,cancel;
    private Label status,header;

    public KeyHandling(){
        prepareGUI();
    }

    private void prepareGUI(){
        f=new Frame("AWT example");
        f.setSize(400,400);
        f.setLayout(new GridLayout(3,1));
        f.addWindowFocusListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        header=new Label();
        header.setAlignment(Label.CENTER);
        status=new Label();
        status.setAlignment(Label.CENTER);
        status.setSize(150,100);
        p=new Panel();
        p.setLayout(new FlowLayout());
        f.add(header);
        f.add(p);
        f.add(status);
        f.setVisible(true);
        p.setBackground(Color.cyan);

    }

    private void showEventDemo(){
        header.setText("Control in action: Button");
        ok=new Button("OK");
        cancel=new Button("Cancel");
        submit=new Button("Submit");
        ok.setActionCommand("OK");
        submit.setActionCommand("Submit");
        cancel.setActionCommand("Cancel");
        ok.addActionListener(new ButtonClickListener());

    }

}
