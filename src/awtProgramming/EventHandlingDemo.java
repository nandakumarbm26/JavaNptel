package awtProgramming;

import java.awt.*;

import java.awt.event.*;


public class EventHandlingDemo extends Frame implements MouseListener{
        /**
     *
     */
    private static final long serialVersionUID = 2819795367913688035L;
        Label l;

        EventHandlingDemo(){
            addMouseListener(this);
            l=new Label();
            l.setBounds(20,50,100,20);
            add(l);
            setSize(300,300);
            setLayout(null);
            setVisible(true);
        }


        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            l.setText("Mouse Clicked");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            l.setText("MousePressed");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            l.setText("MouseReleased");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            l.setText("mouseEntered");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            l.setText("MouseExited");
        }

        public static void main(String[] args) {
            new EventHandlingDemo();
        }
}

