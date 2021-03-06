package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ModifyServlet extends HttpServlet {

	// 'MODIFY'버튼을 누를 경우 호출.
	// 방명록 변경 인터페이스를 제공
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter(); // response객체의 출력 버퍼 로드
		
		out.println("<html><head><title>Modify</title></head>");
		out.println("<body><h1>방명록 수정</h1>");
		out.println("<p><form action='update' method='post'>"); // 동일 서블릿(ModifyServlet)의 doPost()호출
		out.println("<input type='text' name='num' value='" + request.getParameter("num") + "' hidden>");
		out.println("<input type='text' name='pwd' value='" + request.getParameter("pwd") + "' hidden>");
		out.println("PASSWORD<br>");
		out.println("<input type='password' name='inputpwd' required><br>");
		out.println("your comment<br>");
		out.println("<textarea name='content' cols='80' rows='5'></textarea><br>");
		out.println("<input type='submit' value='MODIFY'>");
		out.println("</form></p>");
		
	}
}
