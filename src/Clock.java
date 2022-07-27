import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock extends JFrame {
    static Calendar calendar;
    static SimpleDateFormat timeFormat;
    static SimpleDateFormat dayFormat;
    static JLabel timeLabel;
    static JLabel dayLabel;
    static String time;
    static String day;
    Clock(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Đồng Hồ Vớ Vẩn");
        this.setLayout(new FlowLayout());
        this.setSize(350,180);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        timeFormat=new SimpleDateFormat("hh:mm:ss a");
        timeLabel=new JLabel();
        timeLabel.setFont(new Font("Arial",Font.PLAIN,58));
        timeLabel.setForeground(Color.lightGray);
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayFormat=new SimpleDateFormat("E d-M-y");
        dayLabel.setFont(new Font("Ink Free",Font.PLAIN,40));

        this.add(timeLabel);
        this.add(dayLabel);
        this.setVisible(true);
        setTime();
    }

    public static void setTime()
    {
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);
            try{ Thread.sleep(1000);}
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
