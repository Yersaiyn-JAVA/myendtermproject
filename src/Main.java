import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Main extends Component {
    public void Login(java.awt.event.ActionEvent ex) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Label txtuser = null;
        Label txtpass = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:8889/ExamManagementSystem", "root", "root");
            System.out.println("Database Connection Success");
            String query = "SELECT * FROM 'login' WHERE id = ? and username = ? and password = ?";
            pst = con.prepareStatement(query);

            pst.setString(1, txtuser.getText());
            pst.setString(2, txtpass.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "You are loginned as" + rs.getString("usertype"));
            }
        } catch(SQLException e){
            System.out.println(e);
        } catch(ClassNotFoundException e){
            System.out.println(e);
        }
        /*JFrame frame = new JFrame();// create new frame
        frame.setTitle("QUIZ");//title of frame
        frame.setSize(1377, 786);//make size
        frame.setVisible(true);//make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setResizable(false);//set resize
//        ImageIcon image =new ImageIcon("logo.png");//create png
//        frame.setIconImage(image.getImage());// change logo
        frame.getContentPane().setBackground(new Color(123,50,250));//change color background
*/
//        MyFrame myFrame = new MyFrame();
    }
    public static void main(String[] args){

    }
}
