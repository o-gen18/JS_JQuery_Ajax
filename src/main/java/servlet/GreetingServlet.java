package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GreetingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
        String text = req.getParameter("text");
        String json = "{\"text\":\"" + text + "\"}";
        PrintWriter writer = new PrintWriter(resp.getOutputStream());
        writer.println(json);
        writer.flush();
    }
}
