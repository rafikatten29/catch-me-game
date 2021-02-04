import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class CatchMe extends JFrame {

	private JPanel panel;
	private JButton a;
	private JButton b;
	private JButton c;
	private JButton d;
	private JButton e;
	private JButton f;
	private JButton g;
	private JButton h;
	private JButton i;
	private final static int WINDOW_WIDTH = 400;
	private final static int WINDOW_HEIGHT = 300;

	public CatchMe () {

		setTitle("Catch me if you can!");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}

	private void buildPanel () {

		a = new JButton();
		b = new JButton();
		c = new JButton();
		d = new JButton();
		e = new JButton();
		f = new JButton();
		g = new JButton();
		h = new JButton();
		i = new JButton();

		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(d);
		panel.add(e);
		panel.add(f);
		panel.add(g);
		panel.add(h);
		panel.add(i);

		a.addMouseListener(new MouseAdapter () {
			public void mouseEntered (MouseEvent event) {
				if (a.getText().equals("Click Me")) {
					a.setText("");
					repaint(0);
				}
			}
		});		
		b.addMouseListener(new MouseAdapter () {
			public void mouseEntered (MouseEvent event) {
				if (b.getText().equals("Click Me")) {
					b.setText("");
					repaint(1);
				}
			}
		});
		c.addMouseListener(new MouseAdapter () {
			public void mouseEntered (MouseEvent event) {
				if (c.getText().equals("Click Me")) {
					c.setText("");
					repaint(2);
				}
			}
		});
		d.addMouseListener(new MouseAdapter () {
			public void mouseEntered (MouseEvent event) {
				if (d.getText().equals("Click Me")) {
					d.setText("");
					repaint(3);
				}
			}
		});
		e.addMouseListener(new MouseAdapter () {
			public void mouseEntered (MouseEvent event) {
				if (e.getText().equals("Click Me")) {
					e.setText("");
					repaint(4);
				}
			}
		});
		f.addMouseListener(new MouseAdapter () {
			public void mouseEntered (MouseEvent event) {
				if (f.getText().equals("Click Me")) {
					f.setText("");
					repaint(5);
				}
			}
		});
		g.addMouseListener(new MouseAdapter () {
			public void mouseEntered (MouseEvent event) {
				if (g.getText().equals("Click Me")) {
					g.setText("");
					repaint(6);
				}
			}
		});
		h.addMouseListener(new MouseAdapter () {
			public void mouseEntered (MouseEvent event) {
				if (h.getText().equals("Click Me")) {
					h.setText("");
					repaint(7);
				}
			}
		});
		i.addMouseListener(new MouseAdapter () {
			public void mouseEntered (MouseEvent event) {
				if (i.getText().equals("Click Me")) {
					i.setText("");
					repaint(8);
				}
			}
		});
		
		repaint(10);
	}

	public void repaint(int num) {

		Random randomNum = new Random ();
		int y = 0;
		do {
			y = randomNum.nextInt(9);
		} while (num == y);

		if (y == 0)
			a.setText("Click Me");
		else if (y == 1)
			b.setText("Click Me");
		else if (y == 2)
			c.setText("Click Me");
		else if (y == 3)
			d.setText("Click Me");
		else if (y == 4)
			e.setText("Click Me");
		else if (y == 5)
			f.setText("Click Me");
		else if (y == 6)
			g.setText("Click Me");
		else if (y == 7)
			h.setText("Click Me");
		else if (y == 8)
			i.setText("Click Me");

	}
	
	public static void main (String[] args) {

		new CatchMe();
		
	}
}

		

		
		

		



