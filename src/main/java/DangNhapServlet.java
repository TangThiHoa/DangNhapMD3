import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DangNhapServlet", urlPatterns = "/DangNhap")
public class DangNhapServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String user = request.getParameter("user");
//        String pass = request.getParameter("pass");
//        PrintWriter printWriter = response.getWriter();
//        if (user.equals("Admin") && pass.equals("12345")){
//            printWriter.print("Helo boss");
//        }else {
//            printWriter.print("Vui lòng nhập lại ");
//        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        PrintWriter printWriter = response.getWriter();

        if (user.equals("Admin") && pass.equals("12345")){
            printWriter.print("<html>"+"Hello boss"+ "</html>");
        }else {
            printWriter.print("<html>"+"Vui lòng nhập lại "+ "</html>");
        }
    }
}
