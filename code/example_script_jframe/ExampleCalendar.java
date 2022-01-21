import javax.swing.JFrame;

public class ExampleCalendar
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("FrameDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}