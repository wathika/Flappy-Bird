package flappyBird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBird implements ActionListener{
	
	public static FlappyBird flappyBird;
	
	public final int WIDTH = 500, HEIGHT = 700;
	
	public Render render;
	
	public Rectangle bird;
		
	public FlappyBird(){
		JFrame jframe = new JFrame();
		Timer timer = new Timer(20, this);
		
		render = new Render();
		
		jframe.add(render);
		jframe.setTitle("Flappy Bird");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setResizable(false);
		jframe.setVisible(true);
		
		bird = new Rectangle(WIDTH/ 2-10, HEIGHT / 2-10, 20, 20);
		
		timer.start();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		render.repaint();
		
	}
	
	public void repaint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.cyan);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		g.setColor(Color.orange);
		g.fillRect(0, HEIGHT-180, WIDTH, 180);
		
		g.setColor(Color.green);
		g.fillRect(0, HEIGHT-180, WIDTH, 20);
		
		g.setColor(Color.red);
		g.fillRect(bird.x, bird.y, bird.width, bird.height);
		
	}

	
	public static void main(String[] args){
		flappyBird = new FlappyBird();
	}
	
	
}
