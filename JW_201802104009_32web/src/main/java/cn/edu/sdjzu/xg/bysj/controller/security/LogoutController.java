package cn.edu.sdjzu.xg.bysj.controller.security;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logout")
public class LogoutController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session  = request.getSession();
        if (session!=null){
            session.invalidate();
        }
//        session.invalidate();
//        //返回登陆页面，提醒用户信息
//        request.setAttribute("msg","您已经安全退出");
//        request.getRequestDispatcher("/WEB-INF/pages/login/login.jsp").forward(request,response);
   }
}
