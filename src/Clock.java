import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock extends JFrame {
    static Calendar calendar;
    static SimpleDateFormat timeFormat;
    static JLabel timeLabel;
    static String time;
    Clock(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Cof's Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        timeFormat=new SimpleDateFormat("hh:mm:ss a");
        timeLabel=new JLabel();

        this.add(timeLabel);
        this.setVisible(true);
        setTime();
    }

    public static void setTime()
    {
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            try{ Thread.sleep(1000);}
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
