import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
			PrintWriter out = response.getWriter()
            int add,sub;
            int x,y;
            String a = request.getParameter("num1");
            String b = request.getParameter("num2");
            x = Integer.parseInt(a);
            y = Integer.parseInt(b);
            add = x + y;
			sub = x - y;
			
            out.println("The add is" + add);
			out.println("The sub is" + sub);
        }catch (Exception e){
			e.printStackTrace;
		}
    }
}