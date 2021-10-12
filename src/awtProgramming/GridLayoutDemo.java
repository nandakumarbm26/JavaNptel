package awtProgramming;


import java.awt.*;


class FrameClass2 extends Frame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public FrameClass2(){
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

        super.setLayout(new GridLayout(2,3));
        super.setSize(200,200);
        super.setVisible(true);
    }
}
public class GridLayoutDemo {
    public static void main(String[] args) {
        FrameClass2 f=new FrameClass2();
        f.init();
    }
}
