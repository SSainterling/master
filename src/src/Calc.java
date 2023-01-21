import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class calculator extends JFrame implements ActionListener {
    static JFrame f;

    static JTextField l;

    String s0, s1, s2;

    calculator()
    {
        s0 = s1 = s2 = "";
    }

    public static void main(String args[])
    {
        // create a frame
        f = new JFrame("calculator");

        try {

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

        calculator c = new calculator();

        l = new JTextField(16);

        l.setEditable(false);

        JButton bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, add, sub, div, mul, dec, clr, del, eq;

        bt0 = new JButton("0");
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        bt6 = new JButton("6");
        bt7 = new JButton("7");
        bt8 = new JButton("8");
        bt9 = new JButton("9");
        eq = new JButton("=");
        add = new JButton("+");
        sub = new JButton("-");
        div = new JButton("/");
        mul = new JButton("*");
        clr = new JButton("C");
        dec = new JButton(".");
        del = new JButton("Delete");
        JPanel p = new JPanel();

        l.setBounds(30,40,280,30);
        bt7.setBounds(40,100,50,40);
        bt8.setBounds(110,100,50,40);
        bt9.setBounds(180,100,50,40);
        div.setBounds(250,100,50,40);
        bt4.setBounds(40,170,50,40);
        bt5.setBounds(110,170,50,40);
        bt6.setBounds(180,170,50,40);
        mul.setBounds(250,170,50,40);
        bt1.setBounds(40,240,50,40);
        bt2.setBounds(110,240,50,40);
        bt3.setBounds(180,240,50,40);
        sub.setBounds(250,240,50,40);
        dec.setBounds(40,310,50,40);
        bt0.setBounds(110,310,50,40);
        eq.setBounds(180,310,50,40);
        add.setBounds(250,310,50,40);
        del.setBounds(60,380,100,40);
        clr.setBounds(180,380,100,40);

        mul.addActionListener(c);
        div.addActionListener(c);
        sub.addActionListener(c);
        add.addActionListener(c);
        bt9.addActionListener(c);
        bt8.addActionListener(c);
        bt7.addActionListener(c);
        bt6.addActionListener(c);
        bt5.addActionListener(c);
        bt4.addActionListener(c);
        bt3.addActionListener(c);
        bt2.addActionListener(c);
        bt1.addActionListener(c);
        bt0.addActionListener(c);
        dec.addActionListener(c);
        clr.addActionListener(c);
        eq.addActionListener(c);
        del.addActionListener(c);


        p.add(l);
        p.add(add);
        p.add(bt1);
        p.add(bt2);
        p.add(bt3);
        p.add(sub);
        p.add(bt4);
        p.add(bt5);
        p.add(bt6);
        p.add(mul);
        p.add(bt7);
        p.add(bt8);
        p.add(bt9);
        p.add(div);
        p.add(dec);
        p.add(bt0);
        p.add(clr);
        p.add(eq);
        p.add(del);


        f.add(p);
        f.setSize(350, 500);
        f.setResizable(false);
        f.show();
        f.setLayout(null);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {

            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {

            s0 = s1 = s2 = "";
            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=') {

            double te;
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
            l.setText(s0 + s1 + s2 + "=" + te);
            s0 = Double.toString(te);

            s1 = s2 = "";
        }
        else {

            if (s1.equals("") || s2.equals(""))
                s1 = s;

            else {
                double te;
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                s0 = Double.toString(te);

                s1 = s;

                s2 = "";
            }
            l.setText(s0 + s1 + s2);
        }
    }
}
