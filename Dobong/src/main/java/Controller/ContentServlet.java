package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Beans.NoticeBean;
import DAO.NoticeDAO;
import javax.servlet.http.*;

/**
 * Servlet implementation class ContentServlet
 */
@WebServlet("/Content.do")
public class ContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");//문제는 결국 넘버다.
		int num = Integer.parseInt(request.getParameter("number"));
		NoticeDAO notice = NoticeDAO.getInstance();
		NoticeBean nb = notice.getPost(num);
		nb.getNickname();
		nb.getTitle();
		nb.getWritingtime();
		nb.getContent();
		nb.getWritingtime();
		response.sendRedirect("readNotice.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
