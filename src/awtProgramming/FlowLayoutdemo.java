package awtProgramming;

import java.awt.*;


class FrameClass extends Frame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public FrameClass(){
        super("FlowLayoutProgram");
    }

    public void init(){
        Button b1= new Button("1");
        Button b2= new Button("2");
        Button b3= new Button("3");
        Button b4= new Button("4");
        Button b5= new Button("5");
        Button b6= new Button("6");
        super.add(b1);
        super.add(b2);
        super.add(b3);
        super.add(b4);
        super.add(b5);
        super.add(b6);

        super.setLayout(new FlowLayout(FlowLayout.CENTER));
        super.setSize(200,200);
        super.setVisible(true);
    }
}

public class FlowLayoutdemo{

   
    public static void main(String[] args) {
        FrameClass f=new FrameClass();
        f.init();
    }
}
