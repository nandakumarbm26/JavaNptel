package awtProgramming;

import java.awt.*;


class FrameClass1 extends Frame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public FrameClass1(){
        super("FlowLayoutProgram");
    }

    public void init1(){
        Button b1= new Button("NORTH");
        Button b2= new Button("SOUTH");
        Button b3= new Button("EAST");
        Button b4= new Button("WEST");
        Button b5= new Button("CENTER");
        
        super.add(b1,BorderLayout.NORTH);
        super.add(b2,BorderLayout.SOUTH);
        super.add(b3,BorderLayout.EAST);
        super.add(b4,BorderLayout.WEST);
        super.add(b5,BorderLayout.CENTER);
        

      
        super.setSize(200,200);
        super.setVisible(true);
    }
}
public class BorderLayoutDemo {
    public static void main(String[] args) {
        FrameClass1 f= new FrameClass1();
        f.init1();
    }
    

}
